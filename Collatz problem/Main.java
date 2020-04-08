#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
 int n,ct=0;
  std::cin>>n;
  std::cout<<n<<"\n";
  while(n!=1){
    if(n%2==0){
    std::cout<<n/2<<"\n";
    n=n/2;}
    else{
      std::cout<<3*n+1<<"\n";
    n=3*n+1;}
    ct++;
  }
  std::cout<<ct;
}