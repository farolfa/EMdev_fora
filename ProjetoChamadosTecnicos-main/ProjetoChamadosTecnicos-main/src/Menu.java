
import java.util.Scanner;


public class Menu {
    private int opcao;
    private Scanner sc = new Scanner(System.in);

    public Menu(){}

    public void administrador(int opcao){
        switch (opcao) {
            case 1:
                System.out.println("Cadastrando Administrador...");
                break;
            case 2:
                System.out.println("Listando Administradores...");
                break;
            case 3:
                System.out.println("Atualizando Administrador...");
                break;
            case 4:
                System.out.println("Excluindo Administrador...");
                break;
        }
        System.out.println("pressione para continuar...");
        sc.nextLine();
    }
    public void tecnico(int opcao){
        switch(opcao){
            case 1:
                System.out.println("Cadastrando Técnico...");
                break;
            case 2:
                System.out.println("Listando Técnicos...");
                break;
            case 3:
                System.out.println("Atualizando Técnico...");
                break;
            case 4:
                System.out.println("Excluindo Técnico...");
                break;
            }
            System.out.println("pressione para continuar...");
        sc.nextLine();
    }
    public void cliente(int opcao){
        switch(opcao){
        case 1:
            System.out.println("Cadastrando Cliente...");
            break;
        case 2:
            System.out.println("Listando Clientes...");
            break;
        case 3:
            System.out.println("Atualizando Cliente...");
            break;
        case 4:
            System.out.println("Excluindo Cliente...");
            break;
        }
        System.out.println("pressione para continuar...");
        sc.nextLine();
    }
    public void departamento(int opcao){
        switch(opcao){
        case 1:
            System.out.println("Cadastrando Departamento...");
            break;  
        case 2:
            System.out.println("Listando Departamentos...");
            break;
        case 3:
            System.out.println("Atualizando Departamento...");
            break;
        case 4:
            System.out.println("Excluindo Departamento...");
            break;
        }
        System.out.println("pressione para continuar...");
        sc.nextLine();
    }
    public void status(int opcao){
        switch(opcao){
        case 1:
            System.out.println("Cadastrando Status...");
            break;
        case 2:
            System.out.println("Listando Status...");
            break;
        case 3:
            System.out.println("Atualizando Status...");
            break;
        case 4:
            System.out.println("Excluindo Status...");
            break;
        }
        System.out.println("pressione para continuar...");
        sc.nextLine();
    }
    public void chamados(int opcao){
        switch(opcao){
        case 1:
            System.out.println("Cadastrando Chamado...");
            break;
        case 2:
            System.out.println("Listando Chamados...");
            break;
        case 3:
            System.out.println("Atualizando Chamado...");
            break;
        case 4:
            System.out.println("Excluindo Chamado...");
            break;
        }
        System.out.println("pressione para continuar...");
        sc.nextLine();
    }
    public void atendimento(int opcao){
        switch(opcao){
        case 1:
            System.out.println("Cadastrando Atendimento...");
            break;
        case 2:
            System.out.println("Listando Atendimentos...");
            break;
        case 3:
            System.out.println("Atualizando Atendimento...");
            break;
        case 4:
        System.out.println("Excluindo Atendimento...");
            break;
        }
        System.out.println("pressione para continuar...");
        sc.nextLine();
    }
    public void encaminhamento(int opcao){
        switch(opcao){
        case 1:
            System.out.println("Cadastrando Encaminhamento...");
            break;
        case 2:
            System.out.println("Listando Encaminhamentos...");
            break;
        case 3:
            System.out.println("Atualizando Encaminhamento...");
            break;
        case 4:
            System.out.println("Excluindo Encaminhamento...");
            break;
        }
        System.out.println("pressione para continuar...");
        sc.nextLine();
    }
}
