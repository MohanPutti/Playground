#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  (n&1==1)?std::cout<<"Odd":std::cout<<"Even";
}