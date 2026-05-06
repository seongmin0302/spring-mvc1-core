package seongmin0302.springmvc1core.web.frontcontroller.v4;

import java.util.Map;

import seongmin0302.springmvc1core.web.frontcontroller.ModelView;

public interface ControllerV4 {

    String process(Map<String,String> paramMap, Map<String,Object> model);

}
