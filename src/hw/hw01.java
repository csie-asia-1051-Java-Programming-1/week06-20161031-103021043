package hw;
/*
 * Topic:請設計一個函數fun(v1, type)，讓使用者輸入一個溫度值及計算方式
 * (type 為1 時 華氏->攝氏，type為2時攝氏->華氏)，函數算出結果後要回傳至主程式再印出結果。
 * (F=C*9/5+32), (C = (F-32) * (5/9)，
 * 例如輸入100 1 則輸出 37.77778 ; 輸入 37.77778 2 時則輸出 100.0
 * Date: 2016/10/31
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請選擇 1,2");
		int type=scn.nextInt();		
		System.out.print("請輸入幾度");		 
		float v1=scn.nextFloat();
		fun(v1, type);
			}
	private static void fun(float v1,int type){
		if(type==1){
		    float C=(v1-32)*5/9; 
		    System.out.println("攝氏溫度為"+C);
		    	}else if(type==2){
		    		 System.out.print("請輸入攝氏幾度");
		    		 float F=v1*9/5+32;
		    		 System.out.println("華氏溫度為"+F);
		    	}
			}
		}
	

