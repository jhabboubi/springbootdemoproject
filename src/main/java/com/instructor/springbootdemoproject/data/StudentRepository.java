package com.instructor.springbootdemoproject.data;

import com.instructor.springbootdemoproject.DTO.StudentCoursesView;
import com.instructor.springbootdemoproject.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {


}
