import java.io.*;

import java.text.SimpleDateFormat;
import java.util.Date;
class Homo {
	

	public static void main(String[] args) throws Exception{
	int day=12,month=8,year=1993;
	int BirthDate[]= {day,  month, year };
	String Name,Bistplace ="����" ,Sex = " Men", Adress,Passemitter,PassNumber ;
    
	BufferedReader s1 = new BufferedReader(new InputStreamReader(System.in));
	Name = s1.readLine();
		
	System.out.println("��� ��'� "+ Name +'\n'+ "̳���� ����������"  + Bistplace 
		+'\n'+"�����"+Sex);
	
	   SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
	   System.out.println("Data "+format);



	
}}

