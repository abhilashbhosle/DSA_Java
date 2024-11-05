// leetcode 118

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> ans = generate(numRows);
		System.out.println(ans);
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList();
        List<Integer> firstRow = new ArrayList();
        firstRow.add(1);
        answer.add(new ArrayList(firstRow));
		int midElements=0;
        for (int row = 1; row < numRows; row++) {
			List<Integer> currentRow=new ArrayList();
			currentRow.add(1);
			for(int j=1;j<=midElements;j++){
				int element=answer.get(row-1).get(j)+answer.get(row-1).get(j-1);
				currentRow.add(element);
			}
			currentRow.add(1);
			answer.add(new ArrayList(currentRow));
			midElements++;
        }
		return answer;
    }
}
