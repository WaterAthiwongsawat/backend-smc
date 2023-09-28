package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String studentId; // เปลี่ยนประเภทข้อมูลเป็น String
    private String name;
    private String surname; // เพิ่มคอลัมน์ surname
    private String email;
    private String telephonenumber; // เพิ่มคอลัมน์ telephonenumber
    private String password;

    public Student() {
        // คอนสตรักเตอร์ว่างเพื่อให้ JPA ทำงานได้ถูกต้อง
    }

    public Student(Integer id, String studentId, String name, String surname, String email, String telephonenumber, String password) {
        this.id = id;
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.telephonenumber = telephonenumber;
        this.password = password;
    }

    // เมทอด getter และ setter สำหรับคอลัมน์
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
