package controleDeFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        //importando classe para acessar entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
       
        //mensageria com usuario -  entrada de dados
        System.out.println("Digite o primeiro parâmetro: ");   
        int primeiroParametro = scanner.nextInt();
        
        System.out.println("Digite o segundo parâmetro: ");   
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);           
        } catch (ParametrosInvalidosException exception ){
            System.out.println("O segundo parametro deve ser menor que o primeiro.");    
    }
}

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
         if (parametroUm<=parametroDois) {
           throw new ParametrosInvalidosException();
        }

        int contagem = parametroUm - parametroDois;
        System.out.println("Entrou no método contar");
        
        for (int i = 0;i <= contagem;i++){
            System.out.println("Imprimindo o numero: "+i);
        }
    }
}

