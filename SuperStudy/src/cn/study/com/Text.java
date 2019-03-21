package cn.study.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Text {
	int pos1;
	public void LianTong() {
		
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException,ArithmeticException {
		// TODO Auto-generated method stub
		
//		Vector<Comparable> myVector=new Vector();
//		myVector.add("welcome");
//		myVector.add(new Integer(1));
//		ArrayList myList=new ArrayList();
//		myList.add("welcome");
//		myList.add("dajoidoa");
//		System.out.println(myList.get(1));
//		
//		int a;
//		a=System.in.read();
//		System.out.println(a);
//		int a;
//		try {
//			a=5/0;
//			System.out.println(a);
//		} catch (ArithmeticException e) {
//			System.out.println("算术错误");
//			
//		} finally {
//			System.out.println("程序运行结束");
//		}
//		try {
//		Text1 a=new Text1();
//		int result=a.cal(5, 0);
//		System.out.println(result);}catch(ArithmeticException e) {
//			System.out.println("发生算术异常："+e.toString());
//		}
//		Text1 a=new Text1();
//		int result=a.cal(5, 0);
//		System.out.println(result);
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入行：");
		int x=sc.nextInt();
		System.out.println("请输入列：");
		int y=sc.nextInt();
		int[][] arr=new int[x][y];
		int flag=2;
		int m,n,pos=0;
		boolean tag=true;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[x-1].length;j++) {
				tag=true;
				if(flag%2==0) {
					pos=(int)(Math.random()*9+1);
					
				}
				while(tag) {
					if(arr[m=(int)(Math.random()*x)][n=(int)(Math.random()*y)]==0) {
						arr[m][n]=pos;
						flag++;
						tag=false;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[x-1].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("\n");
		}
//		System.out.print("请输入要消除的两个坐标的行列：");
//		int x1=sc.nextInt()-1;
//		int y1=sc.nextInt()-1;
//		int x2=sc.nextInt()-1;
//		int y2=sc.nextInt()-1;
		boolean tager=true;
		while(tager) {
			System.out.print("请输入要消除的两个坐标的行列：");
			int x1=sc.nextInt()-1;
			int y1=sc.nextInt()-1;
			int x2=sc.nextInt()-1;
			int y2=sc.nextInt()-1;
			if(x1==x2&&y1==y2) {
			System.out.println("同一点无法消除！！！");
		}else if(arr[x1][y1]!=arr[x2][y2]) {
			System.out.println("值不同无法消除！！！");
		}else
		 {
			if(x1==x2&&y1>y2) {
				int tag1;
				for(tag1=y1-1;tag1>=y2;tag1--) {
					if(arr[x1][tag1]!=0) {
						tag1=arr[x1][tag1];
						break;
					}
					
				}
				if(tag1==y2) {
					arr[x1][y1]=0;
					arr[x2][y2]=0;
				}
			}else if(x1==x2&&y1<y2) {
				int tag1;
				for(tag1=y2-1;tag1>=y1;tag1--) {
					if(arr[x1][tag1]!=0) {
						
						break;
					}
					
				}
				if(tag1==y1) {
					arr[x1][y1]=0;
					arr[x2][y2]=0;
				}
			}
			
			if(y1==y2&&x1>x2) {
				int tag1;
				for(tag1=x1-1;tag1>=x2;tag1--) {
					if(arr[tag1][y1]!=0) {
						tag1=arr[tag1][y1];
						break;
					}
					
				}
				if(tag1==x2) {
					arr[x1][y1]=0;
					arr[x2][y2]=0;
				}
			}else if(y1==y2&&x1<x2) {
				int tag1;
				for(tag1=x2-1;tag1>=x1;tag1--) {
					if(arr[tag1][y1]!=0) {
						
						break;
					}
					
				}
				if(tag1==x1) {
					arr[x1][y1]=0;
					arr[x2][y2]=0;
				}
			}
			if(x1!=x2&&y1!=y2) {
				
			}
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[x-1].length;j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.print("\n");
			}
			
			
		}
	
	}

	}	
	
	
}
