package com.example.demo.controller;

import com.example.demo.DAO.CardDAO;
import com.example.demo.demo1.Card;
import com.example.demo.demo1.Logo;
import com.example.demo.demo1.Topic;
import com.example.demo.demo1.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/17 0017.
 */
@Controller
public class CardController {
    @Resource
    private CardDAO cardDAO;
    @GetMapping("card")
    public String getAll(ModelMap map){
        List<Card> cardList =cardDAO.getCards();
        User user=cardDAO.getUser();
        Logo logo=cardDAO.getLogo();
        List<Topic>topicList=cardDAO.getTopic();

        map.addAttribute("cardList",cardList);
        map.addAttribute("topicList",topicList);
        map.addAttribute("user",user);
        map.addAttribute("logo",logo);
        return "card";

    }
}