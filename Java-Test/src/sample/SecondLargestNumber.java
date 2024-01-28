package sample;
import java.util.*;
public class SecondLargestNumber {

	public static void main(String[] args) 
	{
		System.out.println ("Enter size of an array");
		Scanner Scan=new Scanner (System.in);
		int size = Scan.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter elements into array");
		for (int i = 0;i<size;i++)
		{
			arr[i]=Scan.nextInt();
		}
		int fmax = arr[0];
		int smax = arr[0];
		for (int i=1 ; i<arr.length; i++)
		{
			if (arr[i]>smax)
			{
				smax = fmax ;
				fmax = arr[i];
			}
			else if  (arr[i]>smax)
			{
				smax=arr[i];
			}
		}
		System.out.println("Second biggest"+smax);
	

	}

}
