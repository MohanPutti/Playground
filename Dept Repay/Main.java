#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int principal,r,yr;
  std::cin>>principal>>r>>yr;
  float intrest=(principal*yr*r)/100;
  float amount=principal+intrest;
  float discount=intrest*0.02;
  float total=amount-discount;
  std::cout<<intrest<<"\n"<<amount<<"\n"<<discount<<"\n"<<total;
}