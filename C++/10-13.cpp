#include <iostream>
#include <vector>
#include<algorithm>
using namespace std;

int main() {
	vector<int> v;
	vector<int>::iterator* it;

	cout << "5�� ���Ҹ� �Է��Ͻÿ� >>";
	for (int i = 0; i < 6;i++) {
		int a;
		cin >> a;
		v.push_back(a);
	}

	sort(v.begin(), v.end());

	for (it = v.begin(); it != v.end(); it++) {
		cout << *it << ' ';
	}
	cout << endl;

}
