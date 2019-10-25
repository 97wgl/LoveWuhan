package com.hust.travel.service;

import com.hust.travel.entity.Picture;
import com.hust.travel.entity.Scenic;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HUST SE1901
 * @since 2019-10-22
 */
public interface ScenicService extends IService<Scenic> {

    List<Picture> getSlideShowPictures();
}
