import java.util.*;
public class inputVar {
public static void main(String[] args) {
    System.out.println("Calculadora de Idade");
    System.out.println("Digite seu ano de nascimento e prescione Enter para confirmar.");
    Scanner scAno = new Scanner(System.in);
    int anoNascimento = scAno.nextInt();
    System.out.println("Você tem " + (2024 - anoNascimento) + " anos");

    scAno.close();
}
}