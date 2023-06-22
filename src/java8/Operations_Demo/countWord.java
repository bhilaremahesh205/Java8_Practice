package java8.Operations_Demo;

public class countWord {
    private int countWord(String data){
        int count=1;
        for (char ch:data.toCharArray()){
            if (ch == ' '){
                count++;
            }
        }
        System.out.println(count + "count");
        return count;
    }
    public static void main(String[] args) {
        countWord countWord = new countWord();
        countWord.countWord("i love coding java");
        System.out.println(countWord);
    }
}
