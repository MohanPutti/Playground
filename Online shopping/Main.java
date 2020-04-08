#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g,h,i;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int flip=a-a*(b*0.01)+c;
  int snap=d-d*(e*0.01)+f;
  int amazon=g-g*(h*0.01)+i;
  std::cout<<"In Flipkart Rs."<<flip<<"\n";
  std::cout<<"In Snapdeal Rs."<<snap<<"\n";
  std::cout<<"In Amazon Rs."<<amazon<<"\n";
  if(flip<=snap&&flip<=amazon)
    std::cout<<"He will prefer Flipkart";
  else if(snap<=flip&&snap<=amazon)
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
}