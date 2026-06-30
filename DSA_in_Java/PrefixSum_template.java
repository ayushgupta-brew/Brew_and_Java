import java.util.Scanner;

public class PrefixSum_template {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        prefixSum(nums);
    }

    static int[] prefixSum(int[] nums){

        int len = nums.length;

        int[] prefix = new int[len];

        prefix[0] = nums[0];

        for (int i = 0; i < prefix.length; i++) {
            prefix[i] = prefix[i] + nums[i];
        }
        return prefix;
    }
}
