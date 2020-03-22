package MyProject;

import java.util.*;
import java.io.*;

public class Count {

	public static void main(String[] args) {
		System.out.println("Enter the Sentence");
		Scanner A=new Scanner(System.in);
		String obj=A.nextLine();
		int upper=0, lower=0, special=0, number=0, space=0, vowels=0;
		int totalVowels=0;
        		for(int i=0;i<obj.length();i++)
		{
			char ch=obj.charAt(i);
			if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I'
                    || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') 
	                ++vowels;
			else if(ch >= 'A'&& ch<='Z')
				upper++;
			else if(ch >='a' && ch<='z')
				lower++;
			else if(ch>='0' && ch<='9')
			number++;
			else if(ch==' ')
				space++;
			
			else
				special++;
					}
        		Map<Character, Integer> tmap = new TreeMap<Character, Integer>();
        		for (int i = 0; i < obj.length(); i++) 
        		{
                    char ch = obj.charAt(i);
                    if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I'
                            || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                        Integer count = tmap.get(ch);
                        tmap.put(ch, (count == null ? 1 : count + 1));
                        totalVowels++;
                    }
                }
        		
        		int length=obj.length();
				String reverse="";
				for (int i = length - 1; i >= 0; i--)
                    reverse = reverse + obj.charAt(i);
                
		
				
        		
        		
System.out.println("1. Lower case letters:" + lower);
System.out.println("2. Upper case letters:" + upper);
System.out.println("3. Numbers:" + number);
System.out.println("4. Special characters:" +special);
System.out.println("5. Spaces:" + space);
System.out.println("6. Vowels:" + vowels);
System.out.println("7. Total Number of Vowels in the String  "
        + totalVowels);
System.out.println(tmap);
System.out.println("8. Reverse:" + reverse);

	}

}
