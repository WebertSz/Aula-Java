package devdojo.aula.introduction;

/*
Exercício: calcular imposto sobre o salário
 */

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {

        double salarioAnual = 70000;
        double primeiraFaixaImposto = 9.70 / 100;
        double segundaFaixaImposto = 37.35 / 100;
        double terceiraFaixaImposto = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixaImposto;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68587) {
            valorImposto = salarioAnual * segundaFaixaImposto;
        }else {
            valorImposto = salarioAnual * terceiraFaixaImposto;
        }
        System.out.println(valorImposto);
    }
}
