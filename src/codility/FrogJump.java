package codility;

/* 2020-10-20 */

public class FrogJump {
    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(int X, int Y, int D) {
        int G = Y - X;
        int cnt = G / D;
        return G % D == 0 ? cnt : cnt + 1;
    }
}
