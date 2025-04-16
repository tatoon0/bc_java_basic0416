import java.util.Scanner;

public class ExamIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user_id = "abc";
        String input_id = "abc";
        String user_pwd = "1234";
        String input_pwd = "1234";

        System.out.print("아이디를 입력해주세요 : ");
        input_id = scanner.next();
        System.out.print("비밀번호를 입력해주세요 : ");
        input_pwd = scanner.next();

        if (user_id.equals(input_id) && user_pwd.equals(input_pwd)) { // 문자열 비교시 == 가 아닌 반드시 equals 사용!!
            System.out.println("로그인 성공");
        } else {
            System.out.println("회원정보가 존재하지 않습니다");
        }
    }// main end
}// ExamIf end
