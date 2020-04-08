#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c;
  if(c<=a||c%a==1||c%b==0)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}