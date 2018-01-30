package com.springboot.homework.util;

import com.springboot.homework.controller.response.BaseResponse;

public class BaseInfo {

    public static final Integer SUCCESS = 1;
    public static final Integer FAIL = 0;

    public static BaseResponse getResponse(Integer result) {
        BaseResponse response = new BaseResponse();
        if(result == 1) {
            response.setCode(BaseInfo.SUCCESS);
            response.setMsg("成功");
        } else {
            response.setCode(BaseInfo.FAIL);
            response.setMsg("失败");
        }

        return response;
    }

}
