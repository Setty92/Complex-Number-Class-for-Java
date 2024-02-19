# Complex Number Class for Java. Класс Комплексного Числа для Java.

---

This Java code defines a class named `ComplexNumber` that 
represents complex numbers. Complex numbers have both a real part and an
 imaginary part, where the imaginary part is represented by the 
imaginary unit 'i'. The class provides methods for basic arithmetic 
operations such as addition, subtraction, multiplication, and division 
of complex numbers.

Данный Java-код определяет класс с именем `ComplexNumber`, 
представляющий комплексные числа. Комплексные числа состоят из 
действительной и мнимой частей, где мнимая часть представлена мнимой 
единицей 'i'. Класс предоставляет методы для основных арифметических 
операций, таких как сложение, вычитание, умножение и деление комплексных
 чисел.

---

## Instance Varibles:

- `private double real`: Represents the real part of the complex number.
  
- `private double imaginary`: Represents the imaginary part of the complex number.
  

## Переменные экземпляря:

- `private double real`: Представляет действительную часть комплексного числа.
  
- `private double imaginary`: Представляет мнимую часть комплексного числа.
  

---

## Constructors:

- `public ComplexNumber()`: Default constructor that initializes the complex number with both real and imaginary parts set to 0.0.
  
- `public ComplexNumber(String number)`: Constructor that takes
   a string in the format "a+bi" and initializes the complex number with 
  the corresponding real and imaginary parts.
  

## Конструкторы:

- `public ComplexNumber()`: Конструктор по умолчанию, инициализирующий комплексное число с обеими действительной и мнимой частями, установленными в 0.0.
  
- `public ComplexNumber()`: Конструктор по умолчанию, инициализирующий комплексное число с обеими действительной и мнимой частями, установленными в 0.0.
  

---

## Getter and Setter Methods:

- Getter methods (`getReal()` and `getImaginary()`) retrieve the real and imaginary parts of the complex number, respectively.
  
- Setter methods (`setReal()` and `setImaginary()`) set the real and imaginary parts of the complex number, respectively.
  

## Методы геттеры и сеттеры:

- Методы получения (`getReal()` и `getImaginary()`) возвращают действительную и мнимую части комплексного числа соответственно.
  
- Методы установки (`setReal()` и `setImaginary()`) устанавливают действительную и мнимую части комплексного числа соответственно.
  

---

## Arithmetic Operations:

- `public ComplexNumber add(ComplexNumber other)`: Adds the current complex number to another complex number and returns a new `ComplexNumber` object representing the result.
  
- `public ComplexNumber subtract(ComplexNumber other)`: Subtracts another complex number from the current complex number and returns a new `ComplexNumber` object representing the result.
  
- `public ComplexNumber multiply(ComplexNumber other)`: Multiplies the current complex number by another complex number and returns a new `ComplexNumber` object representing the result.
  
- `public ComplexNumber division(ComplexNumber other)`: Divides the current complex number by another complex number and returns a new `ComplexNumber` object representing the result.
  

## Арифметические операции:

- `public ComplexNumber add(ComplexNumber other)`: Складывает текущее комплексное число с другим комплексным числом и возвращает новый объект `ComplexNumber`, представляющий результат.
  
- `public ComplexNumber subtract(ComplexNumber other)`: Вычитает из текущего комплексного числа другое комплексное число и возвращает новый объект `ComplexNumber`, представляющий результат.
  
- `public ComplexNumber multiply(ComplexNumber other)`: Умножает текущее комплексное число на другое комплексное число и возвращает новый объект `ComplexNumber`, представляющий результат.
  
- `public ComplexNumber division(ComplexNumber other)`: Делит текущее комплексное число на другое комплексное число и возвращает новый объект `ComplexNumber`, представляющий результат.
  

---

## toString Method

- `@Override public String toString()`: Overrides the `toString` method to provide a string representation of the complex number in the format "a+bi".
  

## Метод toString:

- `@Override public String toString()`: Переопределяет метод `toString`, предоставляя строковое представление комплексного числа в формате "a+bi".
  

---

Overall, this class encapsulates the functionality related to complex 
numbers and provides a convenient way to perform arithmetic operations 
on them.

В целом этот класс инкапсулирует функциональность, связанную с 
комплексными числами, и предоставляет удобный способ выполнять 
арифметические операции над ними.
