package Edureka_Maven;

import java.util.ArrayList;

public class JavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,3,5,23,44,32};
		for(int x : num) {
			System.out.println(x);
		}
		ArrayList a= new ArrayList();
		a.add("ram");
		a.add("Sham");
		a.add("Laxman");
		a.add(4);
		System.out.println(a.get(3));
		
		
		ArrayList b =new ArrayList();
		b.add("nmjh");
		b.add("ht");
		b.remove(0);
		System.out.println(b.get(0));
		
		String s="Hi Abhijit Das";
		String[] splittedString=s.split("Abhijit");
		System.out.println(splittedString[0].trim());
		System.out.println(splittedString[1].trim());
		
	}

}
