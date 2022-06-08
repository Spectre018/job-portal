package com.job.portal.controller;


import com.job.portal.model.HrAddedJob;
import com.job.portal.model.User;
import com.job.portal.repository.HrAddedJobRepository;
import com.job.portal.repository.UserRepository;
import com.job.portal.service.HrAddedJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class HomeController {

    public String username;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HrAddedJobRepository hrAddedJobRepository;

    @Autowired
    private HrAddedJobService hrAddedJobService;

    @GetMapping("/applyJobsOnRegistration")
    public String applyJobsOnReg(Model model) {
        model.addAttribute("joblist", hrAddedJobService.getAllHrAddedJobs());
        return "apply_job_on_reg";
    }

    @GetMapping("/accessDenied")
    public String accessDenied() {
        return "accessDenied";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

}
