public class ArithmeticOperTest {
    public static void main(String[] args) {
        //나머지 연산자를 이용해서 정수의 자릴수 구하기

        int digit=3625;
        System.out.println(digit%10);
        System.out.println(digit/10%10);
        System.out.println(digit/100%10);
        System.out.println(digit/1000%10);
        int num=2579;

        int su=5;
        if(su%2==0) {
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }

    }
}
