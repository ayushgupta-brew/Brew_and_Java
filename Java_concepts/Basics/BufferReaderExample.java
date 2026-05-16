package Basics;

// BufferReader is an alternative of Scanner but Scanner is easy to implement

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
    public static void main(String[] args)  {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        try {
            String name = bf.readLine();
            System.out.println(name);
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
            double n = Double.parseDouble(bf.readLine());
            System.out.println(n);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
