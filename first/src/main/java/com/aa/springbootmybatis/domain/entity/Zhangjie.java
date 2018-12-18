package com.aa.springbootmybatis.domain.entity;

import java.util.Date;
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
public class Zhangjie implements Serializable {

    private static final long serialVersionUID = 1L;

    private String zzId;
    private String title;
    private Double size;
    private String duration;
    @TableField("downPath")
    private String downPath;
    @TableField("uploadDate")
    private Date uploadDate;
    private Integer zjId;


    public String getZzId() {
        return zzId;
    }

    public void setZzId(String zzId) {
        this.zzId = zzId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDownPath() {
        return downPath;
    }

    public void setDownPath(String downPath) {
        this.downPath = downPath;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Integer getZjId() {
        return zjId;
    }

    public void setZjId(Integer zjId) {
        this.zjId = zjId;
    }

    @Override
    public String toString() {
        return "Zhangjie{" +
        ", zzId=" + zzId +
        ", title=" + title +
        ", size=" + size +
        ", duration=" + duration +
        ", downPath=" + downPath +
        ", uploadDate=" + uploadDate +
        ", zjId=" + zjId +
        "}";
    }
}
