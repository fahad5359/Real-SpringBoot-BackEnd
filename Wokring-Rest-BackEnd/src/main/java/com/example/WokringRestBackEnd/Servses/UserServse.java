package com.example.WokringRestBackEnd.Servses;

import com.example.WokringRestBackEnd.Aentities.UserInfo;
import com.example.WokringRestBackEnd.Rpo.Rpoo;
import com.example.WokringRestBackEnd.dTo.Dt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServse {

    @Autowired
    private Rpoo rpo;

                                                                      //--   Post
    public List<UserInfo> PostUser(List<UserInfo> usr) {
        return rpo.saveAll(usr);
    }

    public UserInfo adUsr(Dt dt) {
        // حطينا القتر كلها في الاوبجكت usrnf ثم قلنا خزنه في قاعدة البياتات
        UserInfo usrnfo = UserInfo
                .build
                        (0
                                , dt.getUserName()
                                , dt.getPassWord()
                                , dt.getEmail()
                                , dt.getIdeea()
                                , dt.getSubject()
                        );
        return rpo.save(usrnfo);  //   هنا قلنا خزنة في قاعدت البيانات --->
    }


                                                                    //-- get
    public List<UserInfo> geAll() {
        return rpo.findAll();
    }

    public UserInfo getCusmrById(int id) {
        return rpo.findById(id).orElse(null);
    }

//    public UserInfo getUserInfo(int id) {
//        return getCusmrById()
//                .stream()
//                .filter(userInfo -> userInfo.getId().equals(id))
//                .findFirst()
//                .orElseThrow(
//                        () ->
//                                new IllegalArgumentException
//                                        ("Customer with ID " + id + "Not Found"));
//    }
}
