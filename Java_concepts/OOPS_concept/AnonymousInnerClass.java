package OOPS_concept;

// If we know that we have to override the method once only so why to create a new class we can implement override method using Anonymous class

// Anonymous Inner class does not have any name, but it can be used to override  the method

// We have to create multiple objects to use multiple Anonymous inner class to define behaviour

class com{
    public void show(){
        System.out.println("In com Show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        com obj = new com()
        {                                                  // Anonymous Inner Class
            public void show(){
                System.out.println("In new Show");
            }
        };


        obj.show();
    }
}
