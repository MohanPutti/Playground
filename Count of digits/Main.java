#include<iostream>
int main()
{
  // Type your code here
 int n,ct=0;
  std::cin>>n;
  if(n==0)
    std::cout<<"1";
  else{
  while(n>0){
  ct++;
  n=n/10;}
  std::cout<<ct;
}}