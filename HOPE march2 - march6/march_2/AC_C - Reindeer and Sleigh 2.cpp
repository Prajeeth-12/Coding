#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

typedef long long ll;

void solve() {
    int N;
    (cin >> N) ;
    vector<tuple<int,int,int>> rd(N);
	ll remwt=0LL,pullpow=0LL;
    for (int i = 0; i < N; i++) {
        ll w, p;
        cin >> w >> p;
        rd[i] = make_tuple(w+p,p,w);
        remwt += w;
    }
    
    sort(rd.begin(), rd.end(), greater<>());

    int ans = N;
    for (int i = 0; i < N && pullpow < remwt; i++) {
        ans--;
        remwt -= get<2>(rd[i]);
        pullpow += get<1>(rd[i]);
    }
    cout << ans << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    cin >> T;
    while (T--) {
        solve();
    }
    return 0;
}