//
//  main.cpp
//  FCTRL2
//
//  Created by Shuoren Wang on 2017-01-01.
//  Copyright © 2017 shuoren. All rights reserved.
//

#include <iostream>
using namespace std;

void printFactorial(int n){
    int temp=1;
    
    while (n!=0){
        temp*=n;
        n--;
    }
    cout << temp << endl;
}

int main(int argc, const char * argv[]) {
    // insert code here...
    
    int cases;
    
    cin >> cases;
    
    while(cases!=0){
        int n;
        cin >> n;
        
        printFactorial(n);

        cases--;
    }
    
    return 0;
}




