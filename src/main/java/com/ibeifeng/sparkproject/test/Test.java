package com.ibeifeng.sparkproject.test;

import com.ibeifeng.sparkproject.conf.ConfigurationManager;
import com.ibeifeng.sparkproject.constant.Constants;

/**
 * @Author : xy
 * @Class :
 * @Date: Created in 2020/10/4 11:50
 **/
public class Test {

    public static void main(String[] args) {
        int datasourceSize = ConfigurationManager.getInteger(
                Constants.JDBC_DATASOURCE_SIZE);
        System.out.println(datasourceSize);
    }
}
