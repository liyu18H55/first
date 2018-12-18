package com.aa.springbootmybatis.domain.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 3072 kB
 * </p>
 *
 * @author liyu
 * @since 2018-12-17
 */
public class Carousel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "carouselidk", type = IdType.AUTO)
    private Integer carouselidk;
    private String title;
    @TableField("imgPath")
    private String imgPath;
    private String desc;
    private String status;
    private Date date;


    public Integer getCarouselidk() {
        return carouselidk;
    }

    public void setCarouselidk(Integer carouselidk) {
        this.carouselidk = carouselidk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Carousel{" +
        ", carouselidk=" + carouselidk +
        ", title=" + title +
        ", imgPath=" + imgPath +
        ", desc=" + desc +
        ", status=" + status +
        ", date=" + date +
        "}";
    }
}
