import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");

        System.out.println(add(1,2,3,4,5,6,7,8,9,10));
    }
    static int add(int ...numbers){
        int result = Arrays.stream(numbers).reduce(0, (a,b) -> a+b);
        return result;
    }
}