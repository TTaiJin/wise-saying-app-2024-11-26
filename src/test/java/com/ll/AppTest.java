package com.ll;

import com.ll.standard.util.TestUtil;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTest {

    public static String run(String input) {
        Scanner scanner = TestUtil.getScanner(input);
        input = input.stripIndent().trim();

        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        App app = new App(scanner);
        app.run();

        String output = outputStream.toString();

        TestUtil.clearSetOutToByteArray(outputStream);

        return output;
    }
}
