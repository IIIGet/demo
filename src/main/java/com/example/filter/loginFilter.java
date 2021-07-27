package com.example.filter; /**
 * @Author LJM
 * @Date 2021/7/22 20:05
 * @Version 1.0
 */

import org.springframework.stereotype.Component;

import javax.annotation.security.RolesAllowed;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter(filterName = "loginFilter",urlPatterns = "/*")
public class loginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpSession session = request1.getSession();
        String path = request1.getRequestURI();
        Integer userid =(Integer) session.getAttribute("userid");
        Integer pr_userid =(Integer) session.getAttribute("pr_userid");

        if (path.indexOf("login")!=-1 || path.equals("/")){
            //实现登录界面不过滤
            System.out.println("已在登录界面");
            chain.doFilter(request, response);
        }
        else if (userid!=null && !("".equals(userid)) ){
            //避免空指针
            System.out.println("已登录的用户id"+session.getAttribute("userid"));
            chain.doFilter(request, response);
        }else if ( (pr_userid!=null && !("".equals(pr_userid)))){
            System.out.println("已登录的管理员id"+session.getAttribute("pr_userid"));
            chain.doFilter(request, response);
        }
        else{
            System.out.println("未登录");
            HttpServletResponse response1=(HttpServletResponse)response;
            response1.sendRedirect("userLogin/login");
        }
    }
}
