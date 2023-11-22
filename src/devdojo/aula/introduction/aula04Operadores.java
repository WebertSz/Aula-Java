package devdojo.aula.introduction;

public class aula04Operadores {
    public static void main(String[] args) {

        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero02 - numero01;
        System.out.println(resultado);
        resultado = numero02 + numero01;
        System.out.println(resultado);
        resultado = numero02 * numero01;
        System.out.println(resultado);
        resultado = numero02 / numero01;
        System.out.println(resultado);
        resultado = numero02 % 2;
        System.out.println(resultado);

        boolean isMaiorQueDez = numero02 > 10;
        boolean isMenorQueDez = numero02 < 10;
        boolean isIgualDez = numero01 == 10;
        boolean isDiferenteDez = numero01 != 10;

        System.out.println("isMaiorQueDez " + isMaiorQueDez);
        System.out.println("isMenorQueDez " + isMenorQueDez);
        System.out.println("isMenorOuIgualDez " + isIgualDez);
        System.out.println("isDiferenteDez " + isDiferenteDez);

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        double bonus = 1800;
        bonus += 1800;
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 3;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
        System.out.println(++contador);

    }

    public static class aula05EstruturasCondicionais {
        public static void main(String[] args) {

        }
    }
}
