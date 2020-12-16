package cn.service;

import cn.dao.BrowserDao;
import cn.entity.Browser;
import flexjson.JSONSerializer;

import java.util.List;

public class BrowserService {

    //调用dao层
    private static BrowserDao browserDao=new BrowserDao();
    /**
     * 调用dao得到所有浏览器对象
     * @return
     */
    public List<Browser> findAllBrowser(){
        return browserDao.findAllBrowser();
    }
    /**
     * 将数据装车json对象
     */
    public String toJson(List<Browser> browsers){//传入的浏览器对象转成Json对象
        //创建json转换器对象
        JSONSerializer serializer=new JSONSerializer();
        //排除class属性
        serializer.exclude("class");
        return serializer.serialize(browsers);

    }


}
