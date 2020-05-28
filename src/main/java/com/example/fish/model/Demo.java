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
@Table(name = "t_demo")
@EqualsAndHashCode
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class Demo {

    @ApiModelProperty(value="id")
    @Column(name = "id")
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    @ApiModelProperty(value="姓名")
    @Column(name = "name")
    private String name;

}
