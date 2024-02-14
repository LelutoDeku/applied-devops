public class Calculator {
    int a, b;
    public int addition(int a, int b)   {
        return a + b;
    }

    public int multiplication(int a, int b)   {
        return a * b;
    }

    public static void main(String[] args)  {
        Calculator c = new Calculator();
        c.addition(2, 3);
        c.multiplication(2, 3);
    }
}
