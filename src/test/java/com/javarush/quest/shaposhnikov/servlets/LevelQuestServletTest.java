package com.javarush.quest.shaposhnikov.servlets;

import com.javarush.quest.shaposhnikov.Levels.LevelQuest;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LevelQuestServletTest {

    @InjectMocks
    LevelQuestServlet levelQuestServlet;
    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;
    @Mock
    HttpSession session;
    @Mock
    RequestDispatcher requestDispatcher;
    @Mock
    LevelQuest levelQuest;

    @BeforeEach
    void setUp() {
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("WEB-INF/Basic.jsp")).thenReturn(requestDispatcher);

    }

    @Test
    void forwardInBasicJspIfChoiceIsEmpty() throws ServletException, IOException {
        when(request.getParameter("choice")).thenReturn(null);

        levelQuestServlet.doPost(request, response);

        verify(request).getRequestDispatcher("WEB-INF/Basic.jsp");
        verify(session, never()).getAttribute("Level");
        verify(requestDispatcher).forward(request, response);
    }

    @Test
    void forwardInBasicJspIfChoiceNotEmpty() throws ServletException, IOException {
        final String ANSWER = "Да";

        when(request.getParameter("choice")).thenReturn(ANSWER);
        when(session.getAttribute("Level")).thenReturn(levelQuest);
        when(levelQuest.getNextLevel(ANSWER)).thenReturn(levelQuest);

        levelQuestServlet.doPost(request, response);

        verify(request).getRequestDispatcher("WEB-INF/Basic.jsp");
        verify(session).setAttribute(eq("Level"), any(LevelQuest.class));
        verify(requestDispatcher).forward(request, response);
    }
}