#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    
    int t;
    cin >> t;
    
    while (t--) {
        int n, h, l;
        cin >> n >> h >> l;
        
        int c1 = 0, c2 = 0, c3 = 0;
        
        for (int i = 0; i < n; i++) {
            int x;
            cin >> x;
            if (x <= h && x <= l) c1++;
            else if (x <= h) c2++;
            else if (x <= l) c3++;
        }
        
        int d = abs(c2 - c3);
        int ans = min(c2, c3) + min(d, c1) + max(0, c1 - d) / 2;
        
        cout << ans << "\n";
    }
    return 0;
}


//Table_With_Numbers