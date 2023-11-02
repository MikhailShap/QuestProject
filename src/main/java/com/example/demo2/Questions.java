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

@WebServlet(name = "Questions", value = "/quest")
public class Questions extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String choice = req.getParameter("choice");
        System.out.println(choice);
        LevelQuest level = (LevelQuest) session.getAttribute("Level");
        System.out.println(level);
        LevelQuest nextLevel = level.getNextLevel(choice);
        session.setAttribute("Level",nextLevel);
        LevelQuest level2 = (LevelQuest) session.getAttribute("Level");
        System.out.println(level2);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/Basic.jsp");
        requestDispatcher.forward(req,resp);
    }
    //TODO: сделать чтобы при ответе без выбора варианта ничего не происходило

}
