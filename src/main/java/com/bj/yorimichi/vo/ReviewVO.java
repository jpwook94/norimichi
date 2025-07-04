package com.bj.yorimichi.vo;

import lombok.*;

import java.util.Date;





//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class ReviewVO {
    private int r_no;
    private String r_title;
    private String r_txt;
    private Date r_date;

}
