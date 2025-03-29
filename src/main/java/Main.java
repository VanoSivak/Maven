import org.example.Maven.services.SqrtService;

public class Main {

    public  static  void  main(String[] args) {
        int x = 27;

        SqrtService service = new SqrtService();
        System.out.println(service.calcSqrt(27));

//        while (x < 10) {
//            System.out.println("Hello, " + x);
//            x = x + 1;
//        }
//
//        for (int i = 0;i < 10;i++) {
//            if (i == 3) {
//                continue;
//            }
//            if (i == 6) {
//                break;
//            }
//            System.out.println(i);
//        }
    }
}