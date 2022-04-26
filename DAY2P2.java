/* Given a matrix of size R*C, print the matrix in the following given output.

input =
3 3
1 2 3
4 5 6
7 8 9
output =
1 2 3
6 9 8
7 4 5

input =3 4
1 2 3 4
5 6 7 8
9 10 11 12
output =
1  2  3  4
8 12 11 10
9  5  6  7  
  */
--------------------------------------------------------------------------------------------------------------
  
import java.util.*;
class Test{
    static int m,n;
    List<Integer> al=new ArrayList<>();
    public static void spiralWiseRow(int[][] arr){
        List<Integer> al=new ArrayList<>();
        int top=0,left=0,bottom=arr.length-1,right=arr[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                al.add(arr[top][i]);
            }
              top++;
            for(int i=top;i<=bottom;i++){
                al.add(arr[i][right]);
            }
            right--;
           if(top<=bottom){
                for(int i=right;i>=left;i--){
                al.add(arr[bottom][i]);    
                }
               bottom--;
           }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                al.add(arr[i][left]);
               
            }
             left++;
            }
        }
        for(int i=0;i<m*n;i++){
            System.out.println(al.get(i));
            if((i+1)%m==0) System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        spiralWiseRow(arr);
         
    }
}
