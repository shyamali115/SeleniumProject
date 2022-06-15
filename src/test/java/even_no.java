
public class even_no {
public static void main(String args[])
{
	int a[]= {2,5,6,7,8,9,12,14,15};
	int count=0;
	System.out.println("Even no are: ");
		for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
				System.out.println(a[i]);
				count++;
				}
			}
		System.out.println("Even no. count "+count);



}




}
