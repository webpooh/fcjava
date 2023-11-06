public class MaxMinValue {
    public static void main(String[] args) {

        //삼항연산자 이용하여 정수 2개중 max value와 min value 구하기
        int a=10;
        int b=20;

        int min=(a < b) ? a : b;
        System.out.println("min = " + min);

        int max=(a > b) ? a : b;
        System.out.println("max = " + max);



    }
}
