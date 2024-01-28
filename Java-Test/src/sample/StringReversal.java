package sample;

public class StringReversal
{
	public static void main (String[] args)
	{
		String r = Reverse ("java Tutorials");
		System.out.println(r);
	}
	public static String Reverse (String s) 
	{
		char[] letters = new char [s.length()];
		int  letterindex=0;
		for (int i=s.length()-1;i>=0;i--)
		{
			letters[letterindex] = s.charAt(i);
			letterindex++;
		}
		String reverse = "";
		for (int i=0;i<s.length();i++)
		{
			reverse = reverse + letters[i];
		}
		return reverse;
	}

}
