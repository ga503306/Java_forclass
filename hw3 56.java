import java.util.*;
import java.io.*;

class A{
	public static void main(String[]  args) throws Exception{
	Scanner scn = new Scanner(new File("account.dbs"));
	String [][] accounts = new String[1000][2];

	scn.nextLine();
	int i=0;
	while(scn.hasNext()){
		accounts[i][0] = scn.next();
		accounts[i++][1] = scn.next();
	}
	
	for(String[] account : accounts){
		for(String s : account)
			System.out.print(s + "\t");
		System.out.println();

		}
	scn.close();
	Scanner scn2 = new Scanner(System.in);
	String input=""; 
	int key = -1;
	int pos = -1;
	do{
		System.out.print("Input key : ");
		input = scn2.next();
		for(int count=0;count<account.length;count++){
			if(input.equals(account[count][0])){ //對比帳號 成功後再對比其帳號的密碼
				cor++; //若有此帳號則判斷變數+1
				System.out.println("請輸入密碼"); 
				input = user.next();
				if(inputpw.equals(account[count][1]))){
					System.out.println("帳號密碼正確 歡迎登入");
					key=1;
					break;
				}
				else{
					System.out.println("密碼錯誤");
					break;
				}	
			}
		}
		
	}while(key > 0);

	}

}