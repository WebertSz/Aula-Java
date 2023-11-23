package devdojo.aula.introduction;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoólica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);

        double salario = 3000;
        String resultado = salario > 5000 ? "Eu vou doar 500 reais do meu salário." : "Ainda não tenho condições de doar, mas vou ter.";

        System.out.println(resultado);
    }
}
