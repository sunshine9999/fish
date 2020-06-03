package com.example.fish.controller;

import com.example.fish.api.SysFileApi;
import com.example.fish.model.SysFile;
import com.example.fish.service.SysFileService;
import com.example.fish.util.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class SysFileController implements SysFileApi {

    @Resource
    private SysFileService sysFileService;
    @Value("${file.wFileUrl}")
    private String wFileUrl;
    @Value("${file.lfileUrl}")
    private String lfileUrl;

    @Override
    public Page<SysFile> getAll(Pageable pageable) {
        try {
            return sysFileService.getAll(pageable);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysFile getById(String id) {
        try {
            return sysFileService.getById(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysFile saveSysFile(SysFile sysFile) {
        try {
            return sysFileService.saveSysFile(sysFile);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delSysFile(String id) {
        try {
            sysFileService.delSysFile(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public ResultData multiUpload(HttpServletRequest request,@RequestParam("files") MultipartFile[] files) {
//        List<MultipartFile> files1 = ((MultipartHttpServletRequest) request).getFiles("files");
//        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//        MultipartFile mf = multipartRequest.getFile("files");
        String filePath = "";
        String os = System.getProperty("os.name");
        if (os.toLowerCase().startsWith("win")) {  //如果是Windows系统
            filePath = wFileUrl;
        } else {  //linux 和mac
            filePath = lfileUrl;
        }
        Date date = new Date();
        System.out.println(date.getTime());
        filePath = filePath + date.getTime() + File.separatorChar;
        ResultData result = new ResultData();
        StringBuffer mess = new StringBuffer();
        String code = "200";
        List<SysFile> fileList = new ArrayList<SysFile>();
        for (int i = 0; i < files.length; i++) {
            MultipartFile file = files[i];
            if (file.isEmpty()) {
                mess.append("上传第" + (i++) + "个文件失败，文件为空，");
                code = "201";
                continue;
            }
            //String fileName = file.getOriginalFilename();
            String fileName = "qhc";//LoginUser.getSessionLoginUser(request).getUserId();
            File dest = new File(filePath + fileName);
            try {
                file.transferTo(dest);
                SysFile sysFile = new SysFile();
                sysFile.setFileName(fileName);
                sysFile.setFileUrl(filePath);
                fileList.add(sysFile);
            } catch (IOException e) {
                e.printStackTrace();
                mess.append("上传第" + (i++) + "个文件失败，文件为空，");
                code = "202";
            }
        }
        result.setData(fileList);
        result.setMess(mess.toString());
        result.setCode(code);
        return result;
    }
}
