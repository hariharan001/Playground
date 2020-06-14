#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
int a,b,c,x,y;
  float z=0.02,u,v;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  x=(a*b*c)/100;
  std::cout<<x;
  y=a+x;
  std::cout<<"\n"<<y;
  u=x*z;
  std::cout<<"\n"<<u;
  v=y-u;
  std::cout<<"\n"<<v;
  
  
  
  
  
}