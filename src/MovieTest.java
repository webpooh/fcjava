public class MovieTest {
    public static void main(String[] args) {

        Movie mv;
        mv= new Movie();


        mv.title="아바타";
        mv.actor="제이크 설리";
        mv.openingday="2022.01.01";
        mv.genre="액션";
        mv.runtime=120;
        mv.director="제이스 코드";

        System.out.println(mv.title+"\t"+mv.openingday+"\t"+mv.actor+"\t"+mv.director+"\t"+mv.runtime+"\t"+mv.genre);

        Movie m2;
        m2= new Movie();



    }
}
