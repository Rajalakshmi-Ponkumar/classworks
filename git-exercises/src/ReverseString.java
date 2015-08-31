import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str,rev=" ";
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the string to be reversed :");
	    str=s.nextLine();
	    
	    
	    for(int i=str.length()-1;i>=0;i--)
	    {
	    	rev=rev+str.charAt(i);
	    	
	    }
	    System.out.println("Reverse of the given string :"+ rev);	    
s.close();
	}

}
