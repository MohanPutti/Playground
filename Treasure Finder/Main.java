#include<iostream>
using namespace std;
int gcd(int a,int b){
if(b==0)
return a;
return gcd(b,a%b);}
int main()
{
  //Type your code here.
  int a,b,c,ans;
  std::cin>>a>>b>>c;

    if(a >= b && a >= c)
    {
        if(b >= c)
        {
            /*
                .2lf restricts the number till 
                2 decimal places
            */
           ans= b;
        }
        else
        {
           ans= c;
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            ans=a;
        }
        else
        {
  ans=c;
        }
    }

    // c is the largest number of the three
    else if(a >= b)
    {
        ans= a;}
    else
    {
        ans= b;
    }

  int res=gcd(gcd(a,b),c);
  std::cout<<"The treasure is in box which has number "<<ans<<"\n"<<"The code to open the box is "<<res;
}