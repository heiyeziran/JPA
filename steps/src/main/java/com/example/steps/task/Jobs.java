package com.example.steps.task;

import com.example.steps.entity.Sport;
import com.example.steps.repository.SportRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class Jobs {
    @Resource
    private SportRepository sportRepository;

    public static List<Sport> rankingList = null;

    @Scheduled(cron = "0 48 21 * * ?")
    public void ranking() {
        rankingList = sportRepository.getAll();
        System.out.println(rankingList);
    }

    public List<Sport> rank() {
        return rankingList;
    }
}
