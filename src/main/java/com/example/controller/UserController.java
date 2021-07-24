package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;




//    跳转到登录1
    @RequestMapping("/")
    public String goToLogin1(){
        return "login";
    }
    //    跳转到登录2
    @RequestMapping("/login")
    public String goToLogin2(){
        return "login";
    }
    //    跳转到登录3
    @RequestMapping("/toLogin")
    public String goToLogin3(){
        return "login";
    }
/*//    跳转到主页
    @RequestMapping("/toIndex")
    public String goToIndex(Model model){
        List<User> users = userService.findByAll();
        model.addAttribute("users", users);
        return "userList";
    }*/
    //查询所有user数据
    @RequestMapping("/findByAll")
    public String index(Model model) {
        List<User> list = userService.findByAll();
        model.addAttribute("users", list);
        return "userList";
    }
    //默认访问list页面
    @RequestMapping("/userList")
    public String list(Model model) {
        List<User> users = userService.findByAll();
        model.addAttribute("users", users);
        return "userList";
    }
    //保存user数据
    @RequestMapping("/toAdd")
    public String toAdd() {
        return "userAdd";
    }
    @RequestMapping("/add")
    public String add(User user) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        // new Date()为获取当前系统时间
        Timestamp ts=Timestamp.valueOf(df.format(new Date()));
        user.setCreateTime(ts);
        System.out.println(df.format(new Date()));
        userService.saveUser(user);
        return "redirect:/userList";
    }
    //修改user数据
    @RequestMapping("/toEdit")
    public String toEdit(Model model, Integer userid) {
        User user = userService.findUserById(userid);
        model.addAttribute("user", user);
        return "userEdit";
    }
    @RequestMapping("/edit")
    //@ResponseBody
    public String edit(User user) {
        userService.updateUser(user);
        return "redirect:/userList";
    }
    //删除user数据
    @RequestMapping("/delete")
    public String delete(Integer userid) {
        userService.deleteUser(userid);
        System.out.println(userid);
        return "redirect:/userList";
    }
    //登录
//    @RequestMapping(value = "/",method = RequestMethod.POST)
    @RequestMapping("/loginIn")
    public String loginIn(Model model, String username, String password,HttpServletRequest request,HttpSession session){
        HttpServletResponse response;
        User userLogin = userService.loginIn(username, password);
        model.addAttribute("userLogin", userLogin);
        if (userLogin != null){
            session=request.getSession();
            session.setAttribute("username",userLogin.getUsername());
            session.setAttribute("userid",userLogin.getUserid());
            System.out.println("session里的userid"+ session.getAttribute("userid"));
            return "loginSuccess";
        }else {
            return "loginFailed";
        }
    }

    //传递已登录用户信息
    @RequestMapping("/toIndex")
    public String passUser(Model model, Integer userid){
        User user = userService.findUserById(userid);
        model.addAttribute("user", user);
        System.out.println("toIndex  userid is "+userid);
        return "Index";
    }
    @RequestMapping("/loginSuccess")
    public String loginSuccess(Model model,Integer userid){
        User user = userService.findUserById(userid);
        model.addAttribute("user", user);
        System.out.println("loginSuccess  userid  "+userid);
        return "loginSuccess";
    }
}
