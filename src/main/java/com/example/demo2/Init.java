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

@WebServlet(name = "Init", value = "/init")
public class Init extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        HttpSession session = req.getSession(true);
        session.setAttribute("Level",Levels.MAIN_LEVEL);
        session.setAttribute("name",name);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/Basic.jsp");
        requestDispatcher.forward(req,resp);

    }
}