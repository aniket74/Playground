#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  float time,res,temp,t;
  cin>>num>>time;
  temp = num * time;
  t = ((time / 100)*50);
  if(num == 1)
    cout<<time;
  else if(num == 2)
  	cout<<temp-t;
  else if(num == 3)
    cout<<time*2;
  else
    cout<<"Number of items is more";
}