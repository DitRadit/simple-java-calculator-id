import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {

        //deklarasi variable
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        double num1, num2, result;
        char operator;
        String answer;
        
        // loop program
        while(continueCalculating){


        System.out.println("Enter digit pertama: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter digit kedua: ");
        num2 = scanner.nextDouble();

        System.out.println("Pilih operasi matematika: (+, -, /, *, %)");
        operator = scanner.next().charAt(0);

        if (operator == '+'){
            result = num1 + num2;
            System.out.println("Hasil dari operasi jumlah dari digit " + num1 + " dan " + num2 + " adalah " + result);
        } else if (operator == '-'){
            result = num1 - num2;
            System.out.println("Hasil dari operasi pengurangan dari digit " + num1 + " dan " + num2 + " adalah " + result);
        } else if (operator == '/'){
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Hasil dari operasi pembagian dari digit " + num1 + " dan " + num2 + " adalah " + result);
            } else {
                System.out.println("Error, pembagian tidak bisa dilakukan");
            }
        } else if (operator == '*'){
            result = num1 * num2;
            System.out.println("Hasil dari operasi perkalian dari digit " + num1 + " dan " + num2 + " adalah " + result);
        } else if (operator == '%'){
            if (num2 != 0) {
                result = num1 % num2;
                System.out.println("Hasil dari operasi pembagian modulus dari digit " + num1 + " dan " + num2 + " adalah " + result);
        } else {
            System.out.println("Error, pembagian modulus tidak bisa dilakukan");
        }
    } else {
        System.out.println("Error, operasi tidak valid");
    }
    System.out.println("apakah ingin menggunakan kalkulator lagi? (Y/N)");
    answer = scanner.next().toLowerCase();

    if (!answer.equals("y")){
        continueCalculating = false;
        }
    }
    System.out.println("Terimakasih telah menggunakan program kami");
    scanner.close();
    }
}