package com.vue_shop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (Product)表实体类
 *
 * @author makejava
 * @since 2020-03-27 20:20:20
 */
@SuppressWarnings("serial")
public class Product extends Model<Product> {

    @TableId(type = IdType.AUTO)
    
    private Integer pid;
    
    private String pname;
    
    private Object price;
    
    private String pimg;
    
    private Object pdate;

    private Integer cid;

    private String pdetail;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg;
    }

    public Object getPdate() {
        return pdate;
    }

    public void setPdate(Object pdate) {
        this.pdate = pdate;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getPdetail() {
        return pdetail;
    }

    public void setPdetail(String pdetail) {
        this.pdetail = pdetail;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.pid;
    }
    }