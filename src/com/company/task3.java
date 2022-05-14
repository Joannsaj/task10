package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class task3 {
    public static void main(String[] args) {
    int bajt;
    try(FileInputStream fis = new FileInputStream("D:\\SEMESTER 3\\Java programming\\javalab\\Lab10\\src\\com\\company\\test.txt");
        FileOutputStream fos = new FileOutputStream("D:\\SEMESTER 3\\Java programming\\javalab\\Lab10\\src\\com\\company\\copy.txt")){
        do{
            bajt=fis.read();
            if ((char)bajt== ' ' ) bajt='_';
            if(bajt!= -1) fos.write(bajt);
        }while (bajt != -1);
    }  catch (IOException e) {
        e.printStackTrace();
    }
    }
}
