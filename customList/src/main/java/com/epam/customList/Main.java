package com.epam.customList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomList<Integer> l=new CustomList<>();
		l.add(21);
		l.add(22);
		l.add(23);
		l.display();
		System.out.println("getting first element "+l.get(0));
		System.out.println("Size is "+ l.size());
		System.out.println("removing 3rd element "+l.remove(2));
		l.display();
		
		
	}

}
