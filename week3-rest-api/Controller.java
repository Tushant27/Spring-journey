import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Yo")
public class studentController {



    @Autowired
    studentRepository repo;

    @GetMapping("/student")
    public List<Student> getallStudent()
    {
        List<Student> students=repo.findAll();
        return students;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id)
    {
        Student s=repo.findById(id).get();
        return s;
    }

    @PostMapping("/student/add")
    public void addStudent(@RequestBody Student student)
    {
        repo.save(student);
    }

    @PutMapping("student/update/{id}")
    public Student updateStudent(@PathVariable int id)
    {
        Student student=repo.findById(id).get();
        student.setName("YOYO");
        student.setPercentage(99F);
        repo.save(student);
        return student;
    }

    @DeleteMapping("student/{id}")
    public void deleteStudent(@PathVariable int id)
    {
        Student student=repo.findById(id).get();
        repo.delete(student);
    }
}