public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[] b=new Book[3]; //객체 배열
        b[0]=new Book();
        b[0].title="자바의 정석";
        b[0].author="진호";
        b[0].price=30000;
        b[0].isbn="1234-5678";
        b[0].page=500;
        //System.out.println(b[0].title+"\t"+b[0].author+"\t"+b[0].price+"\t"+b[0].isbn+"\t"+b[0].page);


        b[1]=new Book();
        b[1].title="오라클";
        b[1].author="진호";
        b[1].price=30000;
        b[1].isbn="1234-5678";
        b[1].page=500;
        //System.out.println(b[1].title+"\t"+b[1].author+"\t"+b[1].price+"\t"+b[1].isbn+"\t"+b[1].page);

        b[2]=new Book();
        b[2].title="인공지능";
        b[2].author="진호";
        b[2].price=30000;
        b[2].isbn="1234-5678";
        b[2].page=500;
        //System.out.println(b[2].title+"\t"+b[2].author+"\t"+b[2].price+"\t"+b[2].isbn+"\t"+b[2].page);

        for (int i=0;i<b.length;i++){

            System.out.println(b[i].title+"\t"+b[i].author+"\t"+b[i].price+"\t"+b[i].isbn+"\t"+b[i].page+"\t");

        }






    }
}
