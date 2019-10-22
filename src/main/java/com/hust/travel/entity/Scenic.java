package com.hust.travel.entity;

import java.math.BigDecimal;
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
public class Scenic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 景点编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 景点名
     */
    private String name;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 视频路径
     */
    private String videoPath;

    /**
     * 地址
     */
    private String address;

    /**
     * 票价
     */
    private BigDecimal ticket;

    /**
     * 折扣：(全票)1.0,(学生)0.75,(儿童)0.5
     */
    private String discount;

    /**
     * 点击量
     */
    private Long population;

    /**
     * 景点状态：1-正常；2-暂停服务；3-其他
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    private String sval;

    private String cid;


}
