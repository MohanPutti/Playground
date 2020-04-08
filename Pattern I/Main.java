#include<iostream>
int main(){
int n;
std::cin>>n;
  int st=n;
for(int i=1;i<=4;i++){
for(int j=1;j<=i;j++){
std::cout<<st;}
std::cout<<"\n";
st+=1;}
st=n+3;
for(int i=4;i>=1;i--){
for(int j=1;j<=i;j++){
std::cout<<st;}
  st-=1;
std::cout<<"\n";}
}
