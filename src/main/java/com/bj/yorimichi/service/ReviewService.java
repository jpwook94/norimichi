package com.bj.yorimichi.service;

import com.bj.yorimichi.mapper.ReviewMapper;
import com.bj.yorimichi.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;

    public List<ReviewVO> getAllReviews() {
        List<ReviewVO> reviews = reviewMapper.selectAllReviews();
        System.out.println(reviews);
        return reviews;
//        return reviewMapper.selectAllReviews();
    }

    public void deleteReview() {

    }


}
