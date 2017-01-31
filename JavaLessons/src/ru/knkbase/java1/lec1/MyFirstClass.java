
package ru.knkbase.java1.lec1;



	public class MyFirstClass { 

		public static void main(String[] args) { 
		int array[] = new int [12]; 
		array[0] =1; 
		array[1] =1; 
		System.out.println(array[0]); 
		System.out.println(array[1]); 

		for (int i=2;i<20;i++){ 
		array[i]=(array[i-1]+array[i-2]); 

		System.out.println (array[i]); 
		} 


		}

	}
		
