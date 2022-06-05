package hello.servlet.frontController.v3;

import hello.servlet.frontController.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String,String> paraMap);
}
