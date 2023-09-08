public class QuestionTwo {

    int checkConcatenatedSum(int n, int catlen){
        String numberOfDigits = String.valueOf(n);
        int size = numberOfDigits.length();
        return catlen == size-1 ? 1 : size == 1 ? 1 : 0;
    }
}
