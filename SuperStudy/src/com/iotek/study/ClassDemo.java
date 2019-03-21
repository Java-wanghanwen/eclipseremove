package com.iotek.study;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//对象名。getcalss
//		Employee employee=new Employee("zhangsan",30);
//		Class<?> classtype=employee.getClass();
//		System.out.println(classtype.getName());
//		System.out.println(classtype.getSuperclass().getName());
		
		
		//类名.class
//		Class<?> classtype=Employee.class;
//		System.out.println(classtype.getName());
//		System.out.println(classtype.getSuperclass().getName());
		
		
		//使用class.forname();
//		try {
//			Class<?> classtype=Class.forName("com.iotek.study.Employee");
//			System.out.println(classtype.getName());
//			System.out.println(classtype.getSuperclass().getName());
//		} catch (ClassNotFoundException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
		
		//获取基本数据类型的class对象
		
//		Class<?> classtype=int.class;
//		System.out.println(classtype.getName());
	
		//通过基本数据类型的包装类来获取对应的基本数据类型对相应的对象
//		Class<?> classtype=Double.TYPE;
//		System.out.println(classtype.getName());
//		System.out.println(classtype.getSuperclass().getName());
		
		Class<?> classtype=Double.class;
		System.out.println(classtype.getName());
		System.out.println(classtype.getSuperclass().getName());
	}
	
	
}
class Employee{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}