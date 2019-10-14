package com.assignment;

import java.util.*;

public class Insert {
	
	List<String> element = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Insert a = new Insert();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int option = 0;
		do {
			   System.out.println("1.Insert elements");
        	   System.out.println("2.Insert element at 1st position");
        	   System.out.println("3.Retrive element");
        	   System.out.println("4.Search element");
        	   System.out.println("5.Sort Array");
        	   System.out.println("6.Shuffle Array");
        	   System.out.println("7.Reverse the Array");
        	   System.out.println("8.Exit");
          	 System.out.println("Select an Option:")  ;
          	 int cs = sc.nextInt();
          	 sc.nextLine();
          	 switch(cs) {
          	 case 1:
          		 System.out.println("Enter a name");
          		 a.add(sc.next());
          		 break;
          	 case 2:
          		 System.out.println("Enter element to be palced at 1st position");
          		 a.ins(sc.next());
          		 break;
          	 case 3:
          		 System.out.println("Enter the index of Element to be retrived");
          		 a.ret(sc.nextInt());
          		 break;
          	 case 4:
          		 System.out.println("Enter the element to be searched:");
          		 a.find(sc.next());
          		 break;
          	 case 5:
          		 System.out.println("Sorted Array");
          		a.st();
          		 break;
          	 case 6:
          		 System.out.println("Shuffled List");
          		 a.shf();
          		 break;
          	 case 7:
          		 System.out.println("Reverse order");
          		 a.rvs();
          		 break;
          	 case 8:
          	     option = -1;
          	     break;
          	 }
          	
		}while (option != -1);
		
	}
	
	public void add(String name) {
		element.add(name);
	}
	public void ins(String s) {
		element.add(0,s);
	}
	public void ret(int i) {
		String x = element.get(i);
		System.out.println("Element Retrived : " + x);
	}
	
	public void find(String s) {
		int index = element.indexOf(s);
		if(index != -1) {
			System.out.println("Element" + s + "is present at" +index);
		}
		else {
			System.out.println("Element is not present!!");
		}
	}
	
	public void st() {
		Collections.sort(element);
		for(String s: element) {
			System.out.println(s);
		}
	}
	
	public void shf() {
		Collections.shuffle(element);
		for(String s: element) {
			System.out.println(s);
		}
	}
	
	public void rvs() {
		Collections.reverse(element);
		for(String s: element) {
			System.out.println(s);
		}
			
	}

}
