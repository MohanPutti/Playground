#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,first,total=0,hrs,last,temp=0;
  std::cin>>first;
  total+=first*100;
  total=total+total*0.5;
 // std::cout<<total<<"\n";
  for(int i=0;i<5;i++){
  std::cin>>a;
 	total+=a*100;
   // total=total+(total*0.5);
    if(a>8)
      total+=(a-8)*15;
    hrs+=a;
    if(hrs>40)
     total+=(hrs-40)*25;
      
  }
  std::cin>>last;
  temp+=last*100;
  temp=temp+(temp*0.25);
  total+=temp;
 // std::cout<<temp<<"\n";
    
  std::cout<<total;
  
}