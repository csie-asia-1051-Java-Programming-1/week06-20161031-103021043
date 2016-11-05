package hw;
/*
 * Topic:讓使用者輸入性別與身高，透過函數呼叫，依據男女不同,幫她(他)計算並輸出其標準體重
 *((1)男：(身高-170)*0.6+62 
 *(2)女：(身高-158)*0.5+52)。
 *函數算出結果後要回傳至主程式再印出結果。
 *例如:輸入 1 170 則輸出 62.0, 輸入 2 165 則輸出 55.5 
 * Date: 2016/10/31
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請選擇 1,2");
		int a=scn.nextInt();		
		System.out.print("請輸入身高");
		float h=scn.nextFloat();
		float w=0;
		fun(h, a);
	}
	private static void fun(float h,int a){
		if(a==1){
		    float w=(float) ((h-170)*0.6+62); 
		    System.out.println(w);
		    	}else if(a==2){
		    	float w=(float) ((h-158)*0.5+52);
		    		 System.out.println(w);
         }
	}
}
