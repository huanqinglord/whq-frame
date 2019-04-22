package com.whq;

import com.whq.dao.UserinfoMapper;
import com.whq.entity.Userinfo;
import com.whq.entity.UserinfoExample;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: wanghuanqing
 * @date: Create in 2019/4/20 9:20
 * @desc: 简单测试springMVC
 */
@Controller
@RequestMapping("/user")
public class LoginAction implements InitializingBean {
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("测试加载！");
    }

    @RequestMapping("/login")
    public String login(@ModelAttribute("a") Users users){
        int i = 0;
        List<Userinfo> userinfoList = new ArrayList<Userinfo>();
        System.out.println("方式2接收到的用户名：" + users.getUsername());
        System.out.println("方式2接收到的密码：" + users.getPassword());
        userinfoList = this.selectUserInfo();
        Iterator<Userinfo> userinfoIterator = userinfoList.iterator();
        while (userinfoIterator.hasNext()){
            ++i;
            Userinfo userinfo = userinfoIterator.next();
            System.out.println("存在的用户名：" + userinfo.getUsername());
            if(i >= 10){
                break;
            }
        }
        System.out.println("Login success!");
        return "success";
    }

    public List<Userinfo> selectUserInfo(){
        UserinfoExample userinfoExample = new UserinfoExample();
        return userinfoMapper.selectByExample(userinfoExample);
    }
}
