#include <bits/stdc++.h>
using namespace std;

// Map a 1-26 number to the corresponding lowercase alphabet character.
static char toAlpha(int num) {
    return static_cast<char>('a' + num - 1);
}

int main() {
    // Given a String containing Number and #, convert the numbers to alphabet. If '#'
    // follows two digits, combine them (e.g., "10#" -> 'j'). If the two-digit number
    // is outside 1..26, treat the digits separately. Finally print the numbers and the
    // resulting alphabet string.
    string s;
    if (!(cin >> s)) {
        return 0;
    }

    stack<int> st;      // maintains parsed numbers in order
    for (size_t i = 0; i < s.size(); ++i) {
        char c = s[i];
        if (isdigit(static_cast<unsigned char>(c))) {
            st.push(c - '0');
        } else if (c == '#') {
            if (st.size() >= 2) {
                int ones = st.top(); st.pop();
                int tens = st.top(); st.pop();
                int combined = tens * 10 + ones;
                if (combined >= 1 && combined <= 26) {
                    st.push(combined);
                } else { // out of range, keep the digits separate
                    st.push(tens);
                    st.push(ones);
                }
            }
            // ignore stray '#'
        }
    }

    vector<int> nums;
    while (!st.empty()) {
        nums.push_back(st.top());
        st.pop();
    }
    reverse(nums.begin(), nums.end()); // restore original order

    string letters;
    for (int v : nums) {
        if (v >= 1 && v <= 26) {
            letters.push_back(toAlpha(v));
        }
    }

    cout << "Numbers: ";
    for (size_t idx = 0; idx < nums.size(); ++idx) {
        if (idx) cout << ' ';
        cout << nums[idx];
    }
    cout << "\nAlphabets: " << letters << '\n';

    return 0;
}