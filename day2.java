/* DPS school will run school buses from one location to 
differnt locations(ie routes) where 
routes[i]=[locationA, locationB]
Given n routes return the last stop location of the school bus. 

input =3
nagole uppal
uppal habsiguda
habsiguda nacharam

output =nacharam
Explanation: Starting at "nagole" busses will reach "nacharam" 
which is the last stop. bus route consist of "nagole" -> "uppal" -> "habsiguda" -> "nacharam".


input =3
tarnaka narayanaguda
uppal tarnaka
narayanaguda mahenderahills
output =mahenderahills

Explanation: All possible routes are:
uppal-> tarnaka -> narayanaguda->mahenderahills or
tarnaka -> narayanaguda -> mahenderahills
narayanaguda -> mahenderahills 

-----------------------------------------------------------------
*/

import java.util.*;
import java.io.*;
class Test
{
    static String Destination(String[][] Routes,int n)
    {
        String Dest="";
        ArrayList<String> RoutesList=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
         RoutesList.add(Routes[i][0]);
        }
        for(int i=0;i<n;i++)
        {
            if(!RoutesList.contains(Routes[i][1]))
            { 
                Dest=Routes[i][1];
                break;
            }
        }
        return Dest;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[][] Routes=new String[n][2];
        for(int i=0;i<n;i++)
        {
         for(int j=0;j<2;j++)   
            Routes[i][j]=sc.next();
        }
       System.out.println(Destination(Routes,n));
    }
}
