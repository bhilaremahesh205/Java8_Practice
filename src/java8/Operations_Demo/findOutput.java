package java8.Operations_Demo;

public class findOutput {
    public static void main(String[] args) {
        findOutput fo = new findOutput();
        fo.numberTriangle(6);
        System.out.println(fo + "result");
    }
    public int numberTriangle(int n){
        int result = 0;
        for (int i=1; i<=n; i++){
            //result = result + i;//output = 15 ,input = 5
            result += i;    // output = 21 ,input = 6
        }
        System.out.println(result + "result");
        return result;
    }
}
