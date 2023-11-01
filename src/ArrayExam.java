public class ArrayExam {
    public static void main(String[] args) {
        //정수 1개를 저장할 변수를 선언 하세요.
        int a;
        a=10;

        //정수 3개를 저장할 변수를 선언 하세요.
        int[] b;
        b =new int[3];
        b[0]=10;
        b[1]=20;
        b[2]=30;

        int[] x={1,2,3,4,5};
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }


        // char[] 배열에 APPLE 이라는 문자가 저장되어있다. 대문자로 된 APPLE을 소문자로 apple로 출력하세요
        char[] c={'A','P','P','L','E'};
        for (int i = 0; i < c.length; i++) {
            System.out.print((char)(c[i]+32));
            //c[i] = Character.toLowerCase(c[i]);
            //System.out.print(c[i]);

            //System.out.println(c); // 배열 출력 시 배열 이름 출력 됨. 배열 이름은 주소값 출력 됨. 배열 이름 출력 안하려면 배열 이름 앞에 [ ] 추가하여 출력하세요.
        }
    }
}
