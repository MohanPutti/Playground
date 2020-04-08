#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
string s;
  std::cin>>s;
  std::cout<<int(s.at(0))-48+int(s.at(s.length()-1))-48;
  
}