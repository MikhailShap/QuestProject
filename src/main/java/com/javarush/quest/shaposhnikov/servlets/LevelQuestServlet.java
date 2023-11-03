package com.javarush.quest.shaposhnikov.servlets;

import com.javarush.quest.shaposhnikov.Levels.LevelQuest;
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
public class LevelQuestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/Basic.jsp");
        String choice = req.getParameter("choice");
        if (StringUtils.isEmpty(choice)) {
            requestDispatcher.forward(req, resp);
        }else {
            LevelQuest level = (LevelQuest) session.getAttribute("Level");

            LevelQuest nextLevel = level.getNextLevel(choice);
            session.setAttribute("Level", nextLevel);

            requestDispatcher.forward(req, resp);
        }
    }

}
