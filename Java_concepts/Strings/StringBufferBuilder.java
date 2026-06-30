package Strings;

// string Buffer and Builder

public class StringBufferBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ayush Gupta");  // if we put any  string here it will take the space and add with 16
        sb.append(" Nisha");
        sb.appendCodePoint(10024); // it appends the Unicode with your string
        sb.replace(5 , sb.length() , "gupta");

        System.out.println(sb);

        System.out.println(sb.capacity());  // initial capacity of StringBuffer is 16 bytes .


    }
}
