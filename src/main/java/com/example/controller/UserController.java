package com.example.controller;

import com.example.entity.Pr_User;
import com.example.entity.User;
import com.example.service.Pr_UserService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@ComponentScan(basePackages = {"com.example"})
public class UserController {

    @Autowired private UserService userService;
    @Autowired private Pr_UserService pr_userService;

//    跳转到登录1
    @RequestMapping("/")
    public String goToLogin1(){
        return "userLogin/login";
    }
    //    跳转到登录2
    @RequestMapping("login")
    public String goToLogin2(){
        return "userLogin/login";
    }
    //    跳转到登录3
    @RequestMapping("userLogin/login")
    public String goToLogin3(){
        return "userLogin/login";
    }
    //    跳转到登录4
    @RequestMapping("userLogin/toLogin")
    public String goToLogin4(){
        return "userLogin/login";
    }
/*//    跳转到主页
    @RequestMapping("/toIndex")
    public String goToIndex(Model model){
        List<User> users = userService.findByAll();
        model.addAttribute("users", users);
        return "userList";
    }*/
    //查询所有user数据
    @RequestMapping("userLogin/findByAll")
    public String index(Model model) {
        List<User> list = userService.findByAll();
        model.addAttribute("users", list);
        return "userLogin/userList";
    }
    //默认访问list页面
    @RequestMapping("userLogin/userList")
    public String list(Model model) {
        List<User> users = userService.findByAll();
        model.addAttribute("users", users);
        return "userLogin/userList";
    }
    //保存user数据
    @RequestMapping("userLogin/toAdd")
    public String toAdd() {
        return "userLogin/userAdd";
    }
    @RequestMapping("userLogin/add")
    public String add(User user) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        // new Date()为获取当前系统时间
        Timestamp ts=Timestamp.valueOf(df.format(new Date()));
        user.setCreateTime(ts);
        System.out.println(df.format(new Date()));
        userService.saveUser(user);
        return "redirect:/userLogin/userList";
    }
    //修改user数据
    @RequestMapping("userLogin/toEdit")
    public String toEdit(Model model, Integer userid) {
        User user = userService.findUserById(userid);
        model.addAttribute("user", user);
        return "userLogin/userEdit";
    }
    @RequestMapping("userLogin/edit")
    //@ResponseBody
    public String edit(User user) {
        userService.updateUser(user);
        return "redirect:/userLogin/userList";
    }
    //删除user数据
    @RequestMapping("userLogin/delete")
    public String delete(Integer userid) {
        userService.deleteUser(userid);
        System.out.println(userid);
        return "redirect:/userLogin/userList";
    }
    //登录
//    @RequestMapping(value = "/",method = RequestMethod.POST)
    @RequestMapping("userLogin/loginIn")
    public String loginIn(Model model,String username, String password,
    String pr_username,String pr_password,HttpServletRequest request,HttpSession session)
    {
        if ( (username!=null && password!=null) && ( !("".equals(username)) && !("".equals(password)) ) ){
            System.out.println("username:"+ username);
            System.out.println("password:"+password);
            User userLogin = userService.loginIn(username, password);
            model.addAttribute("userLogin", userLogin);

            session=request.getSession();
            session.setAttribute("username",userLogin.getUsername());
            session.setAttribute("userid",userLogin.getUserid());
            System.out.println("session里的userid:"+ session.getAttribute("userid"));
            return "userLogin/loginSuccess";

        }else if ( (pr_username!=null && pr_password!=null) && ( !("".equals(pr_username)) && !("".equals(pr_password)) ) ){
            System.out.println("pr_username:"+pr_username);
            System.out.println("pr_password"+pr_password);
            Pr_User pr_login = pr_userService.pr_login(pr_username,pr_password);
            model.addAttribute("pr_login",pr_login);

            session=request.getSession();
            session.setAttribute("pr_username", pr_login.getPr_username());
            session.setAttribute("pr_userid", pr_login.getPr_password());
            System.out.println("session里的pr_userid"+ session.getAttribute("pr_userid"));
            return "prUser/loginSuccess";

        }else {
            return "userLogin/loginFailed";
        }
    }

    //传递已登录用户信息
    @RequestMapping("toIndex")
    public String passUser(Model model, Integer userid){
        User user = userService.findUserById(userid);
        model.addAttribute("user", user);
        System.out.println("toIndex  userid is "+userid);
        return "Index";
    }
    @RequestMapping("userLogin/loginSuccess")
    public String loginSuccess(Model model,Integer userid){
        User user = userService.findUserById(userid);
        model.addAttribute("user", user);
        System.out.println("loginSuccess  userid  "+userid);
        return "userLogin/loginSuccess";
    }
}
