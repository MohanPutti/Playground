#include<iostream>

#include<math.h>
int main(){
int n;
std::cin>>n;
if(n<=1)
  std::cout<<"Not eligible";
else{
  bool flag=true;
for(int i=2;i<=sqrt(n);i++){
if(n%i==0){
flag=false;break;}}
if(flag==false)
std::cout<<"Not eligible";
else
std::cout<<"Eligible";}
}