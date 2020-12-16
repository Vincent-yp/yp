package cn.service;

import cn.dao.ClimateDao;
import cn.entity.Climate;
import flexjson.JSONSerializer;

import java.util.List;

public class ClimateService {
    //调用dao层
    private static ClimateDao climateDao=new ClimateDao();

    /**
     * 调用dao得到所有城市对象
     * @return
     */
   public List<Climate> findAllClimate (){
        return climateDao.findAllClimate();
    }

    /**
     * 将数据封装son对象
     */
    public String toJson(List<Climate> climates){//传入的浏览器对象转成Json对象
        //创建json转换器对象
        JSONSerializer serializer=new JSONSerializer();
        //排除class属性
        serializer.exclude("class");
        return serializer.serialize(climates);

    }
}
