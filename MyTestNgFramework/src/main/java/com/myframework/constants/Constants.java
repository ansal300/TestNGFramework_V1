package com.myframework.constants;

//final class -- cannot be extended
public final class Constants {

    // cannot initialize object for class if private constructor
    private Constants() {

    }

    private static final String REPORT_PATH = System.getProperty("user.dir") + "/index.html";

    public static String getReportPath() {
    return REPORT_PATH;
    }
}
