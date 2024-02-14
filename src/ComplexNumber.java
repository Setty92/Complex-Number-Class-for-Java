public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public ComplexNumber(String number) {
        String[] parts = number.split("[\\+i]");

        this.real = Double.parseDouble(parts[0]);
        this.imaginary = Double.parseDouble(parts[1]);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal + "+" + newImaginary + "i");
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal + "+" + newImaginary + "i");
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + other.real * this.imaginary;
        return new ComplexNumber(newReal + "+" + newImaginary + "i");
    }

    public ComplexNumber division(ComplexNumber other) {
        double newReal = (this.real * other.real + this.imaginary * other.imaginary)/
                (other.real * other.real + other.imaginary * other.imaginary);
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary)/
                (other.real * other.real + other.imaginary * other.imaginary);
        return new ComplexNumber(newReal + "+" + newImaginary + "i");
    }

    @Override
    public String toString() {
        return real + "+" + imaginary + "i";
    }
}
