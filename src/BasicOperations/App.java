package BasicOperations;

public class App {
    public static void main(String[] args) {
        /*System.out.println("hello world");
        EagerSingleton obj1 = EagerSingleton.getInstance();
        System.out.println(obj1.hashCode());
*/
        LazySingleton obj2 = LazySingleton.getInstance();
        System.out.println(obj2.hashCode());

        LazySingleton obj3 = LazySingleton.getInstance();
        System.out.println(obj3.hashCode());

      /*  DoubleChekingLazySingleton obj2 = DoubleChekingLazySingleton.getInstance();
        System.out.println(obj2.hashCode());

        DoubleChekingLazySingleton obj3 = DoubleChekingLazySingleton.getInstance();
        System.out.println(obj3.hashCode());*/



    }
}
