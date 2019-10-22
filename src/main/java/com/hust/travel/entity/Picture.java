package com.hust.travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author HUST SE1901
 * @since 2019-10-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Picture implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 景点编号
     */
    private Integer scenicId;

    /**
     * 图片访问路径
     */
    private String path;

    /**
     * 备注
     */
    private String remark;


}
