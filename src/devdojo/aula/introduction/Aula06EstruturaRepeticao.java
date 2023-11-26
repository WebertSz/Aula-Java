package devdojo.aula.introduction;

public class Aula06EstruturaRepeticao {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count += 1;
        }

        count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count < 10);

        for (int i = 0; i <= 20; i += 2) {
            if (i > 10) {
                break;
            }
            System.out.println("Números pares: " + i);
        }
    }
}
