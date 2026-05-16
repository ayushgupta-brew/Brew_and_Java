package OOPS_concept;

// Up Casting means converting the object of Sub Class to Super Class (Implicit Casting)- automatically done

// Down Casting means converting  the object of Super Class to Sub Class (Explicit Casting)- We have to do it

class a1{
     public void show1(){
        System.out.println("In A show");
    }
}

class b1 extends a1{
    public void show2(){
        System.out.println("In B show");
    }
}

class Up_Down_Casting {
    public static void main(String[] args) {

        a1 obj =(a1) new b1(); // implicit Up Casting
        obj.show1();

        b1 obj1 = (b1)obj;  // explicitly Down Casting // by down casting we can call both methods
        obj1.show1();
        obj1.show2();

    }
}
