package com.hackathon.scalitimes.web;

import com.hackathon.scalitimes.domains.http.TimerRequest;
import com.hackathon.scalitimes.domains.models.User;
import com.hackathon.scalitimes.domains.models.WorkedHours;
import com.hackathon.scalitimes.domains.repositories.WorkedHoursRepository;
import com.hackathon.scalitimes.service.UserService;
import com.hackathon.scalitimes.service.WorkedHoursService;
import com.hackathon.scalitimes.util.Constants;
import com.hackathon.scalitimes.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Pedro on 10/06/2017.
 */
@RestController
@RequestMapping(path = Constants.Config.PATH_V1+"time")
public class TimerController {

    @Autowired
    private WorkedHoursService workedHoursService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public String add(@RequestHeader("token") String token,
                      @Valid @RequestBody TimerRequest request){

        Long userId = TokenUtil.decipherToken(token, Constants.Keys.USER_ID_KEY, Long.class);
        User user = userService.findById(userId);

        WorkedHours workedHours = WorkedHours.builder()
                .date(request.getTime().toLocalDate())
                .time(request.getTime().toLocalTime())
                .user(user)
                .build();

        workedHoursService.addHoursToDatabase(workedHours);


        return "OK!";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get(){
        return "OK2!";
    }
}
