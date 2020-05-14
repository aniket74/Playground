#include<iostream>
using namespace std;
int main()
{
  int num_row, num_column, tree_num;
  int low1,high1,low2,high2;
  cin>>num_row>>num_column>>tree_num;
  low1 = num_column  +  1;
  high1 = num_column + num_row;
  low2 = (num_column-1) * (num_row-1);
  high2 = (num_column * num_row) - num_row;
  if(tree_num <=high1 && tree_num>=low1)
  {
    cout<<"It is a mango tree";
  }
  else if(tree_num <=high2 && tree_num>=low2)
  {
    cout<<"It is a mango tree";
  }
  else
  {
    cout<<"It is not a mango tree";
  }
}