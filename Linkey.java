package com.assignment;

import java.util.*;

public class Linkey {
	LinkedList<String> element = new LinkedList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkey lin = new Linkey();
	
		Scanner sc = new Scanner(System.in);
		int option = 0;
		do {
			   System.out.println("1.Insert elements");
     	   System.out.println("2.Append element at end position");
     	   System.out.println("3.Iterate from a specified position");
     	   System.out.println("4.Linked List Reverse Order");
     	   System.out.println("5.First and Last Occurance");
     	   System.out.println("6.Retrive Element");
     	   System.out.println("7.Linked List to ArrayList");
     	   System.out.println("8.Retrive and Remove 1st Element ");
     	   System.out.println("9.View Element of the List");
     	   System.out.println("10.Exit");
       	 System.out.println("Select an Option:")  ;
       	 int cs = sc.nextInt();
       	 sc.nextLine();
       	 switch(cs) {
       	 case 1:
       		 System.out.println("Enter element");
       		 lin.add(sc.next());
       		 break;
       	 case 2:
       		 System.out.println("Enter element to be appended at the end");
       		 lin.add(sc.next());
       		 break;
       	 case 3:
       		 System.out.println("Enter the index from which the iteration to begin");
       		 lin.itt(sc.nextInt());
       		 break;
       	 case 4:
       		 System.out.println("List in reverse Order");
       		 lin.rvs();
       		 break;
       	 case 5:
       		 System.out.println("Element to be Searched:");
       		  String s = sc.next();
       		  lin.occ(s);
       		 break;
       	 case 6:
       		 System.out.println("Enter the index of Element to be Retrived");
       		lin.rev(sc.nextInt());
       		 break;
       	 case 7:
       		lin.arl();
       		 break;
       	 case 8:
       	     String rem = lin.element.remove();
       	     System.out.println(rem);
       	     break;
       	 case 9:
       		 for(String ing: lin.element) {
       			 System.out.println(ing);
       		 }
       		 break;
       	 case 10:
       		 option = -1;
       	 }
       	
		}while (option != -1);

	}
	
	public void add(String s) {
		element.add(s);
	
	}
	
	public void itt(int i) {
		ListIterator<String> a = element.listIterator(i);
		while(a.hasNext()) {
			System.out.println(a.next()+ " ");
		}
	}
	
	public void rvs() {
		Iterator a = element.descendingIterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
	}
	
	public void occ(String s) {
		int fis = element.indexOf(s);
		int las = element.lastIndexOf(s);
		
		System.out.println("First Index of "+ s+ " is "+ fis +" and last index is " + las);
	}
	public void rev(int i) {
		 String ret =  element.get(i);
		 System.out.println("Element retrived " + ret);
	}
     
	public void arl() {
		List<String> Arrayl = new ArrayList<String>(element);
		for(String s: Arrayl) {
			System.out.println(s);
		}
	}
}
