package piggy;

import java.util.*;
import java.text.DecimalFormat;


public class Main {
	public static void main(String[] args){

		DecimalFormat fp = new DecimalFormat("$###,###.00"); 

		Bank dollar = new Bank(1.00);
		Bank quarter = new Bank(0.25);
		Bank dime = new Bank(0.10);
		Bank nickel = new Bank(0.05);
		Bank penny = new Bank(0.01);


		double ar[] = new double [8];
		ar[0] = quarter.getAll();
		ar[1] = dime.getAll();
		ar[2] = dollar.getMore(5);
		ar[3] = nickel.getMore(3);
		ar[4] = dime.getMore(7);
		ar[5] = dollar.getAll();
		ar[6] = penny.getMore(10);
		double adding = 0;
		for(int i = 0; i < ar.length;i++) adding +=i ;
			System.out.println(adding);
		
		//System.out.println(ar[1]);

		System.out.println(fp.format(ar[0]));
		System.out.println(fp.format(ar[1]));
		System.out.println(fp.format(ar[2]));
		System.out.println(fp.format(ar[3]));
		System.out.println(fp.format(ar[4]));
		System.out.println(fp.format(ar[5]));
		System.out.println(fp.format(ar[6]));
		System.out.println(fp.format(adding));

		System.out.println("testing ");

	}
}
