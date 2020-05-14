#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
 { 
    if(a<b && a>c)
    {
		cout<<"The treasure is in box which has number "<<a;
    } 
    else if(a<b && b<c)
    {
    	cout<<"The treasure is in box which has number "<<b;
    }
    else if(a<c && a>b)
    {
  	   	cout<<"The treasure is in box which has number "<<a;
    }
    else if(a<c && c<b)
    {
    	cout<<"The treasure is in box which has number "<<c;
    }
    else if(c<b && b<a)
    {
  	    cout<<"The treasure is in box which has number "<<b;
    }  
    else if(c<b && c>a)
  	{
  		cout<<"The treasure is in box which has number "<<c;
  	}
  	else if(c<a && c>b)
  	{
  	    cout<<"The treasure is in box which has number "<<c;
  	}
 }
    
    
    if(a<b && a<c)
    {
        for(int i=a;i>=1;i--)
        {
            if(a%i==0 && b%i==0 && c%i==0)
            {
                cout<<"\nThe code to open the box is "<<i;
                break;
            }
        }        
    }
    else if(b<a && b<c)
    {
        for(int i=b;i>=1;i--)
        {
            if(a%i==0 && b%i==0 && c%i==0)
            {
                cout<<"\nThe code to open the box is "<<i;
                break;
            }
        }        
    }
    else if(c<a && c<b)
    {
        for(int i=c;i>=1;i--)
        {
            if(a%i==0 && b%i==0 && c%i==0)
            {
                cout<<"\nThe code to open the box is "<<i;
                break;
            }       
        }        
    }    
}
