package com.springboot.homework.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Praise {

    @Id
    @GeneratedValue
    private Integer id;

    private String userName;
    private Integer praiseNum;
    private Date createTime;
    private Date updateTime;

    public Praise(String userName, Integer praiseNum, Date createTime, Date updateTime) {
        this.userName = userName;
        this.praiseNum = praiseNum;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
