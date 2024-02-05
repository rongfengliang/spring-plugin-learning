package com.dalongpluginb;

import org.springframework.stereotype.Component;

@Component
public class PluginB implements PluginContract{
    @Override
    public String message(String input) {
        return String.format("pluginb: %s", input);
    }
    @Override
    public boolean supports(String s) {
        return s.equalsIgnoreCase("pluginb");
    }
}
