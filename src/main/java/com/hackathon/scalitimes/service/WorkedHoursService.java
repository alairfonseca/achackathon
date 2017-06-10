package com.hackathon.scalitimes.service;

import com.hackathon.scalitimes.domains.models.WorkedHours;
import com.hackathon.scalitimes.domains.repositories.WorkedHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Pedro on 10/06/2017.
 */
@Component
public class WorkedHoursService {

    @Autowired
    WorkedHoursRepository workedHoursRepository;

    void addHoursToDatabase(WorkedHours entity){workedHoursRepository.save(entity);}
}
