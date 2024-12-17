import java.util.*;

public class function {
        public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }
    /**
     * @param args
     */
    public static void main(String[] args){
        scanner sc = new scanner(System.in);
        String name = ((Object) sc).next();

        PrintMyName(name);
    }
    @Override
    public String toString() {
        return "function []";
    }
}