// importing input and output streams
# include <iostream>
// imported for std::numeric_limits
# include <limits>

/*
	Author: LeeTuah
	Program: Take in sales and no. of employees and return the avg salary
	For SuperB league event
*/

// fixes std::cin if bad input is provided
void fix_cin(){
	if(std::cin.fail()){
		// clears std::cin and removes all the bad input from it
		std::cin.clear();
		std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');	
	}	
}


int main(int argc, char const* argv[]){
	// declaring needed variables
	int employees, total_sales; 
	float avg_sales;
	
	// taking input
	std::cout << "Enter the number of employees: ";
	std::cin >> employees;
	fix_cin();
	std::cout << "Enter the total sales in company: ";
	std::cin >> total_sales;

	// the average sale is calculated and logged in the console	
	avg_sales = total_sales / (float)(employees);
	std::cout << "The average sale by each individual in company is " << avg_sales;
}
