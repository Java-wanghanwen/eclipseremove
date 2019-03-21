package cn.study.com;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in=new Scanner(System.in);
		Shu[] a=new Shu[7];
		for(int i=0;i<7;i++) {
			a[i]=new Shu(i, i);
			a[i].show(0,0);
		}
		//int[] a=new int[7];
		for(int i=0;i<7;i++) {
			Scanner in=new Scanner(System.in);
			//
			 a[i].Start=in.nextInt();
			 //a[i].end=in.nextInt();
			}
		for(int i=0;i<7;i++) {
			Scanner in=new Scanner(System.in);
			 a[i].end=in.nextInt();
		}
		int i=0;
		int sum=a[i].Start+a[i].end;
		for(int j=1;j<7;j++){
			if(a[j].Start>a[i].end) {
				i=j;
				sum+=a[j].end-a[j].Start+1;
			}
		}
		System.out.println(sum);
	}

}
