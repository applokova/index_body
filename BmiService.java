public class BmiService {
    public float calculate(float a, float b) {
        float result;
        if (a > 0 || b > 0) {
             float x = b / 100;
             result = a / (x * x);
        } else {
            result = 0;
        }
        return result;
    }
}
