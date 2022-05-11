public class CommonElement05 {
    public static void main(String[] args) {
        String[] numArray1 = {"shweta", "nisha", "pragna", "rinku"};
        String[] numArray2 = {"hetal", "pinal", "shweta", "pragna"};
        for (int i = 0; i < numArray1.length; i++) {
            for (int j = 0; j < numArray2.length; j++) {
                if (numArray1[i].equals(numArray2[j])) {
                    System.out.println(numArray1[i]);
                }
            }
        }
    }
}