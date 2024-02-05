package com.dalongplugina;

import com.dalongpluginb.PluginContract;
import org.springframework.stereotype.Component;

@Component
public class PluginA implements PluginContract {
    @Override
    public String message(String input) {
        return String.format("plugina: %s", input);
    }
    @Override
    public boolean supports(String s) {
        return s.equalsIgnoreCase("plugina");
    }
}
