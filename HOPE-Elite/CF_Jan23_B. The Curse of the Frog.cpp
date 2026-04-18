#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin >> t;

    while (t--) {
        int n;
        ll x;
        cin >> n >> x;

        ll base = 0, bg = LLONG_MIN;

        for (int i = 0; i < n; i++) {
            ll a, b, c;
            cin >> a >> b >> c;
            base += (b - 1) * a;
            bg = max(bg, b * a - c);
        }

        if (base >= x) cout << 0 << "\n";
        else if (bg <= 0) cout << -1 << "\n";
        else cout << (x - base + bg - 1) / bg << "\n";
    }

    return 0;
}