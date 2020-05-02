package com.itheima.dao;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;

import java.util.List;

/**
 * Created by 17478 on 2020/5/1.
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();

    /**
     * 保存用户
     */
    void saveUser(User user);
    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);
    /**
     * 根据Id删除用户
     * @param userId
     */
    void deleteUser(Integer userId);

    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 根据名称模糊查询用户信息
     * @param username
     * @return
     */
    List<User> findByName(String username);

    /**
     * 查询总用户数
     * @return
     */
    int findTotal();

    /**
     * 根据queryVo中的条件查询用户
     * @param vo
     * @return
     */
    List<User> findUserByVo(QueryVo vo);

    /**
     * 根据传入参数条件查询
     * @param user
     * @return
     */
    List<User> findUserByCondition(User user);

    /**
     * 根据QueryVo查询
     * @return
     */
    List<User> findUserInIds(QueryVo queryVo);
}
