package java8.BasicOperaions;

public class StringJoiner {
    public static void main(String[] args) {
       // StringJoiner sj1 = new StringJoiner(",");
        java.util.StringJoiner sj = new java.util.StringJoiner(",","[","]");
        sj.add("A");
        sj.add("B");
        sj.add("C");
        System.out.println(sj);
        java.util.StringJoiner sj2 = new java.util.StringJoiner(":");
        sj2.add("P"); sj2.add("Q");
        System.out.println(sj2);
        sj.merge(sj2);
        System.out.println(sj);



    }


}
