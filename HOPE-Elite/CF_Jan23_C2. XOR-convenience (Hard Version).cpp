#include <bits/stdc++.h>
using namespace std;
//https://t.me/coderhelpp
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        if ((n & (n - 1)) == 0) {
            cout << -1 << "\n";
            continue;
        }
        vector<int> p;
        if (n == 3) {
            p = {2, 1, 3};
        } else if (n & 1) {
            p.push_back(n - 1);
            for (int x = 3; x <= n - 2; x += 2) {
                p.push_back(x);
                p.push_back(x - 1);
            }
            p.push_back(n);
            p.push_back(1);
        } else {
            int k = n & -n;
            p.push_back(k + 1);
            for (int x = 3; x <= k - 1; x += 2) {
                p.push_back(x);
                p.push_back(x - 1);
            }
            p.push_back(n);
            p.push_back(k);
            for (int x = k + 3; x <= n - 1; x += 2) {
                p.push_back(x);
                p.push_back(x - 1);
            }
            p.push_back(1);
        }
        for (int i = 0; i < n; i++) {
            cout << p[i] << (i + 1 == n ? '\n' : ' ');
        }
    }
    return 0;
}