
public class reverse_string {

	public static void main(String[] args)
	{
	   String str="hello sam";
	   int n=str.length();    //9
	   String str_rev="";     
	   char str_char;
//	  
//	    for(int i=0;i<n;i++)
//	    {
//	    	str_char=str.charAt(i);
//	    	str_rev=str_char+str_rev;
//	    }
//	    System.out.println("revered string: "+str_rev);
//	 
	
		   for(int i=str.length()-1;i>=0;i--)
		   {
		   
		     str_rev=str_rev+str.charAt(i);
		   }
			   System.out.println(str_rev);
			   
	  	}

}
