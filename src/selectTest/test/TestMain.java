package selectTest.test;

import selectTest.domain.Student;
import selectTest.service.StudentService;

import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        List<Student> list = service.selectOne();
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
