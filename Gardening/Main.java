#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,m;
  std::cin>>r>>c>>m;
 
  if(m>c&&m<=c+c||m>(c*(c-2))&&m<=(c*(c-1)))
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
  
}