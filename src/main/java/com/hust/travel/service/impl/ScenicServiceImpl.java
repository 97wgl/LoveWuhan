package com.hust.travel.service.impl;

import com.hust.travel.entity.Picture;
import com.hust.travel.entity.Scenic;
import com.hust.travel.mapper.ScenicMapper;
import com.hust.travel.service.ScenicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HUST SE1901
 * @since 2019-10-22
 */
@Service
public class ScenicServiceImpl extends ServiceImpl<ScenicMapper, Scenic> implements ScenicService {

    @Override
    public List<Picture> getSlideShowPictures() {
        return this.baseMapper.getSlideShowPictures();
    }
}
