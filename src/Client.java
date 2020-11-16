import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception {
        Operations sub =(Operations) Naming.lookup("n1");

        sub.saveStudent(new Student(3,"driss benhachem","Mohammadia","+212883773"));
        sub.saveStudent(new Student(4,"yassine benhachem","Mohammadia","+212883773"));
        sub.saveStudent(new Student(5,"omaima benhachem","Mohammadia","+212883773"));
        sub.saveStudent(new Student(6,"khadija benhachem","Mohammadia","+212883773"));
        sub.saveStudent(new Student(7,"ahmed  benhachem","Mohammadia","+212883773"));
        sub.saveStudent(new Student(8,"youssef benhachem","Mohammadia","+212883773"));

        System.out.println("---------------------------------------------");
        sub.getStudents().forEach( (s)->{
            System.out.println(s.toString());
        });
        System.out.println("---------------------------------------------");
        sub.deleteStudent(1);


        System.out.println("---------------------------------------------");
        sub.getStudents().forEach( (s)->{
            System.out.println(s.toString());
        });

        System.out.println("---------------------------------------------");
    }
}
