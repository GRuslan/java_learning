import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
class Homo {
	

	public static void main(String[] args) {
	int day1=25,month1=12,year1=1993;
	int BirthDate[]= {day1,  month1, year1 };
	String Name,Bistplace ="Львів" ,Sex = " Men", Adress,Passemitter,PassNumber ;

	/*BufferedReader s1 = new BufferedReader(new InputStreamReader(System.in));
	Name = s1.readLine();*/
	Name= "Ruslan";
		
	System.out.println("Твоє ім'я "+ Name +'\n'+ "Місьце народження"  + Bistplace 
		+'\n'+"Стать"+Sex);

	GregorianCalendar today = new GregorianCalendar();
	int year = today.get(Calendar.YEAR);
	int date = today.get(Calendar.DATE);
	int month = today.get(Calendar.MONTH);
	int spf[]={date,month,year};
	 System.out.println("What"+spf[2]);	 

	  int vik;
	int age[]=new int [3];
  
	for(int i=0;i<3;i++){   //тут мало бути 2 а не 3 так як в масивах рахуэться 0 1 2	
    age[i]=spf[i]-BirthDate[i];}

	if (age[0]<0){
		
	vik=age[2]-1;}
	if (age[1]<0){
		
	vik=age[2]-1;}

	
	else 
		{vik=age[2];}


	System.out.println(vik);			
				}}
	
 
