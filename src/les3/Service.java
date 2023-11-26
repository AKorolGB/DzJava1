package les3;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<StudyGroup> studyGroupList;
    private StudyGroup activeGroupe;
    private int id;

    public Service() {
        activeGroupe = new StudyGroup();
        studyGroupList = new ArrayList<>();
        studyGroupList.add(activeGroupe);
    }

    public void addStudent(String name,int age){
        Student student = new Student(id++,name,age);
        activeGroupe.addStudent(student);
    }

    public String info(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список группы:\n");
        for (Student student: activeGroupe){
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
