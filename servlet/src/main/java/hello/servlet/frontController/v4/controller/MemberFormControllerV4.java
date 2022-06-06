package hello.servlet.frontController.v4.controller;

import hello.servlet.frontController.ModelView;
import hello.servlet.frontController.v3.ControllerV3;
import hello.servlet.frontController.v4.ControllerV4;

import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
