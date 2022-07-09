package net.intt.util;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;

import java.io.PrintStream;

public class test {
    public static class Stream extends PrintStream {

        private final LineReader reader;

        public Stream(LineReader reader) {
            super(System.out, true);
            this.reader = reader;
        }

        @Override
        public void println(Object x) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        LineReader reader = LineReaderBuilder.builder().build();
        new Thread(() -> {
            System.out.println(reader.readLine("> "));
        }).start();
        Thread.sleep(2500);
        reader.callWidget(LineReader.CLEAR);
        reader.getTerminal().writer().println("absdf");
        reader.callWidget(LineReader.REDRAW_LINE);
        reader.callWidget(LineReader.REDISPLAY);
        reader.getTerminal().flush();
    }
}
