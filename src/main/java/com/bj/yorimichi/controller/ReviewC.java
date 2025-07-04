package com.bj.yorimichi.controller;


// servlet -> url 파일을 다수로 운용.
// url 매핑 / 흐름 제어

import com.bj.yorimichi.mapper.ReviewMapper;
import com.bj.yorimichi.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewC {

    @Autowired          // 의존성 주입   DI
    private ReviewMapper reviewService;



    @GetMapping("/review-all")
    public String reviewAll(Model model) {
        model.addAttribute("reviews", reviewService.selectAllReviews());

        return "review/review";
    }

    @GetMapping("/review-detail")
    public String reviewDetail(@RequestParam("no") int num){
        System.out.println(num);
        System.out.println("review-detail");
        return "index";
    }



    @PostMapping("review-add")
    public String reviewAdd(ReviewVO reviewVO) {
        System.out.println(reviewVO);
        // 값 한 번에 받기 => 객체
        return "index";
    }
}
