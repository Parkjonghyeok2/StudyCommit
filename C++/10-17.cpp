#include <iostream>
using namespace std;

int main() {
	auto pi = 3.14;
	auto calc = [pi](int r)->auto {return pi * r * r; };
	cout << "������ " << calc(3) << "�̴�." << endl;
}