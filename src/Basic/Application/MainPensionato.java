package Basic.Application;

import Basic.Application.entities.Pensionato;

import java.util.Scanner;

/*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.*/
public class MainPensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pensionato[] room = new Pensionato[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            room[roomNumber] = new Pensionato(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (room[i] != null) {
                System.out.println(i + ": " + room[i]);
            }
        }
        sc.close();

    }
}
