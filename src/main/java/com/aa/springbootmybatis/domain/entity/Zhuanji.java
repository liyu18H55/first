package domain.entity;

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
public class Zhuanji implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "zj_id", type = IdType.AUTO)
    private Integer zjId;
    private String title;
    @TableField("coverImg")
    private String coverImg;
    private Integer count;
    private String score;
    private String author;
    @TableField("broadCast")
    private String broadCast;
    private String brief;
    @TableField("publishDate")
    private Date publishDate;


    public Integer getZjId() {
        return zjId;
    }

    public void setZjId(Integer zjId) {
        this.zjId = zjId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBroadCast() {
        return broadCast;
    }

    public void setBroadCast(String broadCast) {
        this.broadCast = broadCast;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Zhuanji{" +
        ", zjId=" + zjId +
        ", title=" + title +
        ", coverImg=" + coverImg +
        ", count=" + count +
        ", score=" + score +
        ", author=" + author +
        ", broadCast=" + broadCast +
        ", brief=" + brief +
        ", publishDate=" + publishDate +
        "}";
    }
}
