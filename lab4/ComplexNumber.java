public class ComplexNumber<T extends Number> {
    private T real;
    private T imagine;

    public ComplexNumber(T real, T imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public void setImagine(T imagine) {
        this.imagine = imagine;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public T getImagine() {
        return imagine;
    }

    public T getReal() {
        return real;
    }

    public ComplexNumber<T> add(ComplexNumber<T> newComplexNumber) {
        T newReal = (T) (Number) (this.real.doubleValue() + newComplexNumber.real.doubleValue());
        T newImagine = (T) (Number) (this.imagine.doubleValue() + newComplexNumber.imagine.doubleValue());
        ComplexNumber<T> complexNumber = new ComplexNumber<>(newReal, newImagine);
        return complexNumber;
    }

    public ComplexNumber<T> sub(ComplexNumber<T> newComplexNumber) {
        T newReal = (T) (Number) (this.real.doubleValue() - newComplexNumber.real.doubleValue());
        T newImagine = (T) (Number) (this.imagine.doubleValue() - newComplexNumber.imagine.doubleValue());
        ComplexNumber<T> complexNumber = new ComplexNumber<>(newReal, newImagine);
        return complexNumber;
    }

    public ComplexNumber<T> mul(ComplexNumber<T> newComplexNumber) {
        T newReal = (T) (Number) (this.real.doubleValue() * newComplexNumber.real.doubleValue());
        T newImagine = (T) (Number) (this.imagine.doubleValue() * newComplexNumber.imagine.doubleValue());
        ComplexNumber<T> complexNumber = new ComplexNumber<>(newReal, newImagine);
        return complexNumber;
    }

    public ComplexNumber<T> div(ComplexNumber<T> newComplexNumber) {
        T newReal = (T) (Number) (this.real.doubleValue() / newComplexNumber.real.doubleValue());
        T newImagine = (T) (Number) (this.imagine.doubleValue() / newComplexNumber.imagine.doubleValue());
        ComplexNumber<T> complexNumber = new ComplexNumber<>(newReal, newImagine);
        return complexNumber;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imagine + "i)";
    }
}
