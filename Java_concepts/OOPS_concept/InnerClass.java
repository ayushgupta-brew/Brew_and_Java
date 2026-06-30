package OOPS_concept;

// An Inner Class in Java is a class defined inside another class . If we want to call the inner class object we have to call it with the use of outer class

// we can make the inner class static but not the outer class

class Com{
    String name= "Ayush" ;

    public void show (){
        System.out.println(name + "In show of com");
    }

     class desk{

        public void Config(){
            System.out.println(name +"In config of desk");
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {

        Com obj = new Com();

        obj.show();

        Com.desk obj1 = obj.new desk(); // called using outer class

        obj1.Config();
    }
}
