import java.util.*;

public class condition {
    public static void main(final String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
    }
}
