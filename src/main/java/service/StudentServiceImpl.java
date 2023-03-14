package service;

import dao.IStudentRepository;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    IStudentRepository repository;

    @Override
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student removeStudent(Student student) {
        Student deleteStudent = student;
        if (repository.existsById(student.getId())) {
            student.setActive(false);
            repository.save(student);
            return deleteStudent;
        }
        return null;
    }

    @Override
    public Student updateStudentDetails(Student student) {
        Student updateStudent = null;
        if (repository.existsById(student.getId()) && repository.findById(student.getId()).get().isActive())
            updateStudent = repository.save(student);
            return updateStudent;
        }
    }

