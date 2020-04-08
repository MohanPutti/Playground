#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int num;
  bool ltr=true;
  std::cin>>num;
  for(int i=1;i<=num;i++){
    if(ltr){
  for(int j=1;j<=num-1;j++){
  std::cout<<i;
  }
    std::cout<<i+1;
  }
    else{
    std::cout<<i+1;
      for(int j=1;j<=num-1;j++){
  std::cout<<i;
  }
    }
  ltr=!ltr;
    std::cout<<"\n";
  }
    return 0;
}