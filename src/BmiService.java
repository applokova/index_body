package src;

public class BmiService {
    public float calculate(float weight, float growth) {
        float result;
        if ((weight > 0) || (growth > 0)) {
             float transGrowth = growth / 100;
             result = weight / (transGrowth  * transGrowth);
        } else {
            result = 0;
        }
        return result;
    }
}
