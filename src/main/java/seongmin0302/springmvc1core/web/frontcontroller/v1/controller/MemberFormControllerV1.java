package seongmin0302.springmvc1core.web.frontcontroller.v1.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import seongmin0302.springmvc1core.web.frontcontroller.v1.ControllerV1;

public class MemberFormControllerV1 implements ControllerV1 {

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/new-form.jsp");
        dispatcher.forward(request, response);

    }


}
