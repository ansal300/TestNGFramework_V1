package com.myframework.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

public class ConstantReader {

    public static <T> T configReader(Class<? extends Config> clazz)
    {

        return (T) ConfigFactory.create(clazz);
    }
}
