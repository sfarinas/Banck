package NelioAula.bancOvo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] Farina) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Usuario usuario;
        int opc;

        System.out.print("Digite o numero da C.C : ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do usuario : ");
        String nome = sc.nextLine();


        System.out.println();
        System.out.print("Deseja realizar seu primeiro Deposito (S) SIM ou (N)NAO : ");
        char s1 = sc.next().toUpperCase().charAt(0);
        if (s1 == 'S'){
            //TODO O CODIGO SERA AQUI.
            System.out.println();
            System.out.print("Quanto ira Depositar $ : ");
            double deposito = sc.nextDouble();
            usuario = new Usuario(conta,nome,deposito);
            System.out.println(usuario);
            System.out.println();

            do {
                System.out.println("====== MENU PRINCIPAL =====");
                System.out.println();
                System.out.println("Escolha o que vc deseja");
                System.out.println();
                System.out.print("(1) SALDO da C.C, (2) SAQUE da C.C, (3) DEPOSITO na C.C ou (4) Finalizar : ");
                opc = sc.nextInt();
                System.out.println();

                switch (opc){
                    case 1:{
                        //usuario = new Usuario(conta,nome,deposito);
                        System.out.println(usuario);
                        break;
                    }
                    case 2:{
                        System.out.print("Quanto deseja SACAR : ");
                        double novoSaque = sc.nextDouble();
                        usuario.novoSaque(novoSaque);
                        //usuario = new Usuario(conta,nome,novoSaque);
                        System.out.println(usuario);
                        break;
                    }
                    case 3:{
                        System.out.print("Quanto ira DEPOSITAR : ");
                        double novoDeposito = sc.nextDouble();
                        usuario.novoDeposito(novoDeposito);
                        //usuario = new Usuario(conta,nome,novoDeposito);
                        System.out.println(usuario);
                        break;
                    }
                    case 4:{
                        System.out.println("Obrigado pela sua compania " + usuario.getNomeCliente());
                        break;
                    }
                    default: {
                        System.out.println("opcao invalida");
                        break;
                    }
                }
                System.out.println();

            }while (opc != 4);
        }else {
            usuario = new Usuario(conta,nome);
            System.out.println(usuario);
            System.out.println("OBRIGADO E VOLTE SEMPRE");
        }
        System.out.println("FIM");
        sc.close();
    }
}
