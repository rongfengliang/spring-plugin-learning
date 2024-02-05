package com.dalongpluginb;

import org.springframework.stereotype.Component;

@Component
public class PluginB implements PluginContract{
    @Override
    public String message(String input) {
        return String.format("plugina: %s", input);
    }
    @Override
    public boolean supports(String s) {
        return s.equalsIgnoreCase("plugina");
    }
}
