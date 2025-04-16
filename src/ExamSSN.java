import java.util.Scanner;

public class ExamSSN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssn = "000505-3411745";
        System.out.print("주민번호를 입력해주세요 : ");
        ssn = scanner.next();

        char gender = ssn.charAt(7);

        if (gender == '3' || gender == '1') {
            System.out.println("남자");
        } else if (gender == '4' || gender == '2') {
            System.out.println("여자");
        } else {
            System.out.println("invalid value");
        }
    }// main end
}// ExamSSN end
