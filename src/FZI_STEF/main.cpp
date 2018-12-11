#include <iostream>

using namespace std;
  
int main() {
    int citiesNumber, profit;
    long long  max=0, sum=0;
    cin >> citiesNumber;
 
    while (citiesNumber--){
            cin >> profit;
  
            sum+=profit;
  
            if (sum>max){
                max=sum;
            }

            if (sum<0){
                sum=0;
            }    
        }
   
    cout << max  << endl;
         
    return 0; 
}
