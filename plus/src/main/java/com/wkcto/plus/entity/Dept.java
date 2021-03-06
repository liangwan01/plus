package com.wkcto.plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * 使用AR,要求实体类需要继承MP中的Model
 * Model中提供了对数据库的CRUD的操作
 */
public class Dept extends Model<Dept> {
    //定义属性， 属性名和表的列名一样

    //uuid
    @TableId(value = "id",type = IdType.UUID)
    private String id;
    private String name;
    private String mobile;
    private Integer manager;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }
}
