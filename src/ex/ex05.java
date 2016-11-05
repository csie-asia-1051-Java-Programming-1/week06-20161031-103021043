package ex;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。
 * 例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一個大正整數值");
		String a=scn.next();
		char data[]=a.toCharArray();
		int sum=0;
		int lan=data.length;
		for(int i=0;i<lan;i++){
		sum=sum+Integer.parseInt(data[i]+"");
		
	}
		System.out.println(""+sum);
}
	}