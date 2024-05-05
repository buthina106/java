import java.util.function.BiFunction;

public class Quadratic {

    public static void main(String[] args) {
        BiFunction<Coefficient, Coefficient, Root> quadraticRoots = (coefficients, roots) -> {
            double discriminant = coefficients.getB() * coefficients.getB() - 4 * coefficients.getA() * coefficients.getC();
            double sqrtDiscriminant = Math.sqrt(Math.abs(discriminant));

            if (discriminant > 0) {
                double root1 = (-coefficients.getB() + sqrtDiscriminant) / (2 * coefficients.getA());
                double root2 = (-coefficients.getB() - sqrtDiscriminant) / (2 * coefficients.getA());
                return new Root(root1, root2);
            } else if (discriminant == 0) {
                double root = -coefficients.getB() / (2 * coefficients.getA());
                return new Root(root, root);
            } else {
                return null;
            }
        };

       Coefficient coefficients = new Coefficient(2.0, -5.0, 2.0);

لا
        if (coefficients.getA() == 0) {
            System.out.println("Invalid quadratic equation: 'a' cannot be zero.");
            return;
        }

        Root roots = quadraticRoots.apply(coefficients, null);
        if (roots != null) {
            System.out.println("Root 1: " + roots.getRoot1());
            System.out.println("Root 2: " + roots.getRoot2());
        } else {
            System.out.println("Complex roots are not supported.");
        }
    }
}
