#include<iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  gets(s.name);
  cin>>s.roll;
  cin>>s.marks;
  cout<<"\nStudent Details";
  cout<<"\nName: "<<s.name;
  cout<<"\nRoll: "<<s.roll;
  cout<<"\nMarks: "<<s.marks;
}