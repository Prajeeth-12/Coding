#include<stdio.h>
#include<vector>
#include<iostream>
using namespace std;

int main()
{
	int n, r;
	cin>>n>>r;
	vector<int> rooms[r];
	int ways=0;
	for(int i=0 ; i<r ; i++)
	{
		cin >> rooms[i];
	}
	for(int ctr=0 ; ctr<=(1<<r)-1 ; ctr++)
	{
		int capacity = 0;
		for(int sh=0 ; sh<r ; sh++)
		{
			if(ctr & (1<<sh) > 0)
			{
				capacity += rooms[sh];
			}
		}
		if(capacity==n) ways++;
	}
	cout << ways;
}