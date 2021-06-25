import java.util.Scanner;

class Squrt_withou_Fun
{
  public static void main(String[] args)
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("enter  a number :");
	  int n = s.nextInt();
	  float  sqrt, t = 0;
	  
	  sqrt = n/2;
	  if(n==1)
	  {
		  System.out.println("square root of " +n +" is " +n);
	  }
	  else
	  
	    while(sqrt != t)
	  {
		  t = sqrt;
		  sqrt = (n/t + t)/2;
	  
	  }
	  System.out.println(" Square root of " +n + " is " + sqrt);
  }

}
