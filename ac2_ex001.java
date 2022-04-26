import java.util.Scanner;
public class ac2_ex001{
    public static void main( String[] args){
        int idoso, def, ges;

        Scanner s = new Scanner( System.in);
        System.out.println("Você tem mais de 65 anos? Digite 1 para SIM, e 2 para NÃO");
        idoso = s.nextInt();

        System.out.println("Você possui algum tipo de deficiência? Digite 1 para SIM, e 2 para NÃO");
        def = s.nextInt();

        System.out.println("Você é gestante? Digite 1 para SIM, e 2 para NÃO");
        ges = s.nextInt();

        if(idoso == 1 || def == 1 || ges == 1){
            System.out.print("Você PODE estacionar na vaga preferencial!");
        }else{
            System.out.print("Você NÃO pode estacionar na vaga preferencial!");
        }

        s.close();
    }
}