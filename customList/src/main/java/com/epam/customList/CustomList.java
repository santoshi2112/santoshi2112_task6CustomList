package com.epam.customList;
import java.util.*;

public class CustomList<E>{
	int size=0;
	int default_size =10;
	Object ele[];
	
	public CustomList() {
		ele= new Object[default_size];
	}
	public void add(E e) {
		if(size==ele.length) {
			increaseSize();
		}
		ele[size++]=e;
	}
	@SuppressWarnings("unchecked")
	public E get(int i) {
		if(i>=size || i<0) {
			throw new IndexOutOfBoundsException("index "+i+" ,size "+i);
		}
		return (E) ele[i];
	}
	@SuppressWarnings("unchecked")
	public E remove(int i) {
		if(i>=size || i<0) {
			throw new IndexOutOfBoundsException("index "+i+" ,size "+i);
		}
		Object item=ele[i];
		int num=ele.length-(i+1);
		System.arraycopy(ele, i+1, ele, i, num);
		size--;
		return (E) item;
	}
	public int size() {
		return size;
	}
	public String  display() {
		String s;
		s="list is [";
		for(int i=0;i<size;i++) {
			s=s+ele[i];
			if(i<size-1) {
				s=s+(",");
			}
			
		}
		s=s+"]";
		System.out.println(s);
		return s;
	}
	public void increaseSize() {
		int nsize=ele.length*2;
		ele=Arrays.copyOf(ele,nsize);
	}
	
}





 