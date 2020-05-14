#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int distance_covered;
  int petrol_available,distance_to_travel;
  cin>>mileage>>petrol_available>>distance_to_travel;
  distance_covered = mileage * petrol_available;
  if(distance_covered >= distance_to_travel)
  {
   cout<<"Can reach"; 
  }
  else
  {
    cout<<"Cannot reach";
  }
}