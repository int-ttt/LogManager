package net.intt.util;

import java.io.OutputStream;
import java.io.PrintStream;

public class OutPrinter extends PrintStream implements Printer {

    public OutPrinter() {
        super(System.out);
    }
}
