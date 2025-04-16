public class PromotionExam {
    public static void main(String[] args) {
//        byte(1) < short(2) char(2) < int(4) float (4) < long(8) double(8)

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;

        float e = 3.14f;
        double f = 3.14;

        char g = 'A';
        boolean h = true;

//        implicit type casting (자동 형 변환)
//        실제 값과 상관없이 메모리가 작은 타입에서 큰 타입으로만 가능
        int money = 210000000;
        long Lmoney = money;

        double num = a;
        System.out.println(num);

    }// main end
}// PromotionExam end
