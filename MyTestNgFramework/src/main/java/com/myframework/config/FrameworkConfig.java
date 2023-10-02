package com.myframework.config;

import org.aeonbits.owner.Config;

import java.time.Duration;

@org.aeonbits.owner.Config.Sources("src/test/resources/config/config.properties")
public interface FrameworkConfig extends Config {

    String url();
    long timeout();
}
