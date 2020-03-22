package MyProject;

import java.util.Scanner;

public class UpperLower {

public static void main(String[] args) {
Scanner A=new Scanner(System.in);
System.out.println("Enter the Sentence...!!!");
String B=A.nextLine();
int uppercase=0, lowercase=0;
for(int i=0;i<B.length();i++)
{
	if(Character.isLowerCase(B.charAt(i)))
	{
		lowercase++;
	}
	else if(Character.isUpperCase(B.charAt(i)))
	{
		uppercase++;
	}
}
System.out.println("Number of LowerCase Letter: " + lowercase);
System.out.println("Number of UpperCase Letter: " + uppercase);
System.out.println();
	}
}

