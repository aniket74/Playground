#include<iostream>
using namespace std;
int main()
{
long n;
  int count = 0;
  cin>>n;
  do
  {
    n = n / 10;
    ++count;
  }while(n != 0);
  cout<<count;
}