public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber("2+3.1i");
        ComplexNumber num2 = new ComplexNumber("6+1.2i");

        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num2);

        System.out.println("num1 + num2 = " + num1.add(num2) + "; num2 + num1 " + num2.add(num1));
        System.out.println("num1 - num2 = " + num1.subtract(num2) + "; num2 - num1  " + num2.subtract(num1));
        System.out.println("num1 * num2 = " + num1.multiply(num2) + "; num2 * num1  " + num2.multiply(num1));
        System.out.println("num1 / num2 = " + num1.division(num2) + "; num2 / num1  " + num2.division(num1));
    }
}