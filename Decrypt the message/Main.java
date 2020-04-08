#include<iostream>
int main(){
int a,b,c,res;
  std::cin>>a>>b;
 c=a+b;
  for(int i=1;i<c;i++){
  if(c%i==0)
    res+=i;
}
  if(res==c)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can\'t read the message";
}