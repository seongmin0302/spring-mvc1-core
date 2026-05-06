package seongmin0302.springmvc1core.web.frontcontroller.v4.controller;

import java.util.List;
import java.util.Map;

import seongmin0302.springmvc1core.domain.member.Member;
import seongmin0302.springmvc1core.domain.member.MemberRepository;
import seongmin0302.springmvc1core.web.frontcontroller.v4.ControllerV4;

public class MemberListControllerV4 implements ControllerV4 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();
        model.put("members",members);

        return "members";
    }

}
