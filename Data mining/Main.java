#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,odd,even;
  std::cin>>n;
  while(n>0){
  int t=n%10;
  if(t%2==0)
  even+=t;
  else
  odd+=t;
  n=n/10;}if(even==odd)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}