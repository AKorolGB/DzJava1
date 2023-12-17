package MVC.Controler;

import MVC.Service.DataService;
import MVC.Student;
import MVC.Tupe;
import MVC.User;
import MVC.View.StudentView;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName,String secondName,String lastName){
        service.create(firstName,secondName,lastName, Tupe.STUDENT);
    }

    public  void getAllStudent(){
        for (User user: service.getAllStudent()){
            studentView.printOnConsole((Student) user );
        }
    }
}
