package net.intt.util;

import java.io.File;

public class LogManager {

    final String projectName;

    public LogManager(String projectName){
        this.projectName = projectName;
    }

    public void warn(Object value) {
        var s = "\r\u001B[31m[WARN] " + projectName + ": " + value + "\u001B[0m";
        System.out.println(s);
    }
    public void info(Object value) {
        var s = "\r\u001B[33m[INFO] " + projectName + ": " + value + "\u001B[0m";
        System.out.println(s);
    }
    public void error(Object value) {
        var s = "\r\u001B[91m[ERROR] " + projectName + ": " + value + "\u001B[0m";
        System.out.println(s);
    }
    public void debug(Object value) {
        var s = "\r\u001B[32m[DEBUG] " + projectName + ": " + value + "\u001B[0m";
        System.out.println(s);
    }
}
