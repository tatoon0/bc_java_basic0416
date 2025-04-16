import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int kor = 0;
        int eng = 0;
        int math = 0;

        int sum = 0;
        double avg = 0;

        System.out.print("이름을 입력해주세요 : ");
        name = scanner.nextLine();
        System.out.print("국어점수를 입력해주세요 : ");
        kor = scanner.nextInt();
        System.out.print("영어점수를 입력해주세요 : ");
        eng = scanner.nextInt();
        System.out.print("수학점수를 입력해주세요 : ");
        math = scanner.nextInt();

        sum = kor + eng + math;
        avg = sum / 3.0;

        System.out.println();
        System.out.printf("이름 : %s\n", name);
        System.out.printf("국어 : %s\n", kor);
        System.out.printf("영어 : %s\n", eng);
        System.out.printf("수학 : %s\n", math);
        System.out.printf("합계 : %s\n", sum);
        System.out.printf("평균 : %s\n", avg);

        System.out.print("결과 : ");
        if (avg >= 90) {
            System.out.println("A");
        } else if (avg >= 80) {
            System.out.println("B");
        } else if (avg >= 70) {
            System.out.println("C");
        } else if (avg >= 60) {
            System.out.println("D");
        } else {
            System.out.println("과락");
        }
    }// main end
}// Homework end
