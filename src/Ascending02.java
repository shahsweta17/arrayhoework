import java.util.Arrays;

public class Ascending02 {
    public static void main(String[]args){
        int[] array  =new int[]{5, 2, 9, 1,0,4};
        Arrays.sort(array);
        System.out.println("element of arrays sorted in ascending order:");
        for (int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
