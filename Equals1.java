package Handson;

public class Equals1 {

	public static void main(String[] args) {
		String str1= new String("hello");
		String str2=new String("hello");
		System.out.println(str1==str2);// checks for the reference
		System.out.println(str1.equals(str2));//checks for the content 

}
}
