#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int wt_boat,num_adult,wt_adult=75,num_child,wt_child=30;
  int total_wt;
  cin>>wt_boat>>num_adult>>num_child;
  wt_adult = wt_adult * num_adult;
  wt_child = wt_child * num_child;
  total_wt = wt_adult + wt_child;
  if(total_wt < wt_boat)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}