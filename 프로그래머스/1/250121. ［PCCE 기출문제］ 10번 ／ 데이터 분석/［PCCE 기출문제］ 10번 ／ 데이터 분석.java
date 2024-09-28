import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    private static int getIndex(String key) {
        switch (key) {
            case "code": {
                return 0;
            }
            case "date": {
                return 1;
            }
            case "maximum": {
                return 2;
            }
            case "remain": {
                return 3;
            }
            default: throw new IllegalArgumentException();
        }
    }
    
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();
        int extIndex = getIndex(ext);
        int sortIndex = getIndex(sort_by);
        
        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                answer.add(row);
            }
        }
        answer.sort(Comparator.comparingInt(i -> i[sortIndex]));

        return answer;
    }
}