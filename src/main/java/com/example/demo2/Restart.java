package com.example.demo2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Restart", value = "/restart")
public class Restart extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Enumeration<String> attributeNames = session.getAttributeNames();
        //Удаляем все атрибуты TODO:Додумать
        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            if(StringUtils.equals(attributeName,"countGame")){
                continue;
            }
            session.removeAttribute(attributeName);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req,resp);
    }
}