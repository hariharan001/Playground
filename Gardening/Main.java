#include<iostream>
using namespace std;
int main()
{
int row,column,tree;
  std::cin>>row>>column>>tree;
  if((tree>=row)&&(tree<=(row+row)))
  {
    std::cout<<"It is a mango tree";
  }
  else if((tree<=((row*column)-column))&&(tree>=((row*column)-(2*column))))
  {
    std::cout<<"It is a mango tree";
  }
  else{
    std::cout<<"It is not a mango tree";
  }
}
