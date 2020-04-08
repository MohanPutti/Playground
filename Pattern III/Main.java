#include<iostream>
int main(){
int num;
  std::cin>>num;
  int temp=num;
  for(int i=1;i<=num;i++){
  for(int j=1;j<=i;j++){
  	if(i==j)
      std::cout<<i;
    else
    std::cout<<i<<"*";}
    std::cout<<"\n";
  }
  for(int i=num;i>=1;i--){
  for(int j=1;j<=i;j++){
  	if(i==j)
      std::cout<<i;
    else
    std::cout<<i<<"*";}
  std::cout<<"\n";}
  
}