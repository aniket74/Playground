#include<iostream>
using namespace std;
int main()
{
  int x,y,jumps=0,a=3,b=4;          
  cin>>x>>y;
  do     
  {         
    if(a!=x && b!=y)         
    {            
      a++;            
      b++;            
      jumps++;                      
    }         
    else if(a==x && b!=y)         
    {             
      b++;             
      jumps++;         
    }         
    else         
    {             
      a++;             
      jumps++;         
    }                       
  }while(!(a==x&&b==y)); 
  cout<<jumps;
}