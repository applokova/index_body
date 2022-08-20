package src;

import src.BmiService;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 48;
        float growth = 160;
        float imt = service.calculate(weight, growth);
        System.out.println(imt);
    }
}
