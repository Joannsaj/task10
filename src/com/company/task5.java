package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class task5 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        BufferedReader sn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first 3 digits of your bank account.");
        String accNumber = sn.readLine();

       try (BufferedReader data= new BufferedReader(new InputStreamReader(url.openStream()))){
           String line;
           while ((line=data.readLine())!= null){
               System.out.println(line);
               String[] words = line.split("\\t*");
               String bankNum = words[0].trim();
               String bankName = words[1].trim();
               if (bankNum.equals(accNumber)){
                   System.out.println("Bank number "+ bankNum + "\n Bank name: "+ bankName);
                   break;
               }
           }
       }catch (IOException e){
           System.out.println("Data error");
       }
    }
}
