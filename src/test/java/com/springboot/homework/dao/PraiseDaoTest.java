package com.springboot.homework.dao;

import com.springboot.homework.entity.Praise;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PraiseDaoTest {

    @Resource(name = "praiseDao")
    private PraiseDao praiseDao;

    @Test
    public void saveTest() {
        Praise praise = new Praise("志佳", 0, new Date(), new Date());
        Praise result = praiseDao.save(praise);
        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null, result);
    }

}