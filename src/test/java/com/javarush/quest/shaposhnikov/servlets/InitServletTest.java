package com.javarush.quest.shaposhnikov.servlets;

import com.javarush.quest.shaposhnikov.Levels.LevelsQuestLoader;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class InitServletTest {
    @InjectMocks
    InitServlet initServlet;
    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;
    @Mock
    HttpSession session;
    @Mock
    RequestDispatcher requestDispatcher;

    @BeforeEach
    void setUp() {
        when(request.getParameter("name")).thenReturn("TestName");
        when(request.getSession(true)).thenReturn(session);
        when(request.getRequestDispatcher("WEB-INF/Basic.jsp")).thenReturn(requestDispatcher);

    }


    @Test
    void setAttributeCountGameInSessionFirst() throws ServletException, IOException {
        when(session.getAttribute("countGame")).thenReturn(null);

        initServlet.doPost(request, response);

        verify(session).setAttribute("countGame", 1);
    }

    @Test
    void incrementAttributeCountGameInSessionSecond() throws ServletException, IOException {
        when(session.getAttribute("countGame")).thenReturn(1);

        initServlet.doPost(request, response);

        verify(session).setAttribute("countGame", 2);
    }

    @Test
    void forwardInBasicJspWhenCountGameNull() throws ServletException, IOException {
        when(session.getAttribute("countGame")).thenReturn(null);

        initServlet.doPost(request, response);

        verify(request).getRequestDispatcher("WEB-INF/Basic.jsp");
        verify(requestDispatcher).forward(request, response);
    }

    @Test
    void forwardInBasicJspWhenCountGameNotNull() throws ServletException, IOException {
        when(session.getAttribute("countGame")).thenReturn(2);

        initServlet.doPost(request, response);

        verify(request).getRequestDispatcher("WEB-INF/Basic.jsp");
        verify(requestDispatcher).forward(request, response);
    }

}