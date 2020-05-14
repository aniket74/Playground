#include <iostream> 
using namespace std; 
int* insertX(int n, int arr[], int x, int pos) 
{
  int i;
  n++;
  for (i = n; i >= pos; i--)
    arr[i] = arr[i - 1];
  arr[pos - 1] = x;
  return arr; 
}
int main() 
{
  int arr[20];
  int i, x, pos, n;
  cin>>n;
  for (i = 0; i < n; i++)
    cin>>arr[i];
  for (i = 0; i < n; i++)
    arr[i] = i + 1;
  cin>>pos;
  cin>>x;
  insertX(n, arr, x, pos);
  cout<<"Enter the number of elements in the array";
  cout<<"\nEnter the elements in the array";
  cout<<"\nEnter the location where you wish to insert an element";
  if(pos>n)
    cout<<"\nInvalid Input";
  else
  {
  cout<<"\nEnter the value to insert";
  cout<<"\nArray after insertion is\n";
  for (i = 0; i < n + 1; i++)
    cout<<arr[i]<<"\n";
  }
  return 0;
}