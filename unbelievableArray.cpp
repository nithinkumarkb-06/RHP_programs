#include<iostream>
#include<vector>
using namespace std;
int main()
{
    int c;
    cin>>c;
    while(c--)
    {
        cout<<"Case "<<c+1<<":"<<endl;
        int n,q;
        cin>>n>>q;
        vector<int> a(n+1,0);
        for(int i=1;i<=n;i++)
        {
            cin>>a[i];
        }
        while(q--)
        {
            int t; cin>>t;
            if(t==1)
            {
                int x,y;
                cin>>x>>y;
                for(int &num:a)
                {
                    if(num==x) 
                    {
                        num=y;
                    }
                }
            }else{
                int idx; cin>>idx;
                cout<<a[idx]<<endl;
            }   
        }
    }
    return 0;
}