package StringOperations;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str;
        System.out.print("Enter String/Words");
        str = sc.nextLine();

        int i=0 ;
        for (char c:str.toCharArray())
        {
            System.out.print(c);
            i++;
        }
        System.out.println("\n Length" + i);
    }
}
