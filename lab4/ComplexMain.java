public class ComplexMain {
    public static void main(String[] args) {
        ComplexNumber<Double> complexNumber1 = new ComplexNumber<>(4.2, 7.5);
        ComplexNumber<Double> complexNumber2 = new ComplexNumber<>(3.2, 2.3);
        ComplexNumber<Double> complexNumber3 = complexNumber1.mul(complexNumber2);
        System.out.println(complexNumber3);
    }
}
