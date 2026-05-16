package OOPS_concept;

// Dynamic Method Dispatch in Java means calling the overridden method at runtime based on the object type, not the reference type.

class a{

    public void show(){
        System.out.println("In a show");
    }
}

class b extends a{

    public void show(){
        System.out.println("In b show");
    }
}

class c extends a{
    public void show(){
        System.out.println("In c show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

//        a obj = new b();    // we can create the object of b using the A class reference

        a obj = new a();

//        obj = new b();  // we can update the object . We can only change the object when it's refereed to parent class

        obj = new c();

        obj.show();
    }
}
