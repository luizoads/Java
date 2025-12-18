import java.util.Scanner;

    class ImprimeLinha {
        static void linha() {
            System.out.println("___________________________________________");
        }
    }

    public class Media {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double somaNotas = 0;

            ImprimeLinha.linha();
            System.out.println("\nOlá professor(a), vamos calcular a média dos seus alunos!");
            ImprimeLinha.linha();

            for (int i = 1; i <= 5; i++) {
                System.out.println("Digite a nota número " + i + ": ");
                somaNotas += sc.nextDouble();
            }

            double media = somaNotas / 5;
            ImprimeLinha.linha();
            System.out.printf("\nA média do aluno é de: %.2f\n", media);
            ImprimeLinha.linha();

            sc.close();
        }
    }