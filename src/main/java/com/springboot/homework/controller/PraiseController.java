package com.springboot.homework.controller;

import com.springboot.homework.controller.request.AddOne;
import com.springboot.homework.controller.response.BaseResponse;
import com.springboot.homework.controller.response.PraiseResponse;
import com.springboot.homework.entity.Praise;
import com.springboot.homework.service.PraiseService;
import com.springboot.homework.util.BaseInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/praise")
public class PraiseController {

    @Resource(name = "praiseService")
    private PraiseService praiseService;

    @RequestMapping(value = "/savePraise", method = RequestMethod.POST)
    public BaseResponse savePraise(@RequestBody Praise praise) {

        Integer result;
        BaseResponse response = new BaseResponse();

        result = praiseService.savePraise(praise);

        return BaseInfo.getResponse(result);
    }

    @RequestMapping(value = "/addOnePraise", method = RequestMethod.POST)
    public BaseResponse addOnePraise(@RequestBody AddOne addOne) {

        Integer result;
        BaseResponse response = new BaseResponse();

        result = praiseService.addOnePraise(addOne);

        return BaseInfo.getResponse(result);
    }
}
