package cn.service;

import cn.dao.MilkPowderDao;
import cn.entity.MilkPowder;
import flexjson.JSONSerializer;

import java.util.List;

/**
 * 业务层
 */
public class MilkPowderService {
    private MilkPowderDao milkPowderDao=new MilkPowderDao();//调用dao层

    /**
     * 调用dao得到所有奶粉对象
     * @return
     */
    public List<MilkPowder> findAllMilkPowder(){
        return milkPowderDao.findAllMilkPowder();
    }
    /**
     * 将数据装车json对象
     */
    public String toJson(List<MilkPowder> milkPowders){//传入的奶粉对象转成Json对象
        //创建json转换器对象
        JSONSerializer serializer=new JSONSerializer();
        //排除class属性
        serializer.exclude("class");
        return serializer.serialize(milkPowders);

    }
}
