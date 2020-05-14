#include<iostream>
using namespace std;
int main()
{
  int num,n1=0,n2=1,n3,i;
  cin>>num;
  for(i=2;i<num;++i)
  {
   n3 = n1 + n2;
    n1 = n2;
    n2 = n3;
  }
  cout<<n3;
}