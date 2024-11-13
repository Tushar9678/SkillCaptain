/*
You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit. Return the minimum number of boats to carry every given person.

Example 1:
Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)

Example 2:
Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
*/

import java.util.*;

class RescueBoats{
    public static void main(String[] args){
        RescueBoats obj = new RescueBoats();
        int[] people1 = {3,2,2,1};
        int limit1 = 3;

        System.out.println("Using Brutforce Approach"); 
        System.out.println(obj.boats(people1,limit1));

        System.out.println("Using Two pointer Approach");
        System.out.println(obj.Boats(people1,limit1));

    }

    //--------------------------------------------------------------- using brutforce approach-----------------------------------------
    
    static int boats(int[] people, int limit){
        Arrays.sort(people);
        int i = 0;
        int len = people.length;
        int ans = 0;
        int currentBoatCapacity = 0;
        
        while(i<len){

            if(currentBoatCapacity + people[i] <= limit){
                currentBoatCapacity = currentBoatCapacity + people[i];
                i++;
            }else{
                ans++;
                currentBoatCapacity = 0;
            }
        }
        if(currentBoatCapacity > 0)
            ans++;

        return ans;
    }

    //----------------------------------using TWO POINTER approach-----------------------------------------
    
    static int Boats(int[] people, int limit){
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int ans=0;

        while(i<=j){
            ans++;
            if(people[i]+people[j]<= limit){
                i++;
            }
            j--;
        }
        return ans;

    }

}



