package ghtk.com.students.dto;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ghtk.com.students.entities.Students;

@Repository
public interface StudentsRes extends JpaRepository<Students, Long> {
//	Optional<Students> findByIdstudent(String s);
//
	@Query("select student from Students student where student.name like %:name%")
    List<Students> findByName(@Param("name") String name);
	
	@Query("select student from Students student where student.studenCode like %:studenCode%")
    List<Students> findByIds(@Param("studenCode") String studenCode);

}
