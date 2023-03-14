package service;

import entity.Student;

public interface IStudentService {
    Student addStudent(Student student);
    Student removeStudent(Student student);

    Student updateStudentDetails(Student student);
}
