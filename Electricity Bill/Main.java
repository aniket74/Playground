#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int consumed,bill_rs;
  cin>>consumed;
  if(consumed <= 200)
     {
    bill_rs = consumed * 0.5;
      cout<<"Rs."<<bill_rs; 
     }
  else if(consumed >= 201 && consumed <= 400)
     {
    bill_rs = consumed * 0.65 + 100;
       cout<<"Rs."<<bill_rs;
     }
  else if(consumed >= 401 && consumed <= 600)
     {
    bill_rs = consumed * 0.80 + 200;
       cout<<"Rs."<<bill_rs;
     }
  else if(consumed > 600)
     {
    bill_rs = consumed * 1.25 + 425;
       cout<<"Rs."<<bill_rs;
     }
     
     }