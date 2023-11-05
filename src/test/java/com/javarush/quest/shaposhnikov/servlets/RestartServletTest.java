package com.javarush.quest.shaposhnikov.servlets;

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
import java.util.Arrays;
import java.util.Collections;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class RestartServletTest {
    @InjectMocks
    RestartServlet restartServlet;
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
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("index.jsp")).thenReturn(requestDispatcher);
        when(session.getAttributeNames()).thenReturn(Collections.enumeration(Arrays.asList("name", "Level", "countGame")));
    }

    @Test
    void removeAllAttributesExceptCountGame() throws ServletException, IOException {
        restartServlet.doGet(request,response);

        verify(session).removeAttribute("name");
        verify(session).removeAttribute("Level");
        verify(session,never()).removeAttribute("countGame");
    }
    @Test
    void forwardInIndexJsp() throws ServletException, IOException {
        restartServlet.doGet(request,response);

        verify(request).getRequestDispatcher("index.jsp");
        verify(requestDispatcher).forward(request,response);
    }
}