package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private int id;
    @Column(name = "studentName")
    private String name;
    @Column(name = "studentAge")
    private int age;
    @Column(name = "department")
    private String department;
    private boolean isActive = true;
    public Student() {
        this.isActive = true;
    }

}
