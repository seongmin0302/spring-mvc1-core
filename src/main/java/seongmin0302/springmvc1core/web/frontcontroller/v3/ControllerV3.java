package seongmin0302.springmvc1core.web.frontcontroller.v3;

import java.util.Map;

import seongmin0302.springmvc1core.web.frontcontroller.ModelView;

public interface ControllerV3 {
    ModelView process(Map<String,String> paraMap);
    
}
