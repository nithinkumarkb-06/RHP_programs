#include<iostream>
using namespace std;
int main(){
    string s;
    cin>>s;
    int flag=0;
    for(char ch:s)
    {
       flag|=(1<<(ch-'0'));
    }
    cout<<"Numeric pangram: "<<((flag==(1<<10)-1)?"Yes":"No")<<endl;
    return 0;
}