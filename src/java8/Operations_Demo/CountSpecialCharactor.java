package java8.Operations_Demo;

public class CountSpecialCharactor {
    public static void main(String[] args) {
        String str = "java @  !  $%  ^& *";
        int count = 0;
        String specialCharactorRemoved = "";

        for (int i=0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
                count++;
            }else {
                specialCharactorRemoved = specialCharactorRemoved + str.charAt(i);
            }
        }
        if (count == 0){
            System.out.println("there is no special charactor");
        }else{
            System.out.println("special charactor" + count);

        }
        System.out.println("specialcharactor removed" + " " + specialCharactorRemoved);
    }
}
