#include<iostream>
using namespace std;
int main()
{
 	float x1,y1,x2,y2,x3,y3;
  float z1,z2;
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  z1=(x1+x2+x3)/3;
  z2=(y1+y2+y3)/3;
  cout<<z1<<"\n"<<z2;
}
