#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,res1,res2;
  std::cin>>a>>b>>c>>d;
  res2=b+d;
  if(res2>100){
    res1+=1;
  res2-=100;}
  res1+=(a+c);
  std::cout<<res1<<"\n"<<res2;
  
}