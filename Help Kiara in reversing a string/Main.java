// C++ program to print reverse of a string 
#include <bits/stdc++.h>
#include<iostream>
#include<string>
using namespace std; 

// Function to reverse a string 
void reverse(string str) 
{ 
for (int i=str.length()-1; i>=0; i--) 
	cout << str[i]; 
} 

// Driver code 
int main(void) 
{ 
	string s;
	getline(cin,s);
	reverse(s); 
	return (0); 
} 
