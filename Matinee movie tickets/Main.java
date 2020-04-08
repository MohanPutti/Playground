#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float sh;
  std::cin>>age;
  std::cin>>sh;
  //std::cout<<sh;
  float total;
  if(age>13){
    if(sh==13.3f)
      total=5.0f;
    else
      total=8.0f;
  }
  else{
  if(sh==13.3f)
    total=2.0f;
    else
      total=4.0f;
  }
  std::cout<<"$"<<total<<".00";
  
}