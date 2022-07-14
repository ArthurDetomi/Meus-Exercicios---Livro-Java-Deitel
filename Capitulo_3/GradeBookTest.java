import javax.swing.JOptionPane;
public class GradeBookTest{
    public static void main(String[] args){
        //cria objeto GradeBook
        GradeBook gradeBook1 = new GradeBook("Introducao ao Java","Arthur");
        GradeBook gradeBook2 = new GradeBook("Estruturas do Java","Geraldo");

        String mensagem = String.format("\nInstrutor : %s\nGrade Book 1 course is : %s",gradeBook1.getInstructorName(),gradeBook1.getCourseName());
        JOptionPane.showMessageDialog(null,mensagem);
        String mensagem2 = String.format("\nInstrutor : %s\nGrade Book 2 course is : %s",gradeBook2.getInstructorName(),gradeBook2.getCourseName());
        JOptionPane.showMessageDialog(null,mensagem2);



        //gradebook1 recebendo nome do instrutor e grade de curso e atribuindo
        String nomeinstrutor=JOptionPane.showInputDialog("Digite o nome do instrutor :");
        gradeBook1.setInstructorName(nomeinstrutor); //atribuindo
        String nomedagrade= JOptionPane.showInputDialog("Digite o nome da grade de curso :");
        gradeBook1.setCourseName(nomedagrade); //atribuindo
        //gradebook2 recebendo nome do instrutor e grade de curso e atribuindo
        String nomeinstrutor2 = JOptionPane.showInputDialog("Digite o nome do Instrutor:");
        gradeBook2.setInstructorName(nomeinstrutor2);
        String nomedagrade2 = JOptionPane.showInputDialog("Digite o nome da grade do curso :");
        gradeBook2.setCourseName(nomedagrade2);

        String mensagem3 = String.format("\nInstrutor : %s\nGrade Book 1 course is : %s",gradeBook1.getInstructorName(),gradeBook1.getCourseName());
        JOptionPane.showMessageDialog(null,mensagem3);
        String mensagem4 = String.format("\nInstrutor : %s\nGrade Book 2 course is : %s",gradeBook2.getInstructorName(),gradeBook2.getCourseName());
        JOptionPane.showMessageDialog(null,mensagem4);
        

         

    }
}