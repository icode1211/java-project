package chap04;

public class TreeHitWhileTen {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를  " + treeHit + "번 찍었습니다.");
        }
        System.out.println("나무 넘어갑니다");
    }
}
