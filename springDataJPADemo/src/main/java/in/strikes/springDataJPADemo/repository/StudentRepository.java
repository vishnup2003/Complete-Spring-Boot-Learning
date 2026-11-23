package in.strikes.springDataJPADemo.repository;

import in.strikes.springDataJPADemo.entity.Student;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findByMailLike(String pattern);

    @Query(value = """
            select * from student
            where mail = :mail
            """, nativeQuery = true)
    Optional<Student> findByMail(@Param("mail") String mail);
}
