package com.whq.controller;

import com.whq.domain.TestJavaBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author: wanghuanqing
 * @date: Create in 2019/5/7 20:42
 * @desc:
 */
@RestController
//对类的说明
@Api(value = "Hello Spring Boot", description = "swagger测试！")
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    //此注解是对方法的描述
    @ApiOperation(value = "@ApiOperation注解" , notes = "测试@ApiOperation注解")
    /*
    * paramType 指定参数放在哪个地方
    *    header：请求参数放置于Request Header，使用@RequestHeader获取
    *    query：请求参数放置于请求地址，使用@RequestParam获取
    *    path：（用于restful接口）-->请求参数的获取：@PathVariable
    *    body：（不常用）
    *    form（不常用）
    * name 参数名
    * value 说明参数的意思
    * dataType 输入参数的数据类型
    * required 是否必填
    * defaultValue 默认值
    * */
    @ApiImplicitParam(paramType = "query", name = "something", value = "测试入参",
            dataType = "String", required = false, defaultValue = "")
    public String say(@RequestParam String something) {
        return "Hello Spring Boot!" + something;
    }

    //以下方法参数多个，测试@ApiImplicitParams注解
    //@RequestMapping注解中不指定访问方式，swagger认为以下七种请求方式均可，会在ui页面上生成七次此接口
    //七种方式：delete、get、put、post、head、options、patch
    @RequestMapping(value = "/swaggerTest")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "姓名" , name = "name" ,dataType = "String"),
            @ApiImplicitParam(value = "年龄" , name = "age" ,dataType = "int"),
            @ApiImplicitParam(value = "其他" , name = "num" , dataType = "int")
    })
    @ApiOperation(value = "@ApiImplicitparams注解" ,notes = "测试@ApiImplicitparams注解")
    public String say2(@RequestParam String name ,@RequestParam int age , @RequestParam Integer num){
        return name + age + num;
    }
    @ApiOperation(value = "测试对象传入参数接口", notes = "Model测试")
    @RequestMapping(value = "/swaggerModelTest" , method = RequestMethod.POST)
    //对象传值的时候swagger采用的是json传值，因此需要采用@RequestBody注解来接收参数，如果是其他方式
    //form或者URL提交的时候需要删除@RequestBody注解,同时@RequestBody注解不适用于GET方法
    public String say3(@RequestBody TestJavaBean testJavaBean){
        return testJavaBean.getName()+testJavaBean.getAge()+testJavaBean.getNum();
    }
}
