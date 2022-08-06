package online.ivandjoh.demogradle.Entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "age")
    private int age;

    @Column(name = "salary")
    private float salary;

}
