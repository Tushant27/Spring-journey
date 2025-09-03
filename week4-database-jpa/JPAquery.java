import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Simple JPQL query
    @Query("SELECT e FROM Employee e WHERE e.salary > ?1")
    List<Employee> findEmployeesWithSalaryGreaterThan(Double salary);

    // Using native SQL
    @Query(value = "SELECT * FROM employee e WHERE e.name = ?1", nativeQuery = true)
    Employee findByNameNative(String name);
}
