package com.ibeifeng.sparkproject.dao.impl;

import com.ibeifeng.sparkproject.dao.ITaskDAO;

/**
 * @Author : xy
 * @Desc : DAO工厂类
 * @Date: Created in 2020/10/4 18:10
 **/
public class DAOFactory {

    public static ITaskDAO getTaskDAO() {
        return new TaskDAOImpl();
    }


}
