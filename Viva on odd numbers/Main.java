#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float score;
  int ct=0,n;
  while(ct<3){
  std::cin>>n;
    if(n<0){
    score-=1.0;
    break;}
  else{ if(n%2==0)
    score-=0.5;
    else{
    score+=1.0;
    ct++;}
      }
      
    
  }
  std::cout<<score;
  
  
  
}