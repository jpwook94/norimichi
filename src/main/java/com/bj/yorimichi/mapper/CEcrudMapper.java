package com.bj.yorimichi.mapper;

import com.bj.yorimichi.vo.CEVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CEcrudMapper {

    @Select("select * from destination_test")
    public List<CEVO> selectAllDestination();

    //하나조회
    @Select("select * from destination_test where dt_no=#{num}")
    CEVO selectDestination(int num);

    @Delete("delete destination_test where dt_no=#{num}")
    public int deleteDestination(@Param("num") int num);

    @Insert("insert into destination_test values (destination_test_seq.nextval, #{dt_name}, #{dt_address}, #{dt_image}, #{dt_mbti_category}, #{dt_location_no})")
    int insertDestination(CEVO cevo);

    @Update("update destination_test set dt_name=#{dt_name}, dt_address=#{dt_address}, dt_mbti_category=#{dt_mbti_category} where dt_no=#{dt_no}")
    int updateDestination(CEVO cevo);


}
