public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int argument2 = Integer.parseInt(args[1]);
        int argument3 = 0;
        if (args.length > 2) {
            argument3 = Integer.parseInt(args[1]);
        }
        switch(args[0]) {
            case "add":
                System.out.println(calculator.add(argument2, argument3));
            case "subtract":
                System.out.println(calculator.subtract(argument2, argument3));
            case "muliplty":
                System.out.println(calculator.multiply(argument2, argument3));
            case "divide":
                System.out.println(calculator.divide(argument2, argument3));
            case "binary":
                System.out.println(calculator.intToBinaryNumber(argument2));
            case "fibonacci":
                System.out.println(calculator.fibonacciNumberFinder(argument2));
        }
    }
}
