package com.girnarsoft.hospitalManagement.client;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Validation {

	Scanner scanner ;

	public int integerValidation(String checkChoice)
	{
		while(true)
		{
			System.out.println(checkChoice);
			scanner = new Scanner(System.in);
			try
			{
				int choice;
				String takeInput = scanner.nextLine();
				choice = Integer.parseInt(takeInput);
				return choice;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Please enter integer value only");


			}
		}
	}



	public String stringValidation(String strValidating)
	{
		scanner = new Scanner(System.in);
		String name = "";

		while(true)
		{

			System.out.println("Enter "+ strValidating);
			name = scanner.nextLine();

			String validationFormate = ".*[A-Za-z].*";;

			boolean b = name.matches(validationFormate);

			if(!b)
			{
				System.out.println("invalid "+strValidating);
				continue;
			}
			else
			{
				return name;
			}		
		}
	}
	public String dateValidation(String chackingInput)
	{
		
		int birthDay=1;
		int birthMonth=1;
		int birthYear=1;

		
		Validation validation;
		scanner=new Scanner(System.in);		
		 
		while(true)
		{
			System.out.println(chackingInput); 
			String birthdaycheck ;
			validation = new Validation();

			birthdaycheck = "birth month";
			birthMonth = validation.integerValidation(birthdaycheck);
			
			birthdaycheck = "birth day";
			birthDay = validation.integerValidation(birthdaycheck);
			
			birthdaycheck = "birth year";
			birthYear = validation.integerValidation(birthdaycheck);
			
			
			if(birthMonth==1 || birthMonth==3 || birthMonth==5 || birthMonth==7 || birthMonth==8 || birthMonth==10 || birthMonth==12)
			{
				if(birthDay>=1 && birthDay <=31)
				{
					return birthMonth+"/"+birthDay+"/"+birthYear;
				}
				else
				{
					System.out.println("plase enter correct date");
					continue;
				}
			}
			else if(birthMonth==4 || birthMonth==6 || birthMonth==9 || birthMonth==11)
			{
				if(birthDay>=1 && birthDay <=30)
				{
					return birthMonth+"/"+birthDay+"/"+birthYear;
				}
				else
				{
					System.out.println("plase enter correct date");
					continue;
				}				
			}			
			else if(birthMonth==2)
			{
				if(birthYear%100==0)
				{
					if(birthYear%400==0)
					{
						if(birthDay>=1 && birthDay<=29)
						{
							return birthMonth+"/"+birthDay+"/"+birthYear;
						}
						else
						{
							System.out.println("plase enter correct date");
							continue;
						}
					}
					else
					{
						if(birthDay>=1 && birthDay<=28)
						{
							return birthMonth+"/"+birthDay+"/"+birthYear;
						}
						else
						{
							System.out.println("plase enter correct date");
							continue;
						}
					}
					
				}
				else if(birthYear%4==0)
				{
					if(birthDay>=1 && birthDay<=29)
					{
						return birthMonth+"/"+birthDay+"/"+birthYear;
					}
					else
					{
						System.out.println("plase enter correct date");
						continue;
					}
				}
				else
				{
					if(birthDay>=1 && birthDay<=28)
					{
						return birthMonth+"/"+birthDay+"/"+birthYear;
					}
					else
					{
						System.out.println("plase enter correct date");
						continue;
					}
				}
			}
			else
			{
				System.out.println("please enter correct date");
				continue;
			}
		}
	}
	
	
public String genderValidation() {
	
	String gender;		
		while(true)
		{
			System.out.println("Enter paitent Gender \n if patient "
					+ "is male then enter m or M \n patient is female then enter f or F");
			scanner = new Scanner(System.in);
			gender = scanner.nextLine();
			if(gender.equals("f") || gender.equals("F"))
			{
				gender = "female";
				return gender;
			}
			else if(gender.equals("m") || gender.equals("M"))
			{
				gender = "Male";
				return gender;
			}
		}
	}
	
}