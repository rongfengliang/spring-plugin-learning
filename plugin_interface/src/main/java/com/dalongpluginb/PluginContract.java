package com.dalongpluginb;

import org.springframework.plugin.core.Plugin;

public interface PluginContract extends Plugin<String> {
    String message(String input);
}
