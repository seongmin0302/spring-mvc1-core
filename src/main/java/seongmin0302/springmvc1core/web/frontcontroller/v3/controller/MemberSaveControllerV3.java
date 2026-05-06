package seongmin0302.springmvc1core.web.frontcontroller.v3.controller;

import java.util.Map;

import seongmin0302.springmvc1core.domain.member.Member;
import seongmin0302.springmvc1core.domain.member.MemberRepository;
import seongmin0302.springmvc1core.web.frontcontroller.ModelView;
import seongmin0302.springmvc1core.web.frontcontroller.v3.ControllerV3;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();
    
    @Override
    public ModelView process(Map<String, String> paraMap) {
        String username = paraMap.get("username");
        int age = Integer.parseInt(paraMap.get("age"));

        Member member = new Member(username,age);
        memberRepository.save(member);

        ModelView modelView = new ModelView("save-result");
        modelView.getModel().put("member",member);

        return modelView;
    }


}
