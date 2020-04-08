#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int t,sum,ct;
  std::cin>>t;
  while(sum<t){
    int num;
  std::cin>>num;
  sum+=num;
  ct++;}
  std::cout<<"The number of turns is "<<ct;
}