package com.example.fish.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@ApiModel(description="实体")
@Entity
@Table(name = "sys_dragon")
@EqualsAndHashCode
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class SysDragon {

    @ApiModelProperty(value="dragon_id")
    @Column(name = "dragon_id")
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String dragonId;

    @ApiModelProperty(value="姓名")
    @Column(name = "dragon_name")
    private String dragonName;

}
