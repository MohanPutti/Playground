#include<iostream>
int main(){
int n;
std::cin>>n;
double st=0.5,p=1.0;;
  for(int i=1;i<=n;i++){
  std::cout<<st<<" ";
  st=st+p;
  p=p*3;}
}