package BasicOperations;

import features.JavaMapFunction;

public class LazySingleton {
    private LazySingleton(){
    }

    private static LazySingleton instance;

    public static synchronized LazySingleton getInstance(){
        if (instance == null){
            return instance = new LazySingleton();
        }else {
            return instance;
        }
    }

}
