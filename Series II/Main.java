#include<iostream>
using namespace std;
int main()
{
int a = 11, b = 4, n;
    cin>>n;
  for(int i = 1; i <= n; i++)
  {
    cout<<a * a<<" ";
    a = (a + b);
  }
return 0;
}
