package Threads_Concurrency_Exceptions;

// exception is the parent class of every exceptions so we always put it at the end of the flow

public class TryWithMultipleCatch {
    public static void main(String[] args) {

        int[] nums = new int[5]; // statement
        nums[1] = 20;

        int i = 2;

        try {
            int j = 10 / i;
            System.out.println(j);
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("number cannot be divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("length cannot exceed");
        } catch (Exception e) {
            System.out.println("Something went wrong... "+e);
        }

        System.out.println("Bye...");
    }
}
