package com.example.WokringRestBackEnd.dTo;

import lombok.*;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Getter
@Setter
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Dt {
    @NotEmpty(message = "hebe plz fill user Nem")
    @NotBlank(message = "Please Enter a UsserName")
    private String userName;


    @NotBlank(message = "PassWord is Needed")
    private String passWord;


    @Email
    private String email;


    @NotBlank(message = "Add An Idea")
    private String ideea;


    @NotBlank(message = "PLease Spcfy a Subjuct for Ideea")
    private String subject;
}
