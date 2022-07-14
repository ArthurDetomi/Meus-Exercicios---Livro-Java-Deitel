import javax.swing.JOptionPane;
public class HeartRatesTest{
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite seu nome :");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome :");
        String msg = JOptionPane.showInputDialog("Digite o dia que vc nasceu:");
        int dia = Integer.parseInt(msg);
        msg= JOptionPane.showInputDialog("Digite o mes que vc nasceu:");
        int mes = Integer.parseInt(msg);
        msg = JOptionPane.showInputDialog("Digite o ano que vc nasceu:");
        int ano = Integer.parseInt(msg);
        HeartRates pessoa1 = new HeartRates(nome,sobrenome,dia,mes,ano);
        msg = String.format("Nome do paciente : %s %s\nIdade do paciente: %d\nFrequencia Cardiaca maxima : %d\n Frequencia Cardiaca alvo : %.2f",pessoa1.getName(),pessoa1.getLastname(),pessoa1.getIdade(),pessoa1.getFrequenciaCard(),pessoa1.getFrequenciaAlvo());
        JOptionPane.showMessageDialog(null,msg);
    }
}