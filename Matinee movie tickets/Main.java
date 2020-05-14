#include<iostream>
using namespace std;
int main()
{
  int age;
  float tim,a=13.30;
  cin>>age>>tim;
  if(age>13)
  {
  	if(tim==a)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  }
  else if(age<13)
  {
  	if(tim==a)
      cout<<"$2.00";
    else 
      cout<<"$4.00";
  }
}
