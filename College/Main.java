#include<iostream>
using namespace std;
struct College
{
char name[100], city[100];
int establishmentYear;
float passPercentage;
};
int main()
{ 
  int n,i,j;
  cout<<"Enter the number of colleges";
  cin>>n;
  struct College stud[n];
  j=1;
  for(i=0;i<n;i++)
  {    
    cout<<"\nEnter the details of college "<<j;
    cout<<"\nEnter name";
    cin>>stud[i].name;
    cout<<"\nEnter city";
    cin>>stud[i].city;
    cout<<"\nEnter year of establishment";
    cin>>stud[i].establishmentYear;
    cout<<"\nEnter pass percentage";
    cin>>stud[i].passPercentage;
    j++;
}
  j=1;
  cout<<"\nDetails of colleges";
  for(i=0;i<n;i++)
  {   
    cout<<"\nCollege:"<<j;
    cout<<"\nName:"<<stud[i].name;
    cout<<"\nCity:"<<stud[i].city;
    cout<<"\nYear of establishment:"<<stud[i].establishmentYear;
    cout<<"\nPass percentage:"<<stud[i].passPercentage;
    j++;
  }
}