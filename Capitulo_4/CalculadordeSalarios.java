import java.util.Scanner;
public class CalculadordeSalarios{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double salario_adicional=0.0,hora_adicional,salario_bruto;
        for(int i=0;i<3;i++){
            System.out.printf("\nBem vindo Funcionario %d\n",i+1);
            System.out.print("Digite o quanto você recebe por hora :");
            double salario_hora = input.nextDouble();
            System.out.print("Digite quantas horas vc trabalhou na semana passada :");
            double hora_trabalhada = input.nextDouble();
            hora_adicional = hora_trabalhada - 40;
            if(hora_adicional>0){
                hora_trabalhada-=hora_adicional;
                salario_adicional = (hora_adicional * salario_hora) * 1.5;
                salario_bruto = salario_adicional + (hora_trabalhada * salario_hora);
            }else
                salario_bruto =hora_trabalhada * salario_hora;
            System.out.printf("\nSalario sera de = %.2f",salario_bruto);
        }
    }
}