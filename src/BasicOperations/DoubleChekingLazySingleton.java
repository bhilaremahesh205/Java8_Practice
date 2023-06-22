package BasicOperations;

public class DoubleChekingLazySingleton {
    private DoubleChekingLazySingleton(){
    }

    private static DoubleChekingLazySingleton instance;

    public static DoubleChekingLazySingleton getInstance(){
        if (instance == null){
            synchronized (DoubleChekingLazySingleton.class){
                if (instance == null){
                    instance = new DoubleChekingLazySingleton();
                }
            }
        }
        return instance;
    }
}
