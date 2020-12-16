package cn.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

/**
 * 数据源工具类
 */
public class DataSourceUtils {
    //创建一个连接池 连接数据库
    private static ComboPooledDataSource ds=new ComboPooledDataSource();

    /**
     * 得到数据源
     */
    public static DataSource getDataSource(){
        return ds;
    }
}
