package java8.Collection;

import java.util.Iterator;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> set =new java.util.HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("");
        set.add("");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
