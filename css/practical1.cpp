// Online C++ compiler to run C++ program online
#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int gcd(int a,int b){
    if(b==0) return a;
    return gcd(b,a%b);
}
int main(){
    int a,b;
    cout<<" Enter two numbers :"<<endl;
    cin>>a>>b;
    cout<<" The GCD of two number is :"<<endl;
    cout<<gcd(a,b)<<endl;
    return 0;
    
}
