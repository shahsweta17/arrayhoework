public class CountNumber03 {
    public static void main(String[]args){
        String s = " my name is shweta";
        char c = 'a';
        //Counting Character 'a'
        int count =0;
        for(int i = 0; i <s.length(); i++){
            if(s.charAt(i) ==c)
                count++;

        }
        System.out.println(" The Character' " + c +" ' show " + count + " times.");
    }
}

