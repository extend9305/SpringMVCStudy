package hello.servlet.frontController.v3.controller;

import hello.servlet.frontController.ModelView;
import hello.servlet.frontController.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paraMap) {
        return new ModelView("new-form");
    }
}
