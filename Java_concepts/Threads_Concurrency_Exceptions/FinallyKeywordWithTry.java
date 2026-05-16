package Threads_Concurrency_Exceptions;

// finally  we use with the try block which ensures if we want to run anything it will run on the finally block

// BufferReader can be closed automatically so we can write it inside the try()


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyKeywordWithTry {
    public static void main(String[] args) throws IOException {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

          int  num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
//        finally {
//            br.close();
//        }
    }
}
