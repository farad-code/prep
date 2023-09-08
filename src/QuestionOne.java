public class QuestionOne {

    int largestAdjacentSum(int[] a){
        int largestValue = 0;
        for (int i = 0; i < a.length; i++) {
            int nextIndex = i+1;
            if(nextIndex < a.length){
                int adjacentSum = a[i] + a[nextIndex];
                largestValue = Math.max(largestValue, adjacentSum);
            }
        }
    return largestValue;
    }
}
