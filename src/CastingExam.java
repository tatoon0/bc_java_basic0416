public class CastingExam {
    public static void main(String[] args) {
//        explicit type casting (강제 형 변환)
        int i1 = 10001;
        short s1 = (short)i1;
        System.out.println(s1);

        int i2 = 128;
        s1 = (short)i2;
        System.out.println(s1);

        byte b1 = (byte)i2;
        System.out.println(b1); // overflow!!

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
    }// main end
}// CastingExam end
