package Skytech.student.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;

@Component
//@JsonIgnoreProperties("age")
//@JsonPropertyOrder({"id" ,"student_name" , "phoneNo", "email" , "age" , "address"})
public class Student {

    private int id;

    @NotEmpty(message = " feild cannot be blank ")
    @Pattern(regexp = "^[A-Za-z ]+$",
            message = "username must not contain any special characters")
//    @JsonProperty("student_name")
    private String name;

    @Size(
            min = 10, max = 10,
            message = "Phone Number  must Contain  10 number ")
    private String phoneNo;


    private  String email;

    private  int age;


    private  String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", Address='" + address + '\'' +
                '}';
    }
}
