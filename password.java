import java.io.*;
import java.util.*;
import javax.swing.*;

public class password {
public static void main (String[] args) throws Exception
{
	File f = new File("C:\\account.dbs");
	Scanner input = new Scanner(f);           //讀檔用
	Scanner scan = new Scanner(System.in);    //使用者輸入
    String data;
	String tmp;
	String tempString=""; 
	String userAccount=""; 
	String userPassword="";
	
	int i=1;            
	int j=0,k=0,l=0;
    int countline=0;

	
	while(input.hasNextLine())
	{
	
 if(i%299==0){
    System.out.print("push Enter to continue"); //每三百個暫停
  scan.nextLine();
	}
	    countline++;
	    tmp=input.nextLine();
		System.out.println(tmp);
		i++;
}
	input.close();
	File g= new File("C:\\account.dbs");
	String[] tempArray = new String[countline];  //宣告動態陣列
	String[] Account = new String[countline];
    String[] Password = new String[countline];
	Scanner input2 = new Scanner(g);
	
	while (input2.hasNextLine()){      //當有下一行的時候 迴圈繼續
	data = input2.nextLine();          //把每一行 丟進data
     tempString = data;                //丟到暫存 字串陣列
	 
     tempArray = tempString.split("	"); // 空白分割 
     
     Account[k] = tempArray[0];         //分別丟進帳號陣列 和密碼陣列
     Password[l] = tempArray[1];
	 k++;l++;
	}	
          
			  System.out.print("\nEnter Account \n");  
	        userAccount = scan.nextLine();
			  System.out.print("\nEnter Password \n");
			 userPassword = scan.nextLine();
		
			
	
     for(j=0;j<countline-1;j++){           
	 if(Account[j].equals(userAccount)==true)
	 break;
	 }
	 
	 
	 if(Password[j].equals(userPassword)==true){        //對照密碼是否相同
	 
	  JOptionPane.showMessageDialog(null, "Welcome  "+ userAccount  );
	  
	 //System.out.print("\nWelcome  "+ userAccount + "\n");
	 }
	else 
	JOptionPane.showMessageDialog(null, "Password Wrong" );
	//System.out.print("\nPassword Wrong\n");
	
	
}
}
