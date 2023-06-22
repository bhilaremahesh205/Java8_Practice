package operations;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set uniqueColours = new HashSet();

        uniqueColours.add("Red");
        uniqueColours.add("Green");
        uniqueColours.add("Blue");
        uniqueColours.add("Blue"); /*Adding duplicate value here,
		No compiler error and code works fine but doesn't add duplicate value */

        System.out.println("Colours available in set are:");
//        for (String c : uniqueColours){
//
//            System.out.println(c);
//        }
    }
}
