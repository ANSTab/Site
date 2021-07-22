/*
package com.tabachenko.demo.config;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletExample  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        String s = req.getParameter("username");
        System.out.println(s);
        Document document = Jsoup.connect("http://localhost:8082/home").get();
        Element element = document.getElementById("qwertyId");
        Elements element1 =document.getElementsByAttributeValue("class", "qwerty");
        System.out.println(element1);
        System.out.println(element);
    }
}
*/
