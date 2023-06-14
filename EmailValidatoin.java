package org.sample.email;

import java.util.Scanner;

public class EmailValidatoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String emails[]= {"navin2403@gmail.com","pravin11@gmail.com","vishal75@gmail.com","anand07@gmail.com"};
		boolean flag = false;
		
		System.out.println("The list of Employee email address :");
		for(int i=0; i<emails.length; i++) {
			System.out.println(emails[i]);
		}
		
		System.out.println("\nEmail ID Searching for Employee in List Provide :");
		String user = sc.nextLine();
		for(int i = 0; i<emails.length; i++) {
			if(user.equals(emails[i])) {
				System.out.println("\nUser Searching Employee Email ID is found : "+emails[i]);
				flag = true;

			}
					
	   }
		
		if(flag == false) {
			System.out.println("\nUser Searching Employee Email ID is not found :");
			
		}
		
		
	}
}
	


