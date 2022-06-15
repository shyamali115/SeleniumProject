package looping;

public class while_loop {

	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			if(i==5)
			{
		       System.out.println("this is five ");
			   break;
			}
			i++;
		}

	}

}
