#include<iostream>
using namespace std;
int main()
{
 int a,b,c,g,f,h;
  cin>>a>>b>>c;
  g=b*75;
  f=c*30;
  h=g+f;
  if(h<=a){
  std::cout<<"Boat is stable";
 }
else{
   std::cout<<"Boat will drow";
 }
}

