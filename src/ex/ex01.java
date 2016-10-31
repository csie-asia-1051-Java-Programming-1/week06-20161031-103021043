package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c字元，印出邊長為 n之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex01 {
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int h1=scn.nextInt();
		String str=scn.next();
		for (int i=0;i<h1;i++){
			for (int j=0;j<h1;j++){
				System.out.print(str);
			}
			System.out.println();
		}
	}
}


