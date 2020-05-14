#include<iostream>
using namespace std;
long power (int, int);
int main()
{
  int pow, num;
  long result;
  cin>>num>>pow;
  result = power(num, pow);
  cout<<"Enter the value of a";
  cout<<"\nEnter the value of n";
  cout<<"\nThe value of "<<num<<" power "<<pow<<" is "<< result;
  return 0;
}
 
long power (int num, int pow)
{
  if (pow)
    return (num * power(num, pow - 1));
  return 1;
}