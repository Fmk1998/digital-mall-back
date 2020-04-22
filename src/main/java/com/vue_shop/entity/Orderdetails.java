package com.vue_shop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (Orderdetails)表实体类
 *
 * @author makejava
 * @since 2020-04-20 10:52:44
 */
@SuppressWarnings("serial")
public class Orderdetails extends Model<Orderdetails> {
    
    private String odid;
    
    private Integer uid;

    private Integer totalprice;
    
    private String place;
    
    private String phone;
    
    private String time;
    
    private Integer oded;


    public String getOdid() {
        return odid;
    }

    public void setOdid(String odid) {
        this.odid = odid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getOded() {
        return oded;
    }

    public void setOded(Integer oded) {
        this.oded = oded;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.odid;
    }
    }