package com.yupi.yuaicodemother.service;

import cn.hutool.http.server.HttpServerRequest;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.yupi.yuaicodemother.entity.User;
import com.yupi.yuaicodemother.model.dto.user.UserQueryRequest;
import com.yupi.yuaicodemother.model.vo.LoginUserVO;
import com.yupi.yuaicodemother.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * 用户 服务层。
 *
 * @author cui
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return
     */
    public long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 加盐加密
     * @param userPassword
     * @return
     */
    public String getEncryptPassword(String userPassword);

    /**
     * 数据脱敏
     * @param user
     * @return
     */
    public LoginUserVO getLoginUserVO(User user);

    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @param httpServletRequest
     * @return
     */
    public LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest httpServletRequest);

    /**
     * 从 HttpServletRequest 获取当前用户
     * @param request
     * @return
     */
    public User getLoginUser(HttpServletRequest request);

    /**
     * 用户登出
     * @param request
     * @return
     */
    public boolean userLogout(HttpServletRequest request);

    /**
     * 根据 User 获取 UserVO
     * @param user
     * @return
     */
    public UserVO getUserVO(User user);

    /**
     * 根据 UserList 获取 UserVOList 列表
     * @param userList
     * @return
     */
    public List<UserVO> getUserVOList(List<User> userList);

    /**
     * 获取 QueryWrapper
     * @param userQueryRequest
     * @return
     */
    public QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);
}
