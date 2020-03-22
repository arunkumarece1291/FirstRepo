package MyProject;

import java.lang.String;
import java.io.*;
import java.util.*;
 
public class Vowels {
    public static void main(String args[]) throws IOException {
        String str = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any  String: ");
        str = in.nextLine();
        int totalVowels = 0;
        Map<Character, Integer> tmap = new TreeMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I'
                    || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u') {
                Integer count = tmap.get(c);
                tmap.put(c, (count == null ? 1 : count + 1));
                totalVowels++;
            }
        }
        System.out.println("Total Number of Vowels in the String  "
                + totalVowels);
        System.out.println(tmap);
    }
}