package OOPS_concept;

// lambda expression works with only functional interface .

@FunctionalInterface
interface show{
    int add(int i , int j);
}

public class LambdaExample {
    public static void main(String[] args) {

        show obj1 = new show() {
            @Override
            public int add(int i, int j) {
                return i+j;
            }
        };

        show obj = ( i ,  j ) -> i+j;  // lambda expression

        int result = obj.add(2 , 3);
        int result1 = obj1.add(5 , 4);
        System.out.println(result + " " + result1);
    }
}
