package com.Data.Structure;

public class Array {
	
	public int index;
	public int maxSize;
	public int[] array;
	
	public Array(int maxSize){
		this.maxSize = maxSize;
		array = new int[maxSize];
	}
	
	public void insert(int element){
		array[index++] = element;
	}
	
	public void print(){
		for(int x=0; x<index; ++x){
			System.out.print(array[x] + " ");
		}
		System.out.println();
	}
	
	public int findIndex(int x){
		if(x<0 || x>=index){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			return array[index];
		}
	}
	
	public int findElemenet(int element){
		int x;
		for(x=0; x<index; ++x){
			if(array[x] == element){
				break;
			}
		}
		if(x == index){
			return -1;
		}else{
			return x;
		}
	}
	
	public void remove(int element){
		int x;
		for(x=0; x<index; ++x){
			if(array[x] == element){
				break;
			}
		}
		while((x+1) < index){
			array[x] = array[++x];
		} 
		index -= 1;	//每次进来都会删除一个，所以每次进来数组下标要减1，防止后面的元素重复输出如：0 1 2 3 3
	}
	
}
