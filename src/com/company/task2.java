package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) throws FileNotFoundException {

        int bajt;
        try(FileInputStream fis = new FileInputStream("D:\\SEMESTER 3\\Java programming\\javalab\\Lab10\\src\\com\\company\\test.txt")) {
        do {
            bajt=fis.read();
            if(bajt!= -1) System.out.print((char)bajt);
        }while (bajt != -1);
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
