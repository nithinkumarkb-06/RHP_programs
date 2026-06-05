#include<iostream>
using namespace std;
int main(){
    string s;
    cin>>s;
    int flag1=0;
    int flag2=0;
    for(char ch:s)
    {
        if('a'<=ch && ch<='z')
            flag1|=(1<<(ch-'a'));
        else if('A'<=ch && ch<='Z')
            flag2|=(1<<(ch-'A'));
    }
    cout<<"Lower Case:"<<((flag1==(1<<26)-1)?"Yes":"No")<<endl;
    cout<<"Upper Case:"<<((flag2==(1<<26)-1)?"Yes":"No")<<endl;
    return 0;
}