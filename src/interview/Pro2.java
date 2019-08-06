package interview;

public class Pro2 {
	public static void main(String [] args)
	{
		int [] numbers= {0,1,1,1,0,0,0,0,0,1,1,1};
		abc(numbers);
	}
	public static void abc(int arr[]) 
	{
		int index=-1;
		int longest=-1;
		int count =1;
		int startIndex=0;
		int item = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(item!=arr[i])
			{
				if(count>longest)
				{
					longest=count;
					index=startIndex;
				}
				count=1;
				startIndex=i;
			}
			else
			{
				count++;
			}
			item=arr[i];
	}
		System.out.println(longest+"     "+index);
	}
	
}