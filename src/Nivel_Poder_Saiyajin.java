import java.util.Scanner;

/* Defina o poder final do Saiyajin, para saber descobir qual seu nível de transformação */

public class Nivel_Poder_Saiyajin {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int fim = leitor.nextInt();

        if (fim < 150000) {
            System.out.println("Com o nível de poder de " + fim + ", você é um Saiyajin!\n");
        } else if (fim < 920000) {
            System.out.println("Com o nível de poder de " + fim + ", você é um Super Saiyajin!\n");
        } else if (fim < 8400000) {
            System.out.println("Com o nível de poder de " + fim + ", você é um Super Saiyajin Ultra!\n");
        } else if (fim < 30000000) {
            System.out.println("Com o nível de poder de " + fim + ", você é um Super Saiyajin II!\n");
        } else if (fim < 70000000) {
            System.out.println("Com o nível de poder de " + fim + ", você é um Super Saiyajin III!\n");
        } else {
            System.out.println("Com o nível de poder de " + fim + ", você é um Super Saiyajin IV!\n");
        }
    }
}
