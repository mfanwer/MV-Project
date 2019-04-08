package com.hospital.app.controller;

import com.hospital.app.bean.HealthParameters;
import com.hospital.app.bean.PatientDetails;
import com.hospital.app.bean.PatientInfo;
import com.hospital.app.service.IHealthParameterService;
import com.hospital.app.service.IUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AppController {

    @Autowired
    private IUserDetailsService userDetailsService ;

    @Autowired
    private IHealthParameterService healthParameterService;

    @PostMapping(path = "/onboardUser")
    @ResponseBody
    public void onboardUser(@RequestBody PatientDetails patientDetails){

        userDetailsService.onboardPatient(patientDetails);

    }

    @GetMapping(path = "/getRegisteredUser/{id}")
    public Long getRegisteredUser(@PathVariable Long id){

        return userDetailsService.getRegisteredUsersId(id);

    }

    @PostMapping(path ="/persistHeathDetails")
    public @ResponseBody String persistHeathDetails(@RequestBody List<HealthParameters>  healthParameters){

         healthParameterService.persistHeathDetails(healthParameters);
         return "done";
    }

    @GetMapping(path = "/getHeathDetails/{id}")
    @ResponseBody
    public PatientInfo getHeathDetails(@PathVariable Long id)
    {
        return healthParameterService.getPatientDetailsById(id);
    }




}
