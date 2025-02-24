import java.util.ArrayList;
import java.util.List;

public class leet118_PascalsTriangle {


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        //Skapa numRows antal listor i triangle
        for (int i = 0 ; i < numRows ; i++){
            triangle.add(new ArrayList<>());
        }
        triangle.get(0).add(1);

        int sumToAdd = 0;

        for ( int i = 1 ; i < numRows ; i++){
            triangle.get(i).add(1);
            for ( int j = 1 ; j < i ; j++){

                sumToAdd = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j) ;
                triangle.get(i).add(sumToAdd);
            }
            triangle.get(i).add(1);
        }
        return triangle;

    }
}
