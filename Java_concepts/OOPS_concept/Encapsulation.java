package OOPS_concept;

// Encapsulation = Data hiding + Controlled access using getters/setters.

// this keyword refers to the current object and is used to access class members, resolve naming conflicts, call other constructors, and enable method chaining.

class Human {
    private int age;
    private String name;

    public void setAge(int age) {  // setAge not return sets the age variable
        this.age = age;
    }

    public int getAge() {  // getAge returns that set age variable
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void message(){
//        System.out.println(getAge() + " " + getName());
//    }



    //    public static void message(Human obj1) { // static method
//        System.out.println("name : " + obj1.name + " age : " + obj1.age);
//    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Human obj = new Human(); // object

        obj.setAge(22);
        System.out.println(obj.getAge());

        obj.setName("Ayush");
        System.out.println(obj.getName()); // we can call using the normal print statement
//        obj.message(); // we can call using the method

//        Human.message(obj);  here we passed a static method with non-static variables and called static method using class name
    }
}
