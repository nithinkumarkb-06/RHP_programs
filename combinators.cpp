#include<iostream>
using namespace std;
int main()
{
    string s;
    cin>>s;
    int L=s.length();
    for(int ctr=1;ctr<(1<<L);ctr++)
    {
        string c="";
        for(int sh=0;sh<L;sh++)
        {
            if((ctr&(1<<sh))>0)
            {
                c+=s[sh];
            }
        }
        cout<<c<<endl;
    }
    return 0;
}