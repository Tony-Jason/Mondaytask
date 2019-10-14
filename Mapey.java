package com.assignment;
import java.util.*;

public class Mapey {
	
   TreeMap<Integer, String> treemap = new TreeMap<Integer,String>();
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapey may = new Mapey();
		Scanner sc = new Scanner(System.in);
		int option = 0;
		do {
			   System.out.println("1.Insert Key and value pair");
     	   System.out.println("2.Copy to another map");
     	   System.out.println("3.Search an element based on key or value ");
     	   System.out.println("4.Least and Greatest Key-Value pair");
     	   System.out.println("5.Reverse Order View");
     	   System.out.println("6.Values less than desired key value");
     	   System.out.println("7.Values within a prescribed range");
     	   System.out.println("8.View");
     	  System.out.println("9.Exit");
     	
       	 System.out.println("Select an Option:")  ;
       	 int cs = sc.nextInt();
       	 sc.nextLine();
       	 switch(cs) {
       	 case 1:
       		 System.out.println("Enter Key(number) Value");
       		 int i = sc.nextInt();
       		
       		 System.out.println("Enter Element");
       		 String s = sc.next();
       		 may.add(i,s);
       		 break;
       	 case 2:
       		 System.out.println("Copy of the Map");
       		 may.cpy();
       		 break;
       	 case 3:
       		 
       			 System.out.println("1.Search based on key");
       			 System.out.println("2.Search based on value");
       			 System.out.println("Select an option");
       			 int sel = sc.nextInt();
       			 sc.hasNextLine();
       			 switch(sel) {
       			 case 1:
       				 System.out.println("Enter key value:");
       				 may.searchId(sc.nextInt());
       				 
       				 break;
       			 case 2:
       				 System.out.println("Enter element value:");
       				 may.searchVal(sc.next());
       				 break;
       			
       			 }
       			 break;
       	 case 4:
       		 System.out.println("Least key-value pair" + may.treemap.firstEntry());
       		 System.out.println("Greatest key-value pair" + may.treemap.lastEntry()); 
       		 break;
       	 case 5:
       		 System.out.println("Reverse Order View" + may.treemap.descendingMap());
       		 break;
       	 case 6:
       		System.out.println("Portion of map less than given key");
			SortedMap<Integer,String> sortMap=new TreeMap<>();
		
			sortMap =may.treemap.headMap(sc.nextInt());
			System.out.printf("%-15s %-15s\n","Employee id","Employee Name");
			for(Integer x:sortMap.keySet()) {
				System.out.println(x + " : " + may.treemap.get(x));
			}
       		 break;
       		 
       	case 7: 
       		System.out.println("Enter starting key");
		int start=sc.nextInt();
		System.out.println("Enter ending key");
		int end=sc.nextInt();
		SortedMap<Integer,String> srmap=new TreeMap<>();
	
		srmap=may.treemap.subMap(start, true, end, false);
		for(Integer y:srmap.keySet()) {
			System.out.println(y + " : " + may.treemap.get(y));
		}
		break;
       	 case 8:
       		 for(int v:may.treemap.keySet()) {
       			 System.out.println(v + " : " + may.treemap.get(v));
       		 }
       		 break;
       	 case 9:
       		 option = -1;
       		 break;
       	 }
		}while(option != -1);

	}
	public void add(int i, String s) {
		treemap.put(i,s);
		
	}
	
	public void cpy() {
		TreeMap<Integer, String> cpymap = new TreeMap<Integer,String>(treemap);
		for(int i:treemap.keySet()) {
			System.out.println(i + " :"+ " " + cpymap.get(i));
		}
		
	}
	public void searchId(int i) {
		if(treemap.containsKey(i)) {
			System.out.println(i + " : " + treemap.get(i) );
		}
	}
	
	public void searchVal(String s) {
		for(int i:treemap.keySet()) {
			if(treemap.get(i).equalsIgnoreCase(s))
				System.out.println(i + " : " + treemap.get(i));
		}
	}
	
	
	}



