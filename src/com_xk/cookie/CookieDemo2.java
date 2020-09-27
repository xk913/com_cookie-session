package com_xk.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie快速入门
 *
 * setMaxAge(int seconds)  //将cookie持久化到硬盘，seconds秒后会自动删除cookie文件
 * 2．负数:默认值
 * 3．零∶删除cookie信息
 * $．正数:将Cookie数据写到硬盘的文件中。持久化存储。cookie存活时间。
 */
@WebServlet("/cookieDemo2")
public class CookieDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取Cookie
        Cookie[] cs = request.getCookies();
        //获取数据，遍历Cookies
        if(cs != null){
            for (Cookie c : cs) {
                String  name = c.getName();
                String value = c.getValue();
                System.out.println(name+":"+value);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
