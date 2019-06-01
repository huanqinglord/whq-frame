package com.whq.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: wanghuanqing
 * @date: Create in 2019/6/1 16:49
 * @desc: 测试用javaBean
 */
@ApiModel(value = "TestJavaBean测试实体类", description = "测试swagger新加实体类")
public class TestJavaBean {
    @ApiModelProperty(value = "姓名", name = "name", dataType = "String",
            required = false, notes = "关于姓名的描述！")
    private String name;
    @ApiModelProperty(value = "年龄" , name = "age" ,dataType = "int")
    private int age;
    @ApiModelProperty(value = "其他" , name ="num" , dataType = "Integer")
    private Integer num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
