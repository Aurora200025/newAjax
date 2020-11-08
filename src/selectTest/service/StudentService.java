package selectTest.service;

import selectTest.dao.StudentDao;
import selectTest.domain.Student;
import selectTest.util.MySpring;
import selectTest.util.MySqlSession;

import java.util.List;

public class StudentService {

    private StudentDao dao = MySqlSession.getMapper(StudentDao.class, true);

    public List<Student> selectOne() {
        return dao.selectList();
    }
}
