package seongmin0302.springmvc1core.web.frontcontroller.v2;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import seongmin0302.springmvc1core.web.frontcontroller.Myview;

public interface ControllerV2 {
    Myview process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
