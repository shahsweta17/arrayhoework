




import com.sun.deploy.appcontext.AppContext;

import java.util.Arrays;



public class SpecificElement06 {
    public static void main(String[]args){
        int[] array = {1,2,3,4,5,6,7,8,9};
       int removeElement= 4;
       for (int i = removeElement; i < array.length-1; i++){
           array[i] = array[i + 1];
       }
        System.out.println(Arrays.toString(array));



    }
}
