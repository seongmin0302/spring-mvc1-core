package seongmin0302.springmvc1core.web.springmvc.v1;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import seongmin0302.springmvc1core.domain.member.Member;
import seongmin0302.springmvc1core.domain.member.MemberRepository;

@Controller
public class StringMemberListContorllerV1 {
    private MemberRepository memberRepository = MemberRepository.getInstance();
    
    @RequestMapping("/springmvc/v1/members")
    public ModelAndView process() {
        List<Member> members = memberRepository.findAll();
        
        ModelAndView modelAndView = new ModelAndView("members");
        modelAndView.addObject("members", members);

        return modelAndView;
    }
}
