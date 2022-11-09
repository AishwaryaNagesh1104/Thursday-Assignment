package reversestring;

import java.util.Scanner;

public class ReverseString {
	
	public static void reverseString(char[]ch,int length) {
		if(length>0)
		{
			System.out.println(ch[length-1]);
			length--;
			//recursive calling method
			reverseString(ch,length);
		}
		}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();//convert string into character array
		int length=ch.length;//finding length of the string
		reverseString(ch,length);
		
				}

}
