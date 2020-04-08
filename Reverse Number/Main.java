#include <iostream>
int main() 
{
	// Type your code here
  int n,temp=0,rev=0;
  std::cin>>n;
  while(n!=0){
  int temp=n%10;
  rev=rev*10+temp;
  n=n/10;}
  std::cout<<rev;
	return 0;
}