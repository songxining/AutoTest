package com.course.server;

import com.course.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "/", description = "这是全部的post请求")
@RequestMapping("/v1")
public class MyPostMethod {

    //用来装cookie信息
    private static Cookie cookie;

    //用户登陆成功，获取到cookies，然后获取列表
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登陆接口，成功获取cookie信息", httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName", required = true) String username,
                        @RequestParam(value = "password", required = true) String password) {
        if (username.equals("zhangsan") && password.equals("123456")) {
            //创建cookie信息
            Cookie cookie = new Cookie("login", "true");
            response.addCookie(cookie);
            return "恭喜你登陆成功了";
        }
        return "用户名或密码错误";
    }

    //获取用户列表
    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                              @RequestBody User u) {
        User user;
        //get cookies
        Cookie[] cookies = request.getCookies();
        //yanzhen
        for (Cookie c : cookies) {
            if (c.getName().equals("login") &&
                    c.getValue().equals("true") &&
                    u.getUserName().equals("zhangsan") &&
                    u.getPassword().equals("123456")) {
                user = new User();
                user.setName("lisi");
                user.setAge("16");
                user.setSex("man");
                return user.toString();
            }
        }
        return "参数不合法；";
    }
}
