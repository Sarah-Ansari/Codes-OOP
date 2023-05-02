package utils;

import static com.app.cust.ServicePlan.valueOf;

import java.util.Scanner;

import com.app.cust.ServicePlan;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ServicePlan splan=valueOf(sc.next());
	}

}
