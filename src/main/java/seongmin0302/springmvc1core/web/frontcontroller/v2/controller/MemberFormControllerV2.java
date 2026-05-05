package seongmin0302.springmvc1core.web.frontcontroller.v2.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import seongmin0302.springmvc1core.web.frontcontroller.Myview;
import seongmin0302.springmvc1core.web.frontcontroller.v2.ControllerV2;

public class MemberFormControllerV2 implements ControllerV2{

    @Override
    public Myview process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return new Myview("/WEB-INF/views/new-form.jsp");
    }
    
}
