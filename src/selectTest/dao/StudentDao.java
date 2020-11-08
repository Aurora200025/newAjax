package selectTest.dao;

import org.apache.ibatis.annotations.Select;
import selectTest.domain.Student;

import java.util.List;

public interface StudentDao {

    @Select("select * from student")
    List<Student> selectList() ;
}
