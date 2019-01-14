/*
*Remove Whitespace
*
* @author Manivannan
*
*/

import java.io.*;
import java.util.*;
class Bubble_Sort
{
	public static void Bubble_Sort(int arr[],int n)
	{
		int i,j;
		boolean swapped;
		for(i=0;i<n-1;i++)  /** The bubble sort algorith says only n-1 number of loops will be executed**/
		{
			swapped=false;
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j]=(arr[j]+arr[j+1])-(arr[j+1]=arr[j]); /**one line Swap method*/
					swapped=true;
				}
				
			}
			if(swapped==false) //This is optimization method..if no swapping is there the loop will be terminated.
			{
				break;
			}
		}
	}
	public static void printarray(int arr[],int n)
	{
		System.out.println("The Sorted Output array is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i,n;
		int arr[]=new int[10];
		System.out.print("Enter the num of Elements:");
		n=input.nextInt();
		System.out.println("Enter the Elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
        Bubble_Sort(arr,n);
        printarray(arr,n);
	}
}
