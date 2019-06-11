package org.network;

public class Wifi {
public void wifiName(String s)
{
	System.out.println(s);
}
	public static void main(String[] args) {
		Wifi  b=new  Wifi();
		MobileData c=new MobileData();
		Lan d=new Lan();
		Wireless e=new Wireless();
		b.wifiName("Airtel");
		c.dataName("4G");
		d.lanName("zak");
		e.wirelessName("CPH13");
		
		
		

	}

}
