package com.example.WokringRestBackEnd.Controllers;

import com.example.WokringRestBackEnd.Aentities.UserInfo;
import com.example.WokringRestBackEnd.Servses.UserServse;
import com.example.WokringRestBackEnd.dTo.Dt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServse srvice;

    //--      Post
    @PostMapping("/addUsr")
    public List<UserInfo> addUser(@Valid @RequestBody List<UserInfo> usr) {
        return srvice.PostUser(usr);
    }

    @PostMapping("/signUp")
    public ResponseEntity<UserInfo> addusr(@Valid @RequestBody Dt dt) {
        return new ResponseEntity<>(srvice.adUsr(dt), HttpStatus.CREATED);

    }


    //--      Get
    @GetMapping("/GetAll")

    public ResponseEntity<List<UserInfo>> getAllUsers() {
        return ResponseEntity.ok(srvice.geAll());
    }

    @GetMapping("/GetCustomerById/{id}")
    public UserInfo getCustomerBy_Id(@PathVariable int id) {
        return srvice.getCusmrById(id);
    }

}
