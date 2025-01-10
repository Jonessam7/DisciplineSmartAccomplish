package DisciplineSmartAccomplish.DailyCode.d07m01y25;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
  private static int fact(int n, int r){
        // it take care of (nCr) r
        if(r>n-r){
            r=n-r;
        }
        // formula n!/(r!-(n-r)!)
        long rslt = 1;
        for(int i=0;i<r; i++){
            // this is the factorial of N 
            rslt=rslt*(n-i);
            // this is r! which divides the N! in revrse order
            rslt=rslt/(i+1);
            //n!/r!
            //it is actuall
            // 10 x 9 x 8 = n!
            // 3 x 2 x 1 = r!

            // acording to code 
             // 10 x 9 x 8 = n!
            // 1 x 2 x 3  = r!
        }
        return (int)rslt;
    }
    public static List<List<Integer>> PT(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();
         
         for(int i=0; i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<= i; j++){
                row.add(fact(i,j));
            }
            triangle.add(row);
         }
         return triangle;
    }
    
public static void main(String[] args) {
  int rows = 4;
  List<List<Integer>> al = PT(rows);
  for (List<Integer> list : al) {
    System.out.println(list);
  }
}
}
