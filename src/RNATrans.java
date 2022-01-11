import java.util.*;

public class RNATrans {
    public static void main(String[] args) {
        String dna = "GCTA";
        char[] rna = {'C', 'G', 'A', 'U'};
        Scanner s = new Scanner(System.in);
        String resultRna = "";
        System.out.println("Enter the dna:");
        String dnaInput = s.nextLine();
        for(char i:dnaInput.toCharArray()){
            resultRna+= rna[dna.indexOf(i)];
        }
        System.out.println(resultRna);

    }
}
