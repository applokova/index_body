public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float m = 48;
        float h = 160;
        float imt = service.calculate(m, h);
        System.out.println(imt);
    }
}
