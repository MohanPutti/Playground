#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,first=0,sec=1,th;
  std::cin>>n;
  if(n==1)
    std::cout<<first;
  else if(n==2)
    std::cout<<sec;
  else{
  for(int i=3;i<=n;i++){
    th=first+sec;
    first=sec;
    sec=th;
  }
  std::cout<<th;}
}