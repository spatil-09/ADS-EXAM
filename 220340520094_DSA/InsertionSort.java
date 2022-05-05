import java.util.Scanner;
class InsertionSort
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
	    sort(arr);
	}

	public static void sort(int[] arr)
	{
		int l = arr.length;
		int ele = arr[l-1];
		for(int i=l-2; i>=0;i--)
		{
			if(arr[i]>ele)
			{
				arr[i+1] = arr[i];
				display(arr);
			}
			else
			{
				arr[i+1] = ele;
				display(arr);
			    break;
			}
			if((i==0)&&(arr[i]>ele))
			{
				arr[i] = ele;
				display(arr);
			}
		}
	}
	
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	    System.out.println();
	}
}