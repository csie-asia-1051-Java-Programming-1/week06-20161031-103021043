package hw;
/*
 * Topic:�г]�p�@�Ө��fun(v1, type)�A���ϥΪ̿�J�@�ӷū׭Ȥέp��覡
 * (type ��1 �� �ؤ�->���Atype��2�����->�ؤ�)�A��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C
 * (F=C*9/5+32), (C = (F-32) * (5/9)�A
 * �Ҧp��J100 1 �h��X 37.77778 ; ��J 37.77778 2 �ɫh��X 100.0
 * Date: 2016/10/31
 * Author: 103021043 ��z�B
 */
import java.util.Scanner;
public class hw01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�� 1,2");
		int type=scn.nextInt();		
		System.out.print("�п�J�X��");		 
		float v1=scn.nextFloat();
		fun(v1, type);
			}
	private static void fun(float v1,int type){
		if(type==1){
		    float C=(v1-32)*5/9; 
		    System.out.println("���ū׬�"+C);
		    	}else if(type==2){
		    		 System.out.print("�п�J���X��");
		    		 float F=v1*9/5+32;
		    		 System.out.println("�ؤ�ū׬�"+F);
		    	}
			}
		}
	

