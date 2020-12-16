package cn.dao;

import cn.entity.Climate;
import cn.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ClimateDao {
    /**
     * 查询所有记录
     */
    //通过工具类得到数据源对象，传递给Querrunner对象
    private QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());

    /**
     * 查询所有城市温度
     * @return
     */
    public List<Climate> findAllClimate(){
        try {
            return runner.query("select * from climate",new BeanListHandler<>(Climate.class));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
