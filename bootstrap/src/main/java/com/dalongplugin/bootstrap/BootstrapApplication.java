package com.dalongplugin.bootstrap;

import com.dalongpluginb.PluginContract;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@SpringBootApplication(scanBasePackages = {"com.dalongpluginb","com.dalongplugin.bootstrap","com.dalongplugina"})
@EnablePluginRegistries(PluginContract.class)
public class BootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(PluginRegistry<PluginContract,String> plugins) {
        return args -> {
            plugins.forEach(plugin -> {
                System.out.println(plugin.message("hello"));
            });
        };
    }
}
