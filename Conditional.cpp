// Conditional.cpp
#include <iostream>
using namespace std;

int main()
{

      int number1; // first number to compare
      int number2; // second number to compare

      cout<<"Enter first integer: "<<endl; // prompt 
      cin>>number1; // read first number  

      cout<<"Enter second integer: "<<endl; // prompt 
      cin>>number2; // read second number 
      
      if (number1 == number2) 
         cout<<number1<< " = "<< number2<<endl;

      if (number1 != number2)
         cout<<number1<< " != "<< number2<<endl;

      if (number1 < number2)
         cout<<number1<< " < "<< number2<<endl;

      if (number1 > number2)
         cout<<number1<< " > "<< number2<<endl;

      if (number1 <= number2)
         cout<<number1<< " <= "<< number2<<endl;

      if (number1 >= number2)
         cout<<number1<< " >= "<< number2<<endl;;
   } // end main
} // end class 
