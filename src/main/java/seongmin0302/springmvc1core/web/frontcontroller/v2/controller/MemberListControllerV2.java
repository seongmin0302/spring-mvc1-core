package seongmin0302.springmvc1core.web.frontcontroller.v2.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import seongmin0302.springmvc1core.domain.member.Member;
import seongmin0302.springmvc1core.domain.member.MemberRepository;
import seongmin0302.springmvc1core.web.frontcontroller.Myview;
import seongmin0302.springmvc1core.web.frontcontroller.v2.ControllerV2;

public class MemberListControllerV2 implements ControllerV2 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public Myview process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Member> members = memberRepository.findAll();
        request.setAttribute("members", members);

        return new Myview("/WEB-INF/views/members.jsp");
    }

}
