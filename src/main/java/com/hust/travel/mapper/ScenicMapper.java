package com.hust.travel.mapper;

import com.hust.travel.entity.Picture;
import com.hust.travel.entity.Scenic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author HUST SE1901
 * @since 2019-10-22
 */
public interface ScenicMapper extends BaseMapper<Scenic> {

    @Select("SELECT * FROM view_top5_scenic_pic a WHERE a.id IN (SELECT min(id) FROM view_top5_scenic_pic b WHERE a.scenic_id = b.scenic_id)")
    List<Picture> getSlideShowPictures();
}
