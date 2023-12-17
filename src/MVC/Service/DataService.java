package MVC.Service;

import MVC.Student;
import MVC.Teacher;
import MVC.Tupe;
import MVC.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;
    public void create(String firstName,String secondName, String lastName,Tupe tupe){
        int id = getMaxId(tupe);
        if(tupe == Tupe.STUDENT){
            userList.add(new Student(id,firstName,secondName,lastName));
        }
        if(tupe == Tupe.TEACHER){
            userList.add(new Student(id,firstName,secondName,lastName));
        }
    }

    private int getMaxId(Tupe tupe){
        boolean itsStudent = Tupe.STUDENT == tupe;
        int lastId = 1;
        for (User user: userList){
            if(user instanceof Teacher && !itsStudent){
                lastId = ((Teacher) user).getTeacherId()+1;
            }
            if(user instanceof Student && itsStudent){
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }

    public List<User> getAllStudent(){
        List<User> resultList = new ArrayList<>();
        for (User user : userList){
            if(user instanceof Student)
                resultList.add(user);
        }
        return resultList;
    }
    public List<User> getUserList() {
        return userList;
    }
}
