package seongmin0302.springmvc1core.web.frontcontroller.v3.controller;

import java.util.List;
import java.util.Map;

import seongmin0302.springmvc1core.domain.member.Member;
import seongmin0302.springmvc1core.domain.member.MemberRepository;
import seongmin0302.springmvc1core.web.frontcontroller.ModelView;
import seongmin0302.springmvc1core.web.frontcontroller.v3.ControllerV3;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paraMap) {
        List<Member> members = memberRepository.findAll();
        
        ModelView modelView = new ModelView("members");
        modelView.getModel().put("members",members);
        return modelView;
    }
    
}
