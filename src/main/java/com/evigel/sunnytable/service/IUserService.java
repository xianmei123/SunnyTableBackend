package com.evigel.sunnytable.service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author evigel
 * @since 2021-04-28
 */
public interface IUserService {
    long login(String uid);
    void logout(String uid);
}
