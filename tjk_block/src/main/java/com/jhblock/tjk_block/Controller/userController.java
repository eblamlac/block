package com.jhblock.tjk_block.Controller;
import com.jhblock.tjk_block.dao.DoorMapper;
import com.jhblock.tjk_block.mailConfig.mailConfig;
import com.jhblock.tjk_block.pojo.Door;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.List;

@Controller
public class userController {
    @Autowired
    private com.jhblock.tjk_block.dao.DoorMapper DoorMapper;
    @RequestMapping(value="/userlogin",method = RequestMethod.POST)
    public void testssm(HttpServletRequest request, HttpServletResponse res)throws Exception{
        List<Door> list = DoorMapper.finduser(request.getParameter("username"));
        for(Door test : list){
            if(test.getPassword().equals(request.getParameter("password"))){
                System.out.println("登陆成功");
                res.setHeader("content-type", "text/html;charset=UTF-8");
                res.getWriter().println("1");
            }else{
                System.out.println("登陆失败");
                res.getWriter().println("-1");
            }
        }
    }
    @RequestMapping(value="sendmail",method = RequestMethod.POST)
    public void yzm(HttpServletRequest request,HttpServletResponse res) throws IOException {
        try {
            System.out.println(request.getParameter("username"));
            mailConfig mail = new mailConfig();
            mail.setUser(request.getParameter("username"));
            mail.setSendmail();
            res.getWriter().println(mail.getYzm());
        }catch(Exception e){
            res.getWriter().println("-1");
            e.printStackTrace();
        }
        }
@RequestMapping(value="/useregist",method = RequestMethod.POST)
    public void regiest(HttpServletRequest request,HttpServletResponse res)throws Exception{
    List<Door> list = DoorMapper.finduser(request.getParameter("username"));
    List<Door> listemail = DoorMapper.findemail(request.getParameter("email"));
    if(list.size()>0){
        res.getWriter().println("-1");
        return;
    }
    if(listemail.size()>2){
        res.getWriter().println("-2");
        return;
    }
    DoorMapper.userinsert(request.getParameter("username"),request.getParameter("password"),request.getParameter("email"));
    res.getWriter().println("1");
    }
}
