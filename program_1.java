
import java.util.*;
public class program_1 {
 


	static void all(String str, char[] a,int last, int index)
	{
		int length = str.length();

		
		for (int i = 0; i < length; i++)
		{

			a[index] = str.charAt(i);

		
			if (index == last)
				System.out.println(new String(a));
			else
				all(str, a, last,index + 1);
		}
	}

	
	static void all(String str)
	{
		int length = str.length();

		char[] a = new char[length + 1];
		char[] temp = str.toCharArray();

		Arrays.sort(temp);
		str = new String(temp);

		
		all(str, a, length - 1, 0);
	}

	
	public static void main(String[] args)
	{
            Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		System.out.printf("All permutations with " +
				"repetition of %s are: \n", str);
		all(str);
	}
}

 
   

