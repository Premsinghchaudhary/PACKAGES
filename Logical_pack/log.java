package LOGICAL_PACK;
import ASSIGNMENT_PACK.assignnment;
public class log extends assignnment{
	
	
	public void logical_opr() // create function for logical_opr.
	{
		System.out.println("THIS IS FOR LOGICAL OPERATION");
		aceept();
	    //AND
		System.out.println(" Te logical opr.");
		System.out.println(" The AND opr. is : "+ ( a>b&&a>b ) );
		System.out.println(" The AND opr. is : "+ ( a>b&&a<b ) );
		System.out.println(" The AND opr. is : "+ ( a<b&&a>b) );
		System.out.println(" The AND opr. is : "+ ( a<b&&a<b) );
		//OR 
		System.out.println(" The OR opr. is : "+ ( a>b||a>b ) );
		System.out.println(" The OR opr. is : "+ ( a>b||a<b ) );
		System.out.println(" The OR opr. is : "+ ( a<b||a>b) );
		System.out.println(" The OR opr. is : "+ ( a<b||a<b) );
		//NOT
		System.out.println(" The ! opr. is : "+ ( a>b|a>b ) );
		System.out.println(" The ! opr. is : "+ ( a>b|a<b ) );
		System.out.println(" The ! opr. is : "+ ( a<b|a>b) );
		System.out.println(" The ! opr. is : "+ ( a<b|a<b) );
	}
}
