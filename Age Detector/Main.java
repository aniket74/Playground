#include<iostream>
using namespace std;
int main()
{
  int birth_year,current_year,age;
  cin>>birth_year>>current_year; 
  if(current_year < birth_year)
  {
    birth_year = 100 - birth_year;
    age = birth_year + current_year;
    cout<<age;
  }
  else
  {
  cout<<current_year - birth_year;
  }
}