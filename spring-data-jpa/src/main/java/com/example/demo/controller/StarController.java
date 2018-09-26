package com.example.demo.controller;

import com.example.demo.service.StarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/9/20 0020.
 */
@Controller
@RequestMapping(value = "/star")
public class StarController {
    private static final String STAR_DETAIL_PATH_NAME = "starDetail";
    private static final String STAR_LIST_PATH_NAME="starList";
    @Resource
    StarService starService;

    @GetMapping(value = "/all")
    public  String getStarList(ModelMap map){
        map.addAttribute("starList",starService.findAll());
        return STAR_LIST_PATH_NAME;
    }

    @GetMapping(value = "/{id}")
     public String getStar(@PathVariable Integer id,ModelMap map){
        map.addAttribute("star",starService.findById(id));
        return STAR_DETAIL_PATH_NAME;
       //change
    }
////    private static final String STAR_DETAIL_PATH_NAME = "bookDetail";
////    private static final String STAR_LIST_PATH_NAME = "bookList";
//
//    @Resource
//    BookService bookService;
//
//    /**
//     * 获取 Book 列表
//     * 处理 "/book/all" 的 GET 请求，用来获取 Book 列表
//     * 数据存入ModelMap，返回Thymeleaf页面
//     */
//    @GetMapping("/all")
//    public String getBookList(ModelMap map) {
//        map.addAttribute("bookList", bookService.findAll());
//        return BOOK_LIST_PATH_NAME;
//    }
//
//    /**
//     * 获取 Book
//     * 处理 "/book/{id}" 的 GET 请求
//     * 返回单个数据的模板页面
//     */
//    @GetMapping(value = "/{id}")
//    public String getBook(@PathVariable Long id, ModelMap map) {
//        map.addAttribute("book", bookService.findById(id));
//        return BOOK_DETAIL_PATH_NAME;
//    }
}
