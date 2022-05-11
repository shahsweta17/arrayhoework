import java.sql.SQLOutput;
import java.util.Arrays;

public class Equality01 {
    public static void main(String[]args){
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        boolean result = Arrays.equals(a, b);
        if (result) {
            System.out.println("arrays are equals");

        }
        else{
            System.out.println("arrays are not equals");
        }
    }
}
