#include<iostream>
int main(){
int st,end;
  std::cin>>st>>end;
  for(int i=st;i<=end;i++){
  	int sum=0;
    for(int j=1;j<i;j++){
    if(i%j==0)
      sum+=j;
    }
  if(sum==i)
  std::cout<<i<<" ";}
}