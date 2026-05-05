package seongmin0302.springmvc1core.web.frontcontroller.v3.controller;

import java.util.Map;

import seongmin0302.springmvc1core.web.frontcontroller.ModelView;
import seongmin0302.springmvc1core.web.frontcontroller.v3.ControllerV3;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paraMap) {
        return new ModelView("new-form");
    }
    
}
