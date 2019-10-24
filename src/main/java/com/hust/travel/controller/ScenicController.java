package com.hust.travel.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hust.travel.entity.Scenic;
import com.hust.travel.service.ScenicService;
import com.hust.travel.vo.Result;
import com.hust.travel.vo.ResultTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HUST SE1901
 * @since 2019-10-22
 */
@Controller
@RequestMapping("/scenic")
public class ScenicController {

    @Autowired
    ScenicService scenicService;

    @ResponseBody
    @GetMapping("info")
    public Result info(@RequestParam("id") Integer id) {
        if (id == null) {
            return Result.error(ResultTypeEnum.PARAM_ERROR);
        }
        Scenic scenic = scenicService.getById(id);
        if (scenic == null) {
            return Result.error(ResultTypeEnum.NULL_RESULT);
        }
        return Result.success(scenic);
    }

    @ResponseBody
    @GetMapping("list")
    public Result list(Page<Scenic> page, @RequestParam(value = "sortOrder", defaultValue = "population", required = false) String sortOrder) {
        QueryWrapper<Scenic> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc(sortOrder);
        List<Scenic> scenicList = scenicService.page(page, queryWrapper).getRecords();
        if (scenicList == null || scenicList.size() == 0) {
            return Result.error(ResultTypeEnum.NULL_RESULT);
        }
        return Result.success(scenicList);
    }

}
