package com.Data.Structure;

public class TestArray {
	public static void main(String[] args){
		
		Array array = new Array(10);	//���������Ĳ�������������Ĳ���
		for(int index=0; index<5; ++index){
			array.insert(index);
		}
		array.print();
		System.out.println(array.findIndex(0));
		System.out.println(array.findElemenet(4));
		array.remove(0);
		array.remove(1);
		array.remove(4);
		array.print();
		
	}
}
