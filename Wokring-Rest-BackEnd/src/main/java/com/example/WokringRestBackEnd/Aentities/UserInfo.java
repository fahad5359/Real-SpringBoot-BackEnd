package com.example.WokringRestBackEnd.Aentities;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
//@Data
@Entity
@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue
    private int id;


    @Column(nullable = true, name = "user_name")

    private String userName;

    @Column(nullable = true, name = "pass_word")

    private String passWord;

    @Column(nullable = true, name = "email")
    @Email
    private String email;

    @Column(nullable = true, name = "ideea")

    private String ideea;

    @Column(nullable = true, name = "subject")

    private String subject;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
