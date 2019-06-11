package org.company;

public class CompanyInfo {
	public void companyName(String a)
	{
		System.out.println("Company name is "+a);
	}
	public void companyId(int a)
	{
		System.out.println("Company id is "+a);
	}
	public void companyAddress(int number,char j,String a)
	{
		System.out.println("Address is  " + number + "," + j + "," +a);
	}
	
 
	public static void main(String[] args) {
		CompanyInfo d=new CompanyInfo();
		d.companyName("mCode llp");
		d.companyId(234);
		d.companyAddress(10, 'f', "Pammal");

	}

}
//companyName(),companyId(),companyAddress()