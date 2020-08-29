// Part 4

import java.io.*; 
  
class NaturalNums{ 
    static int findSum(int n) 
    { 
        int sum = 0; 
        for (int x = 1; x <= n; x++)  
            sum = sum + x; 
        return sum; 
    }
