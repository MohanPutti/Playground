#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,st=0,in=2;
  std::cin>>n;
  for(int i=1;i<=n;i++){
  std::cout<<st<<" ";
  st+=in;
  if(i%2!=0)
  in+=4;}
  
}