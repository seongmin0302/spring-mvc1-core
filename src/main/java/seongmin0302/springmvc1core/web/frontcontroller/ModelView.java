package seongmin0302.springmvc1core.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

public class ModelView {
    private String viewName;
    private Map<String,Object> model = new HashMap<>();
    
    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewPath() {
        return viewName;
    }

    public void setViewPath(String viewPath) {
        this.viewName = viewPath;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }

    
}
