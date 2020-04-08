//C program to check if a number is Kaprekar number or not 
#include<bits/stdc++.h> 
using namespace std; 


bool iskaprekar(int n) 
{ 
	if (n == 1) 
	return true; 

	int sq_n = n * n; 
	int count_digits = 0; 
	while (sq_n) 
	{ 
		count_digits++; 
		sq_n /= 10; 
	} 

	sq_n = n*n;


	for (int r_digits=1; r_digits<count_digits; r_digits++) 
	{ 
		int eq_parts = pow(10, r_digits); 

		if (eq_parts == n) 
			continue; 

		int sum = sq_n/eq_parts + sq_n % eq_parts; 
		if (sum == n) 
		return true; 
	} 

	return false; 
} 

// Driver code 
int main() 
{ 
  int i;
std::cin>>i ;
	if (iskaprekar(i)) 
		cout << "Kaprekar Number" ; 
  else
    cout<<"Not a Kaprekar Number";
	return 0; 
} 
