package java8;

public class FI {
   /* @FunctionalInterface
    interface Square {
        int calculate(int x);
    }

    interface Abc{
        int cal(int x);
    }
        public static void main(String args[])
    {
        int a = 5;
        Square s = (int x) -> x * x;
        Abc abc = (int x) -> x * x * x;

        int ans = s.calculate(a);
        System.out.println(ans);

        int answer = abc.cal(a);
        System.out.println(answer);
    }*/

interface Cube{
    int cal(int x);
}

    interface Multiply{
        int mul(int x);
    }

    @FunctionalInterface
    interface Square {
        int calculate(int x);
    }

    public static void main(String[] args) {
        int a= 5;
        Square s=(int x) -> x * x;
        int ans = s.calculate(a);
        System.out.println(ans);

        Cube c = (int x) -> x*x*x;
        int answer = c.cal(a);
        System.out.println(answer);

    }
}
