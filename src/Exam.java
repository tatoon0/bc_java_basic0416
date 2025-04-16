public class Exam {
    public static void main(String[] args) {
//        산술연산
        int i1 = 10;
        int i2 = 3;

        System.out.println(i1 + i2);
        System.out.println(i1 - i2);
        System.out.println(i1 * i2);
        System.out.println(i1 / i2); //몫
        System.out.println(i1 % i2); //나머지

//        부호
        i1 = 5;
        i2 = -7;

        System.out.println(i1 + i2);

//        문자열
        String str1 = "홍길동";
        String str2 = "신짱구";

        System.out.println(str1 + str2);

//        대입연산
        i1 = 1;
        i2 = 4;

        i1 += 1;
        i2 -= 3;

        System.out.println(i1);
        System.out.println(i2);

//        증감연산
        i1 = 1;
        System.out.println(i1++);
        System.out.println(i1);
        System.out.println(++i1);

    }// main end
}// Exam end
