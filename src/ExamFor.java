public class ExamFor {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i < 101; i++){
            if ( i % 2 == 0) {
                result += i;
            }// if
        }// for
        System.out.println(result);

        for (int i = 0; i < 5; i++){
            System.out.print(" ".repeat(5-i));
            System.out.println("*".repeat(2*i+1));
        }// for
    }// main end
}// ExamFor end
