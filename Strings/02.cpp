/*
    13. Roman to Integer (Leetcode)

    I/P:
    str = "MCMXCIV"
    ans = 1994

    str = "LVIII"
    ans = 58
*/
#include<iostream>
#include<string>
using namespace std;
int findNum(char ch){
    switch (ch){
    case 'I':
        return 1;
    case 'V':
        return 5;
    case 'X':
        return 10;
    case 'L':
        return 50;
    case 'C':
        return 100;
    case 'D':
        return 500;
    case 'M':
        return 1000;
    default:
        return 0;
    }
}
int romanToInt(string s){
    int len = s.length();
    int final_num = 0;
    // There are 7 roman numbers whose length is 1, i.e. I, V, X, L, C, D, M.
    if (len == 1){
        int num = findNum(s[0]);
        //cout<<num;
        return num;
    }
    // When the length of String is more than 1
    for (int i = 0; i < len; i++){
        string ans = "";
        //final_num = 0;
        int num1 = findNum(s[i]);
        int num2 = findNum(s[i + 1]);
        if (num1 == num2){
            if ((i + 2) < len && findNum(s[i + 2]) == num2){
                final_num = final_num + num1 + num2 + findNum(s[i + 2]);
                i += 2;
                continue;
            }
            else{
                final_num = final_num + num1 + num2;
                i++;
                continue;
            }
        }
        else if (num1 > num2){
            final_num = final_num + num1;
        }
        else if (num1 < num2){
            final_num = final_num + num2 - num1;
            i++;
        }
    }
    return final_num;
}
int main(){
    string str;
    cout<<"Enter Roman Numeral: ";
    getline(cin, str);
    int ans = romanToInt(str);
    cout << "Ans: " << ans;
    return 0;
}