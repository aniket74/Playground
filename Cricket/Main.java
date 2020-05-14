#include<iostream>
#include <cmath> 
using namespace std;
int main()
{
  int total_balls,total_runs,run_scored,overs_finished,balls_bowled;
  float curr_runrate,total_runrate,f,b,overs;
  cin>>total_balls>>total_runs>>run_scored>>balls_bowled;
  overs = total_balls / 6;
  overs_finished = balls_bowled / 6;
  f = (balls_bowled % 6) * 0.1;
  curr_runrate = (run_scored / (overs_finished+f))*10;
  b = (round(curr_runrate))/10;
  total_runrate = total_runs / overs;
  total_runrate = total_runrate*10;  
  total_runrate = round(total_runrate)/10;
  cout<<overs<<"\n"<<overs_finished+f
    <<"\n"<<b<<"\n"<<total_runrate;
  if(b <= total_runrate)
    cout<<"\nNot Eligible to Win";
  else
    cout<<"\nEligible to Win";
}