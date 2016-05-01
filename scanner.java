import java.io.*;
import java.util.*;
public class scanner {
public static void main (String[] args) throws Exception
{
	File f = new File("C:\\LifeJacketIns.txt");
	Scanner input = new Scanner(f);
	String tmp;
	int i=0;
	int count=0;
	int countline=1;
	int countbyte=1;
	int countnumber=0;
	
	while(input.hasNextLine())
	{
	    countline++;
		tmp=input.nextLine();
		System.out.println(tmp);
	}
	input.close();
	Scanner input2 = new Scanner(f);
		while(input2.hasNext())
	{
	    if(input2.hasNextInt())
		countnumber++;
		input2.next();
		
	}
	input2.close();
	Scanner input3 = new Scanner(f);
	while(input3.hasNext())
	{
	    if(input3.hasNext())
		countbyte++;
		input3.next();
		
	}

System.out.println(countline+" LINES");
System.out.println(countbyte+" WORDS");
System.out.println(countnumber+" NUMBERS");
}
}