package batch.student_crud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import batch.student_crud.dto.Student;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Integer> {

	

	boolean existsByMobile(long mobile);

	List<Student> findByName(String name);

	Optional<Student> findByMobile(long mobile);

//	List<Student> findByPercentageGreaterThanEqualAndPercentageLessThan(double d, double e);

//	

}
