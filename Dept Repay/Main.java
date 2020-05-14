#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int amount,r,n;
  float interest,total_amount,disc,final_s;
  cin>>amount>>r>>n;
  interest = (amount * n * r)/100;
  total_amount = interest + amount;
  disc = interest * 0.02;
  final_s = total_amount - disc;
  cout<<interest<<"\n"<<total_amount
    <<"\n"<<disc<<"\n"<<final_s;
}