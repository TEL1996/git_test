package com.offcn.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data //get set
@AllArgsConstructor //有参
@NoArgsConstructor  //无参
public class Car {

    private Integer id;
    private String name;
    private Float price;
   @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdate;


}
