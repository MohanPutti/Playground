#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,cost;
  std::cin>>a;
  if(a<=200)
    cost=a*0.5;
  else if(a<=400)
    cost=a*0.65+100;
  else if(a<=600)
    cost=a*0.80+200;
  else
    cost=a*1.25+425;
  std::cout<<"Rs."<<cost;
    
  
}