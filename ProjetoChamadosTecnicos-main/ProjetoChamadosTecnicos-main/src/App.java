import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int menu1=-1,menu2=-1;
        Scanner ler = new Scanner(System.in);
        Menu menuClass = new Menu();
        do {
            try {
                //exibir o menu 1
                System.out.println("===== MENU 1=====");
                System.out.println("1 - Administrador");
                System.out.println("2 - Técnico");
                System.out.println("3 - Cliente");
                System.out.println("----------------------");
                System.out.println("4 - Departamento");
                System.out.println("5 - Status");
                System.out.println("----------------------");
                System.out.println("6 - Chamado");
                System.out.println("7 - Atendimento");
                System.out.println("8 - Encaminhamento");
                System.out.println("----------------------");
                System.out.println("0 - Sair");
                //ler a opção do menu 1
                System.out.println("\nDigite a opção do menu 1:");
                menu1 = ler.nextInt();
                if(menu1 == 0) {
                    System.out.println("Saindo do sistema...");
                    break;
                }else{
                    //exibir o menu 2
                    System.out.println("===== MENU 2=====");
                    System.out.println("1 - Cadastrar");
                    System.out.println("2 - Listar");   
                    System.out.println("3 - Atualizar");
                    System.out.println("4 - Excluir");
                    System.out.println("----------------------");
                    System.out.println("0 - Voltar");
                    System.out.println("\nDigite a opção do menu 2:");
                    menu2 = ler.nextInt();
                    if(menu2 == 0) {
                        System.out.println("Voltando ao menu 1...");
                        continue;
                    }
                    switch (menu1) {
                        case 1:
                        menuClass.administrador(menu2);
                        break;
                        case 2:
                        menuClass.tecnico(menu2);
                        break;
                        case 3:
                        menuClass.cliente(menu2);
                        break;
                        case 4:
                        menuClass.departamento(menu2);
                        break;
                        case 5:
                        menuClass.status(menu2);
                        break;
                        case 6:
                        menuClass.chamados(menu2);
                        break;
                        case 7:
                        menuClass.atendimento(menu2);
                        break;
                        case 8:
                        menuClass.encaminhamento(menu2);
                        break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                }
            } catch (Exception e) {
                System.out.println("ERRO:"+e.getMessage());
            }
        } while (menu1!= 0);
    }
}
