package day02;

public class Solution01 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (int)((num1 / (float)num2) * 1000);
        
        return answer;
    }
}