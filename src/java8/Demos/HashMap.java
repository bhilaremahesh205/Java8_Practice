package java8.Demos;

import java.util.Map;
public class HashMap<S, S1> {
    public static void main(String[] args) {
        Map<Integer, String> map = new java.util.HashMap<>();
        System.out.println(map+"1"+"---------"+"\n");
        map.put(1,"java");
        System.out.println(map+"2"+"---------"+"\n");
        map.put(null, "demo");
        System.out.println(map+"3"+"---------"+"\n");
        map.put(1,"springboot");
        System.out.println(map+"4"+"---------"+"\n");
        map.put(1,"springboot");
        System.out.println(map+"5"+"---------"+"\n");

        System.out.println("-----------------------------"+"\n");
        System.out.println(map);
    }
}
