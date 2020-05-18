package com.benny.traveladvisor.service;

/**
 * Description: Session Service for Redis Cache
 * @author benny.li
 * Date: 2020/5/12
 */
public interface SessionService {

    String setSession();

    String getSession();

    void delSession();
}
