package filehandling;//10

//package com.advanced.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class BufferedReaderApp2 {

    public static void main(String[] args) {

        String HAMLET_PART_FILE_PATH = "src\\com\\advanced\\filehandling\\Hamlet.txt";

        try (FileReader hamletReader = new FileReader(HAMLET_PART_FILE_PATH)) {
            BufferedReader hamletBufferReader = new BufferedReader(hamletReader, 16384);
            String hamletPart = hamletBufferReader.lines()//lines
                    .collect(Collectors.joining(System.lineSeparator()));//line separator
            System.out.println(hamletPart);
            //readAllLines(hamletBufferReader);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readAllLines(BufferedReader hamletBufferReader) throws IOException {//why private
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = hamletBufferReader.readLine()) != null) {//readline
            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());//linSeparator
        }
        System.out.println(stringBuilder.toString());
    }

}
