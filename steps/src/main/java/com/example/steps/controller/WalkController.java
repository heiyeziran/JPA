package com.example.steps.controller;

import com.example.steps.task.Jobs;
import com.example.steps.entity.Sport;
import com.example.steps.entity.Walker;
import com.example.steps.repository.SportRepository;
import com.example.steps.repository.WalkRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user")
public class WalkController {
    @Resource
    private WalkRepository walkRepository;
    @Resource
    private SportRepository sportRepository;

    private Walker walker = new Walker();
    private Sport sport = new Sport();
    private Jobs jobs = new Jobs();


    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpSession session) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        walker = walkRepository.findByAccountAndPassword(username, password);
        sport = sportRepository.findSportByAccount(username);
        String str = "";
        if (walker != null) {
            session.setAttribute("userLogin", walker);
            session.setAttribute("steps", sport);
            session.setAttribute("ranking", jobs.rank());
            str = "home";
        } else {
            str = "index";
        }
        return str;
    }

}
