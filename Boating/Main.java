#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c;
  if((b*75+c*30)>a)
    std::cout<<"Boat will drow";
  else
    std::cout<<"Boat is stable";
}