#include<iostream>
using namespace std;
struct Employee
{
  int id;
  char name[25];
  int age;
  char designation[15];
  long salary;
};
int main()
{
  Employee E;
  cin>>E.name;
  cin>>E.id;
  cin>>E.age;
  cin>>E.designation;
  cin>>E.salary;
  cout<<"Enter name:";
  cout<<"\nEnter ID:";
  cout<<"\nEnter age:";
  cout<<"\nEnter designation:";
  cout<<"\nEnter Salary:";
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<E.name;
  cout<<"\nID of the Employee : "<<E.id;
  cout<<"\nAge of the Employee : "<<E.age;
  cout<<"\nDesignation of the Employee : "<<E.designation;
  cout<<"\nSalary of the Employee : "<<E.salary;
}