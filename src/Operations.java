import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Operations extends Remote {
    Student saveStudent(Student s) throws  Exception;
    Student getStudent(int id) throws  Exception;
    List<Student> getStudents() throws  Exception;
    Student deleteStudent( int id) throws  Exception;
}
