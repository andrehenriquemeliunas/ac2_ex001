import java.util.Scanner;
public class ac2_ex001{
    public static void main( String[] args){
        int idoso, def, ges;//Declaro as variáveis

        Scanner s = new Scanner( System.in);
        System.out.println("Você tem mais de 65 anos? Digite 1 para SIM, e 2 para NÃO");//Verifico se o usuário tem mais de 65 anos
        idoso = s.nextInt();//Salvo a resposta do usuário

        System.out.println("Você possui algum tipo de deficiência? Digite 1 para SIM, e 2 para NÃO");//Verifico se o usuário tem alguma deficiência
        def = s.nextInt();//Salvo a resposta do usuário

        System.out.println("Você é gestante? Digite 1 para SIM, e 2 para NÃO");//Verifico se o usuário é gestante
        ges = s.nextInt();//Salvo a resposta do usuário

        if(idoso == 1 || def == 1 || ges == 1){//Condicional na qual todas tem que ser verdadeiras
            System.out.print("Você PODE estacionar na vaga preferencial!");//Se a condição for satisfeita
        }else{
            System.out.print("Você NÃO pode estacionar na vaga preferencial!");//Se a condição não for satisfeita
        }

        s.close();
    }
}