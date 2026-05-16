package Strings;

// when ever we print the object it by default have .toString() that's why it prints the Hashcode

// we can override the toString method by implementing a new method of same name with our method definition .

// we can override any method definition by replacing it with our definition

class laptop{
    String name;
    int number;

    public String toString(){  // we can modify the toString method
        return "Hey";
    }
}

public class Hashcode {
    public static void main(String[] args) {

        laptop obj = new laptop();
        obj.name = "Ayush";
        obj.number = 10;

        System.out.println(obj.toString());  // Strings.laptop@6acbcfc0 (output)
    }
}
