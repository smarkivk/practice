package filehandling;

//package com.advanced.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDelimiterApp {

    public static void main(String[] args) {
        String HAMLET_PART_FILE_PATH = "src\\com\\advanced\\filehandling\\Hamlet.txt";

        try (Scanner scanner = new Scanner(new File(HAMLET_PART_FILE_PATH))){
            scanner.useDelimiter(",");//delimiter
            while (scanner.hasNext()) { //hasNext
                System.out.println(scanner.next());//next
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
