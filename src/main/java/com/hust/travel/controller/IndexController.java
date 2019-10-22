package com.hust.travel.controller;

import com.hust.travel.service.ScenicService;
import com.hust.travel.vo.Result;
import com.hust.travel.vo.ResultTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HUST SE1901
 * @since 2019-10-22
 */
@Controller
public class IndexController {

    @Autowired
    ScenicService scenicService;

    @ResponseBody
    @GetMapping("test")
    public Result list() {
        return Result.success(scenicService.list());
    }
}
