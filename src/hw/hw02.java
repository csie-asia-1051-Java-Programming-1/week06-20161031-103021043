package hw;
/*
 * Topic:���ϥΪ̿�J�ʧO�P�����A�z�L��ƩI�s�A�̾ڨk�k���P,���o(�L)�p��ÿ�X��з��魫
 *((1)�k�G(����-170)*0.6+62 
 *(2)�k�G(����-158)*0.5+52)�C
 *��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C
 *�Ҧp:��J 1 170 �h��X 62.0, ��J 2 165 �h��X 55.5 
 * Date: 2016/10/31
 * Author: 103021043 ��z�B
 */
import java.util.Scanner;
public class hw02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�� 1,2");
		int a=scn.nextInt();		
		System.out.print("�п�J����");
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
