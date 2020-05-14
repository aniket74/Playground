#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rad,len,d;
  cin>>rad>>len;
  d = 2 * rad;
  if(d<=len)
  {
    cout<<"circle can be inside a square";
  }
  else
  {
    cout<<"circle cannot be inside a square";
  }
}