#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,res=1;
  cin>>n;
  if(n > 1)
  {
    for(int i = 1; i <= n; i++)
      res *= i;
  }
    cout<<res;
}