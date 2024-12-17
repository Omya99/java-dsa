import java.util.Scanner;

public class oddeven {
    public static void main(final String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        if(x % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

}