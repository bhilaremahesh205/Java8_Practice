package java8.Operations_Demo;

public class SwapString {
    public static void main(String[] args) {
        String str1= "mahesh";
        String str2 = "bhilare";

        System.out.println("before  swaping"+ " " + str1);
        System.out.println("before  swaping" + " " +str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("after  swaping"+ " " + str1);
        System.out.println("after  swaping" + " " +str2);

    }
}
