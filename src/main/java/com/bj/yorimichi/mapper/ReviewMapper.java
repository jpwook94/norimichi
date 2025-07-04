package com.bj.yorimichi.mapper;

import com.bj.yorimichi.vo.ReviewVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReviewMapper {

    @Select("select * from review_test")
    public List<ReviewVO> selectAllReviews();


}
