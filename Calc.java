import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n1, n2;
        String op;

        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextDouble();

        System.out.println("Digite a operacao (+, -, *, /, ^, sqrt): ");
        op = sc.next();

        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextDouble();

        if (op.equals("+")) {
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));

        } else if (op.equals("-")) {
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));

        } else if (op.equals("*")) {
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));

        } else if (op.equals("/")) {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));

        } else if (op.equals("^")) {
            System.out.println(n1 + " ^ " + n2 + " = " + Math.pow(n1, n2));

        } else if (op.equals("sqrt")) {
            System.out.println("Raiz quadrada de " + n1 + " = " + Math.sqrt(n1));
            System.out.println("Raiz quadrada de " + n2 + " = " + Math.sqrt(n2));

        } else {
            System.out.println("Operacao invalida!");
        }

        sc.close();
    }
}
