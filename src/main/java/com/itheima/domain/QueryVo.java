package com.itheima.domain;

import java.util.List;

/**
 * Created by 17478 on 2020/5/1.
 */
public class QueryVo {

    private User user;
    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
