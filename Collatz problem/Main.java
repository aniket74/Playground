#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
int n,cnt = 0;
cin>>n;
while (n != 1) 
	{ 
    	cout<<n<<"\n"; 
		if (n & 1) 
			n = 3*n + 1;
        else
			n = n/2;
  cnt++;
    } 
cout<<n; 
  cout<<"\n"<<cnt;
}