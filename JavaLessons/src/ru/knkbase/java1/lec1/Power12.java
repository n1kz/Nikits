
package ru.knkbase.java1.lec1;



public class Power { 

 public static void main(String args [])  {
	 System.out.println("3 в степени 4 равняется " + metod(3,4));
 }
 
static int metod(int a, int b){
	int с = 1;

	for (;b>0;b--){
	с = a*с;
 }
	return с;
}
                           }