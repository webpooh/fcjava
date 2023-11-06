import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x=-10;
        if (x>=0){
            System.out.println("x는 0보다 크거나 같다.양수");
        }else {
            System.out.println("x는 0보다 작다.음수");
        }

        Scanner scan=new Scanner(System.in);
        System.out.println(" 정수를 입력 하세요 " );
        int num=scan.nextInt();
        if (num%2==0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");  // 짝수 홀수 출력 프로그램 작성 필요
        }

        //12  의 배수인지 출력하는 코드
        System.out.println(" 정수를 입력 하세요 " );
        int su=scan.nextInt();
        if (su%12==0){
            System.out.println("12의 배수");
        }else{
            System.out.println("12의 배수가 아닙니다");  // 짝수 홀수 출력 프로그램 작성 필요
        }

        //연도를 입력 받아서 해당 년도가 윤년인지 아닌지 판단

        System.out.println(" 연도를 입력하세요" );
        int year=scan.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("윤년입니다.");
        }else{
            System.out.println(" 윤년이 아닙니다. ");
        }

    }
}
