package com.example.fish.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@ApiModel(description="角色")
@Entity
@Table(name = "sys_role")
@EqualsAndHashCode
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class SysRole {

    @ApiModelProperty(value="role_id")
    @Column(name = "role_id")
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String roleId;

    @ApiModelProperty(value="角色名")
    @Column(name = "role_name")
    private String roleName;

    @ApiModelProperty(value="角色描述")
    @Column(name = "role_desc", length = 500)
    private String roleDesc;

    @ApiModelProperty(value="角色状态")
    @Column(name = "role_state", length = 10)
    private String roleState;

    @ApiModelProperty(value="创建时间")
    @Column(name = "create_time", length = 20)
    private String createTime;

    @ApiModelProperty(value="创建人")
    @Column(name = "create_user", length = 50)
    private String createUser;

}
