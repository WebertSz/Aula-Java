package devdojo.aula.introduction;

/*
 Crie variáveis para os campos escritos abaixo entre <> e imprima a seguinte mensagem:
 Eu <nome> morando no endereço <endereco>, confirmo que recebi o salário de <salario>,
 na data <data>.
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Mr. Robot";
        String endereco = "Rua dos Bitcoins 01, Bairro dos Códigos, Cidade das Máquinas, Estado Tech, País Metaverso";
        double salario = 10000.01;
        String dataRecebimentoSalario = "19/11/2023";
        System.out.println("Eu " + nome + " morando no endereço " + endereco +
                ", confirmo que recebi o salário de R$ " + salario + " na data " +
                dataRecebimentoSalario + ".");

    }
}
