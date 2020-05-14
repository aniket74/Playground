#include<iostream>
int main()
{
  int max_wt,wt;
  std::cin>>max_wt>>wt;
  if(wt<max_wt)
    std::cout<<"Yes, you can enter.";
  else if(wt==max_wt)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}