import java.util.Scanner;

public class MissingNumber {
    public static int missingNumber(int[] nums) {

        int n=nums.length;
        int sum=n*(n+1)/2;;
        for(int i=0;i<n;i++)
            sum-=nums[i];

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Number");
            arr[i]=sc.nextInt();
        }
        System.out.println(missingNumber(arr));
    }
}
