#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 int a;
  std::cin>>a;
  if(a<=200)
  {
    int b;
    b=(a*0.5);
    std::cout<<"Rs."<<floor(b);
}
  else if(a<=400)
  {
    std::cout<<"Rs."<<((a*0.65)+100);
}
  else if(a<=600)
  {
    std::cout<<"Rs."<<((a*0.80)+200);
}
  else if(a>600)
  {
    int b;
    std::cout<<"Rs."<<((a*1.25)+425);
}
  else{ std::cout<<" Error !!! ";
      }
  
}
