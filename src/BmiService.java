public class BmiService {
    public float calculate(float weightInKilograms, float heightInCentimeters) {
        return weightInKilograms / (heightInCentimeters/100 * heightInCentimeters/100);
    }
}
