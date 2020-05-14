#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,x2,x3,y1,y2,y3,z1,z2,z3,a,b,c;
  
  cin>>x1>>x2>>x3>>y1>>y2>>y3>>z1>>z2>>z3;
  a = x1-(x2*x1/100)+x3;
  b = y1-(y2*y1/100)+y3;
  c = z1-(z2*z1/100)+z3;
  
  
  cout<<"In Flipkart Rs."<<a<<"\nIn Snapdeal Rs."<<b<<"\nIn Amazon Rs."<<c;
  cin>>a>>b>>c;
 
  if(a<=b&&a<c)
  {
    cout<<"\nHe will prefer Flipkart";
  }
  else if(b<=c&&b<a)
  {
    cout<<"\nHe will prefer Snapdeal";
  }
  else if(c<=a&&c<b)
  {
    cout<<"\nHe will prefer Amazon";
  }
}