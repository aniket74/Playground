#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char door[5],fr[]="front",re[]="rear"; 
    int rail;
  cin>>door>>rail;
    if((strcmp(door,fr))==0)
  {
  	if(rail==1)
    {
    	cout<<"Left Handed";
    }
    else
    {
    	cout<<"Right Handed";
    }
  }
  else if((strcmp(door,re))==0)
  {
  	if(rail==1)
    {
    	cout<<"Right Handed";
    }
    else
    {
    	cout<<"Left Handed";
    }
  }
}
