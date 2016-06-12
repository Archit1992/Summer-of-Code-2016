/**************************************************************
* Author    : Archit, Gajjar
* Date      : 12, June 2016
* Time      : 12:15 (IST)
* IDE       : Notepad++
* Version   : cpp 5.1.0 
**************************************************************/
#include<iostream>
using namespace std;

void f(){
	cout << "hello world";
}
int avg(int a, int b){
	return (a+b)/2; // return avg value.
}
int main(){
	
	f(); // call to f() function.
	int avgVal = avg(2,4); // calling avg() and return avg value.
	cout << " avg value is ::" << avgVal; // print avg value.
}