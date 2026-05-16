package Methods_Constructors;

/*
1 . Constructors is a method that does not return anything , and it has the name same as the Class Name
2 . Everytime we create an object  it will always call the constructor
*/


class Student{
    private String name;
    private int rollNo;

    // Default Constructor for accepting default values .
    Student(){
        name = "Ayush";
        rollNo = 3 ;
        System.out.println("In Constructor method.");
    }

    // Parameterised Constructor and Overloading Constructor
    Student(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Student obj = new Student();

        Student obj1 = new Student("Rajesh" , 10);

//        obj.setName("Rajesh");
//        obj.setRollNo(10);

        System.out.println(obj.getName() + " : " + obj.getRollNo());
        System.out.println(obj1.getName() + " : " + obj1.getRollNo());
    }
}
