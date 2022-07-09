package net.intt.util;

import java.io.PrintStream;

public class LogManager {

    final String projectName;
    final Printer out;

    public LogManager(String projectName){
        this(projectName, new OutPrinter());
    }

    public LogManager(String projectName, Printer out) {
        this.projectName = projectName;
        this.out = out;
    }

    public void warn(Object value) {
        var s = "\r\u001B[31m[WARN] " + projectName + ": " + value + "\u001B[0m";
        println(s);
    }
    public void info(Object value) {
        var s = "\r\u001B[33m[INFO] " + projectName + ": " + value + "\u001B[0m";
        println(s);
    }
    public void error(Object value) {
        var s = "\r\u001B[91m[ERROR] " + projectName + ": " + value + "\u001B[0m";
        println(s);
    }
    public void debug(Object value) {
        var s = "\r\u001B[32m[DEBUG] " + projectName + ": " + value + "\u001B[0m";
        println(s);
    }

    void println(String value) {
        out.println(value);
    }

    private static class OutPrinter extends PrintStream implements Printer {

        public OutPrinter() {
            super(System.out);
        }
    }
}
