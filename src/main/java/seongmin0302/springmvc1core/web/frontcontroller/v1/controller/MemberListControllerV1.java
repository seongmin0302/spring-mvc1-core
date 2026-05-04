package seongmin0302.springmvc1core.web.frontcontroller.v1.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import seongmin0302.springmvc1core.domain.member.Member;
import seongmin0302.springmvc1core.domain.member.MemberRepository;
import seongmin0302.springmvc1core.web.frontcontroller.v1.ControllerV1;

public class MemberListControllerV1 implements ControllerV1 {

    private MemberRepository memberRepository = MemberRepository.getInstance();
    
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Member> members = memberRepository.findAll();
        request.setAttribute("members", members);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/members.jsp");
        dispatcher.forward(request, response);
    }
    
}
