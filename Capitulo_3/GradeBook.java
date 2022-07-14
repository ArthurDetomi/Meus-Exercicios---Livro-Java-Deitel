import javax.swing.JOptionPane;
public class GradeBook{
    private String courseName;
    private String instructorName;
    // o construtor inicializando com o argumento String
    public GradeBook(String name,String name2){
        courseName = name;
        instructorName = name2;
    }
    // metodo para configurar nome do curso
    public void setCourseName(String name){
        courseName = name;
    }
    public void setInstructorName(String name){
        instructorName = name;
    }
    // metodo para recuperar nome do curso
    public String getCourseName(){
        return courseName;
    }
    public String getInstructorName(){
        return instructorName;
    }
    String message = String.format("Welcome to the grade Book for %s",getCourseName());   
    public void displayMessage(){
        JOptionPane.showMessageDialog(null,message);
    }
}