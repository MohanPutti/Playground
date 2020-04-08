#include<iostream>
int main(){
  // Type your code here
  int n,res=1;
  std::cin>>n;
 for(int i=1;i<=n;i++){
 res*=i;}
  std::cout<<res;
}