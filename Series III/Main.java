#include<iostream>
int main(){
int n,st=6,p=1;
 std::cin>>n;
  for(int i=0;i<n;i++){
  std::cout<<st<<" ";
    st+=5*p;
    p++;
  }
}