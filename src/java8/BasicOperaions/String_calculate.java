package java8.BasicOperaions;

public class String_calculate {
    public static void main(String[] args) {
        //String str = "mahesh ananda bhilare, satara, ' ' ,mahabaleshwar";
        String str = "aa  ,  bb,  ccccc";
        int count = 0;

        for (int i=0;i< str.length();i++){
            if (str.charAt(i) != ',' && str.charAt(i) != ' ' ){
                count++;
            }
        }
        System.out.println("count the lennth"+ count);
    }

}
