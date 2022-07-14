import javax.swing.JOptionPane;
public class HealthProfileTest{
    public static void main (String [] args){
        //passando valores
        String nome = JOptionPane.showInputDialog("Digite seu nome :");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome :");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo :");
        String msg = JOptionPane.showInputDialog("Digite o dia que vc nasceu:");
        int dia = Integer.parseInt(msg);
        msg= JOptionPane.showInputDialog("Digite o mes que vc nasceu:");
        int mes = Integer.parseInt(msg);
        msg = JOptionPane.showInputDialog("Digite o ano que vc nasceu:");
        int ano = Integer.parseInt(msg);
        msg = JOptionPane.showInputDialog("Digite seu peso:");
        double peso = Double.parseDouble(msg);
        msg = JOptionPane.showInputDialog("Digite sua altura");
        double altura = Double.parseDouble(msg);
        //iniciando construtor
        HealthProfile pessoa1 = new HealthProfile(nome,sobrenome,sexo,peso,altura,dia,mes,ano);
        //formatando mensagem final
        msg = String.format("\nPerfil do paciente 1\nNome : %s %s\nSexo: %s\nIdade : %d\nPeso : %.2f\nAltura : %.2f\nFrequencia Cardiaca Maxima : %d\nFrequencia cardiaca alvo: %.2f\nIMC: %s",pessoa1.getName(),pessoa1.getLastName(),pessoa1.getSexo(),pessoa1.getIdade(),pessoa1.getPeso(),pessoa1.getHeight(),pessoa1.getFreqCardMax(),pessoa1.getFreqCardAlvo(),pessoa1.getIMC());
        JOptionPane.showMessageDialog(null,msg);

    }
}