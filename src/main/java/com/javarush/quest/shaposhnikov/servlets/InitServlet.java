package com.javarush.quest.shaposhnikov.servlets;

import com.javarush.quest.shaposhnikov.Levels.LevelsQuestLoader;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "Init", value = "/init")
public class InitServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        HttpSession session = req.getSession(true);
        session.setAttribute("Level", LevelsQuestLoader.MAIN_LEVEL);
        session.setAttribute("name", name);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/Basic.jsp");
        if (session.getAttribute("countGame") == null) {
            session.setAttribute("countGame", 1);
            requestDispatcher.forward(req, resp);
        } else {
            int countGame = (int) session.getAttribute("countGame");
            session.setAttribute("countGame", countGame + 1);

            requestDispatcher.forward(req, resp);
        }
    }
}