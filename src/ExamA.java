import java.util.Scanner;

public class ExamA {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        System.out.println("x : " + x);
        System.out.println("y : " + y + "\n");

//        y = x++; // x = 11, y = 10
        y = ++x; // x = 11, y = 11

        System.out.println("x : " + x);
        System.out.println("y : " + y + "\n");

//        비교연산
        System.out.println(1 == 1); //true
        System.out.println("홍길동" != "홍길동"); //false
        System.out.println(1 > 2);  //false
        System.out.println(1 < 2);  //true
        System.out.println(1 >= 1); //true
        System.out.println(1 <= 0); //false
        System.out.println();

//        논리연산
        System.out.println(!true);  //false
        System.out.println(true && false); //false
        System.out.println(true || false); //true
        System.out.println();
//        & 과 | 는 양변을 모두 계산한 후에 TF를 결정함
//        일반적인 논리연산의 경우 거의 사용하지 않지만
//        checkA() & checkB() 와 같은 조건에서 로그기록과 같은 목적으로
//        두 함수 모두 실행이 필요한 경우에 아주 예외적으로 사용할 수 있음

//        문자열 비교 예제
        String name = "홍길동";
        System.out.print("이름을 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        // == 는 값이 아닌 주소값을 비교함. 따라서 같은 홍길동 이지만 변수로 선언된 홍길동은 string pool, new로 입력한 홍길동은 heap에 존재하므로 주소값이 다름
        System.out.println(name == inputName);
        // 실제 값을 비교하기 위해서는 equals를 사용함
        System.out.println(name.equals(inputName));
    }// main end
}// ExamA end
