package com.springboot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @ project  员工角色关联表
 * @ author  clsr
 * @ date  2019/3/24
 */
@Entity
public class User_Role {
    @Id
    private Integer id;
    @Column
    private Integer uId;
    @Column
    private Integer Rid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getRid() {
        return Rid;
    }

    public void setRid(Integer rid) {
        Rid = rid;
    }
}
