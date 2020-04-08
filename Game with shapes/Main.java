#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  std::cin>>a>>b;
  if(a+a<=b)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
}