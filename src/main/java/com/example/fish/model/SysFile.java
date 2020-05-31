package com.example.fish.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@ApiModel(description="文件")
@Entity
@Table(name = "sys_file")
@EqualsAndHashCode
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class SysFile {

    @ApiModelProperty(value="file_id")
    @Column(name = "file_id", length = 32)
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String fileId;

    @ApiModelProperty(value="文件名")
    @Column(name = "file_name", length = 50)
    private String fileName;

    @ApiModelProperty(value="文件类型")
    @Column(name = "file_type", length = 100)
    private String fileType;

    @ApiModelProperty(value="文件大小")
    @Column(name = "file_size", length = 10)
    private Integer fileSize;

    @ApiModelProperty(value="文件地址")
    @Column(name = "file_url", length = 100)
    private String fileUrl;

    @ApiModelProperty(value="所属用户")
    @Column(name = "user_id", length = 50)
    private String userId;

    @ApiModelProperty(value="文件描述")
    @Column(name = "file_desc", length = 500)
    private String fileDesc;

    @ApiModelProperty(value="创建时间")
    @Column(name = "create_time", length = 20)
    private String createTime;

    @ApiModelProperty(value="创建人")
    @Column(name = "create_user", length = 50)
    private String createUser;
}
