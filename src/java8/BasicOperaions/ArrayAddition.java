package java8.BasicOperaions;

public class ArrayAddition {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k = 3;
        int n=arr.length;

        int result= 0;

        for (int i= 0; i < n; i++){
            int sum = 0;
            for (int j= i;j<n; j++){
                sum = sum +arr[j];
                if (sum == k)
                    result++;
            }
        }
        System.out.println("sum is" + k + "\t" + result);
    }
}
