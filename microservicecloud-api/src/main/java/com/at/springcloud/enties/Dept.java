package com.at.springcloud.enties;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 部门实体类
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式赋值
public class Dept implements Serializable {

    private static final long serialVersionUID = -3728376625350294355L;
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 哪个数据库
     */
    private String dbSource;
}
