
package ru.knkbase.java1.lec1;



public class Power { 

 public static void main(String args [])  {
	 System.out.println("3 � ������� 4 ��������� " + metod(3,4));
 }
 
static int metod(int a, int b){
	int � = 1;

	for (;b>0;b--){
	� = a*�;
 }
	return �;
}
                           }