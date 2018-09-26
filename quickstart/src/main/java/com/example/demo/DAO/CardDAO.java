package com.example.demo.DAO;

import com.example.demo.demo1.Card;
import com.example.demo.demo1.Logo;
import com.example.demo.demo1.Topic;
import com.example.demo.demo1.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/9/17 0017.
 */
@Data
@Configuration
public class CardDAO {
    public List<Card> getCards(){
        Card[] cards={
                new Card("21.jpg","tp","19小时前","别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1\n" +
                        "别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1","22.png","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。"),
                new Card("21.jpg","化学心情下2","19小时前","工作日让家中电脑不再闲置，其实你可以遥控它做很多事\n" +
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事","22.png","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？"),
                new Card("21.jpg","tp","19小时前","告别死板与沉闷，试试这款像素风汇率查询工具：像素汇率 | App+1\n" +
                        "告别死板与沉闷，试试这款像素风汇率查询工具：像素汇率 | App+1","22.png","支持现实货币与虚拟货币的像素风汇率换算应用，还可以查看汇率走势。"),
                new Card("21.jpg","洛世","Chrome 在 10 周年之际发布了新版，除了好看还更安全\n" +
                        "Chrome 在 10 周年之际发布了新版，除了好看还更安全","Chrome 在 10 周年之际发布了新版，除了好看还更安全\n" +
                        "Chrome 在 10 周年之际发布了新版，除了好看还更安全","22.png","Google 在 Chrome 十周年之际向全平台推送了 Chrome 69 正式版的更新，为我们带来了采用全新设计的 Google material theme 主题，同时还新增了许多新功能，特别在安全性方面做出了很大的提升。"),
        };
        List<Card> cardList= Arrays.asList(cards);
        return cardList;
    }
    public List<Topic> getTopic(){
        Topic[] topics={
                new Topic("topic.jpg","金融"),
                new Topic("topic.jpg","金融"),
                new Topic("topic.jpg","金融"),
                new Topic("topic.jpg","金融")

        };
        List<Topic> topicList=Arrays.asList(topics);
        return topicList;
    }
    public User getUser(){
        User user=new User();
        user.setAvatar("21.jpg");
        user.setName("黑夜孜然");
        return user;
    }

    public Logo getLogo(){
        Logo logo=new Logo();
        logo.setLogo1("25.png");
        logo.setLogo2("24.png");
        return logo;
    }

}
