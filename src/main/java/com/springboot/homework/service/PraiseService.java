package com.springboot.homework.service;

import com.springboot.homework.controller.request.AddOne;
import com.springboot.homework.dao.PraiseDao;
import com.springboot.homework.entity.Praise;
import com.springboot.homework.util.BaseInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service("praiseService")
public class PraiseService {

    @Resource(name = "praiseDao")
    private PraiseDao praiseDao;

    public Integer savePraise(Praise praise) {

        try {
            praiseDao.save(praise);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return BaseInfo.SUCCESS;
    }

    public Integer addOnePraise(AddOne addOne) {

        try {
            Praise praise = praiseDao.findOne(addOne.getAddId());

            if(praise == null) {
                return BaseInfo.FAIL;
            }

            praise.setPraiseNum(addOne.getPraiseNum());
            praise.setUpdateTime(new Date());
            praiseDao.save(praise);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return BaseInfo.SUCCESS;
    }
}
