package cn.dao;

import cn.entity.Browser;
import cn.entity.MilkPowder;
import cn.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * 数据访问类
 */
public class MilkPowderDao {
    /**
     * 查询所有记录
     */
    //通过工具类得到数据源对象，传递给Querrunner对象
    private QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());

    /**
     * 查询所有奶粉
     */
    public List<MilkPowder> findAllMilkPowder(){
        try {
            return runner.query("select * from milkPowder",new BeanListHandler<>(MilkPowder.class));//第二个参数指定封装类型
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);//抛出运行异常
        }
    }

}
