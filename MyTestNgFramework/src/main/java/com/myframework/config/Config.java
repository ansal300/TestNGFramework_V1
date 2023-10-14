package com.myframework.config;

@org.aeonbits.owner.Config.Sources("file:src/test/resources/config/config.properties")
public interface Config extends org.aeonbits.owner.Config {

    String url();
    long timeout();
    String browser();
    String run_mode();
    String remote_url();

}
