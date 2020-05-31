package com.example.fish.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@ApiModel(description="用户")
@Entity
@Table(name = "sys_user")
@EqualsAndHashCode
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class SysUser {

    @ApiModelProperty(value="user_id")
    @Column(name = "user_id")
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String userId;

    @ApiModelProperty(value="姓名")
    @Column(name = "user_name")
    private String userName;

    @ApiModelProperty(value="角色id")
    @Column(name = "role_id", length = 500)
    private String roleId;

    @ApiModelProperty(value="电话")
    @Column(name = "user_iphone", length = 500)
    private String userIphone;

    @ApiModelProperty(value="性别")
    @Column(name = "user_sex", length = 500)
    private String userSex;

    @ApiModelProperty(value="账号")
    @Column(name = "user_account", length = 500)
    private String userAccount;

    @ApiModelProperty(value="密码")
    @Column(name = "user_password", length = 500)
    private String userPassword;

    @ApiModelProperty(value="付款码")
    @Column(name = "user_alipay_qr", length = 500)
    private String userAlipayQr;

    @ApiModelProperty(value="龙珠")
    @Column(name = "user_dragon_ball", length = 500)
    private String userDragonBall;

    @ApiModelProperty(value="用户状态")
    @Column(name = "user_state", length = 10)
    private String userState;

    @ApiModelProperty(value="创建时间")
    @Column(name = "create_time", length = 20)
    private String createTime;

    @ApiModelProperty(value="创建人")
    @Column(name = "create_user", length = 50)
    private String createUser;

}
