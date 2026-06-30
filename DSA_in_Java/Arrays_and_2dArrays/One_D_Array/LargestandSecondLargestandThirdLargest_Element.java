package Arrays_and_2dArrays.One_D_Array;
public class LargestandSecondLargestandThirdLargest_Element {
    public static void main(String[] args){
        int[] a = {10 , 20 , 15};

        int l = largestElement(a);
        System.out.println(l);

        int sl = SecondLargest(a);
        System.out.println(sl);

        int SL_optimise = secondLargest(a);
        System.out.println(SL_optimise);

        int TL_optimise = thirdLargest(a);
        System.out.println(TL_optimise);
    }
    public static int largestElement(int[] a){
        int largest = a[0];
        for(int i = 0 ; i<a.length ; i++){
            if(a[i] > largest){
                largest = a[i];
            }
        }
        return largest;
    }
    public static int SecondLargest(int[] a){ // better approach O(n+n) = O(2n)
        int largest = a[0];
        for(int i : a){
            if(i > largest){
                largest = i;
            }
        }
        int secondLargest = -1;
        for(int j : a){
            if(j > secondLargest && j!= largest){
                secondLargest = j;
            }
        }
        return secondLargest;
    }
    public static int secondLargest(int[] a){ // Optimised approach
        if(a.length < 2){
            return -1;
        }
        int largest = a[0];
        int slargest = Integer.MIN_VALUE;

        for(int i = 1 ; i<a.length ; i++){
            if(a[i] > largest){
                slargest = largest;
                largest = a[i];
            }
            else if (a[i] < largest && a[i] > slargest) {
                slargest = a[i];
            }
        }
        if(slargest == Integer.MIN_VALUE){
            return -1;
        }
        return slargest;
    }
    public static int thirdLargest(int[] a){
        int largest = a[0];
        int sLargest = Integer.MIN_VALUE;
        int tLargest = Integer.MIN_VALUE;

        if(a.length < 3){
            return -1;
        }
        for (int i = 1; i < a.length; i++) {
            if(a[i] > largest){
                tLargest = sLargest;
                sLargest = largest;
                largest = a[i];
            }
            else if (a[i] > sLargest) {
                tLargest = sLargest;
                sLargest = a[i];
            }
            else if (a[i] > tLargest) {
                tLargest = a[i];
            }
        }
        if(tLargest == Integer.MIN_VALUE){
            return -1;
        }
        return tLargest;
    }
}
