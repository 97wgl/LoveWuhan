package com.hust.travel.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hust.travel.entity.Picture;
import com.hust.travel.service.PictureService;
import com.hust.travel.service.ScenicService;
import com.hust.travel.vo.Result;
import com.hust.travel.vo.ResultTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    PictureService pictureService;

    @Autowired
    ScenicService scenicService;

    @ResponseBody
    @GetMapping("list")
    public Result list(@RequestParam("sid") Integer sid) {
        if (sid == null) {
            return Result.error(ResultTypeEnum.PARAM_ERROR);
        }
        QueryWrapper<Picture> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("scenic_id", sid);
        List<Picture> pictures = pictureService.list(queryWrapper);
        if (pictures == null || pictures.size() == 0) {
            return Result.error(ResultTypeEnum.NULL_RESULT);
        }
        return Result.success(pictures);
    }

    @ResponseBody
    @GetMapping("slideShow")
    public Result slideShow() {
        List<Picture> pictures = scenicService.getSlideShowPictures();
        return Result.success(pictures);
    }
}
