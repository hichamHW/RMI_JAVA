import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class StudentOperations implements Operations {

   public List<Student> studentList = new ArrayList<Student>();

    @Override
    public Student saveStudent(Student s) throws Exception {
        studentList.add(s);
        return s;
    }

    @Override
    public Student getStudent(int id) throws Exception {
        return studentList.get(id) ;
    }

    @Override
    public List<Student> getStudents() throws Exception {
        return studentList;
    }

    @Override
    public Student deleteStudent(int id) throws Exception {
        return studentList.remove(id);
    }
}
