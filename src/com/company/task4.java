package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class DataManagement{
    String data;
    public void readData(){
        System.out.println("Input your data.");
        Scanner reader = new Scanner(System.in);
        data = reader.nextLine();
    }
    public void writeDataToFile(){
        try(FileWriter fw= new FileWriter("data.txt")) {
            fw.write(data);
            System.out.println("Your data has been saved");
        } catch (IOException e) {
            System.out.println("Saving error");        }
    }
    public void readDataFromFile(){
        String data2;
        try(Scanner sn = new Scanner(new FileReader("data.txt"))) {
            System.out.println("This is the saved data.");
            data2=sn.nextLine();
            System.out.println(data2);
        } catch (IOException e) {
            System.out.println("Data error");
        }
    }
}
public class task4 {
    public static void main(String[] args) {
        DataManagement dm = new DataManagement();
        dm.readData();
        dm.writeDataToFile();
        dm.readDataFromFile();
    }
}
