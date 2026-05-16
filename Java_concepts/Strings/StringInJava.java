package Strings;

public class StringInJava {
    public static void main(String[] args) {
        String name = "Hii Ayush" ;
        String email = "abc@gmail.com";

//        String username = email.substring(0 , 4);
        String domain = email.substring(email.indexOf("@"));
        String username = email.substring(0 , email.indexOf("@") + 1);
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("u");
        int lastIndex = name.lastIndexOf("h");
        String UpperCase = name.toUpperCase();
        String LowerCase = name.toLowerCase();
        String trim = name.trim();
        String replace = name.replace("Hii" , "hello");


        System.out.println(username);
        System.out.println(domain);
        System.out.println(letter);
        System.out.println(length);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(UpperCase);
        System.out.println(LowerCase);
        System.out.println(trim);
        System.out.println(replace);
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());
        System.out.println(name.contains(" "));
        System.out.println(name.equals("Hii Ayush"));
        System.out.println(name.compareTo("ayush"));

    }
}
