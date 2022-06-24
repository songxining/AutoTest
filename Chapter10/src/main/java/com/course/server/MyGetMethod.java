package com.course.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Api(value = "/",description = "all get Method")
public class MyGetMethod {

    @RequestMapping(value="/getCookies",method = RequestMethod.GET)
    @ApiOperation(value="获取cookie信息",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "恭喜你获得cookies成功";
    }

    /**
     * 需要携带cookie信息才能访问
     * @param request
     * @return
     */
    @RequestMapping("/get/with/cookies")
    @ApiOperation(value="携带cookie信息访问",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){

        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "必须携带cookie进行访问";
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                    return "访问成功";
            }
        }
        return "必须携带cookie访问";
    }

    /**
     * 一个需要携带参数才能访问的请求
     */

    @RequestMapping("/get/with/param")
    @ApiOperation(value="携带参数访问",httpMethod = "GET")
    public Map<String,Integer> getWithParam(@RequestParam Integer start,@RequestParam Integer end){

        Map myList = new HashMap();

        myList.put("Nike",899);
        myList.put("adidas",699);
        myList.put("YEZZ",1999);
        return myList;
    }

    @RequestMapping("/get/with/param/{start}/{end}")
    @ApiOperation(value="have a param",httpMethod = "GET")
    public Map<String,Integer> getWithParamTwo(@PathVariable Integer start,@PathVariable Integer end){

        Map myList = new HashMap();
        myList.put("adidas",999);
        myList.put("Nike",1899);
        myList.put("new balens",899);
        return myList;
    }

}
