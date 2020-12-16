package cn.test;

import cn.dao.BrowserDao;
import cn.dao.ClimateDao;
import cn.dao.MilkPowderDao;
import cn.entity.Browser;
import cn.entity.Climate;
import cn.entity.MilkPowder;
import cn.service.BrowserService;
import cn.service.ClimateService;
import cn.service.MilkPowderService;
import cn.utils.DataSourceUtils;
import org.junit.Test;

import javax.sql.DataSource;
import java.util.List;

public class TestDao {
    MilkPowderDao milkPowderDao=new MilkPowderDao();
    MilkPowderService milkPowderService=new MilkPowderService();

    BrowserDao browserDao=new BrowserDao();
    BrowserService browserService=new BrowserService();

    ClimateDao climateDao=new ClimateDao();
    ClimateService climateService=new ClimateService();
    @Test
    public void testGetSource(){
        DataSource ds= DataSourceUtils.getDataSource();
        System.out.println(ds);
    }
    @Test
    public void testFindMilkPowder(){
        List<MilkPowder> milkPowders=milkPowderDao.findAllMilkPowder();
        for (MilkPowder milkPowder:milkPowders){
            System.out.println(milkPowder);
        }
    }

    @Test
    public void testToJson(){
        List<MilkPowder> milkPowders=milkPowderDao.findAllMilkPowder();
        String toJson = milkPowderService.toJson(milkPowders);
        System.out.println(toJson);
    }
    @Test
    public void testFindBrowser(){
        List<Browser> browsers=browserDao.findAllBrowser();
        for (Browser browser:browsers){
            System.out.println(browser);
        }
    }
    @Test
    public void testToJson2(){
        List<Browser> browsers=browserDao.findAllBrowser();
        String toJson = browserService.toJson(browsers);
        System.out.println(toJson);
    }
    @Test
    public void testFindClimate(){
        List<Climate> climates=climateDao.findAllClimate();
        for (Climate climate:climates){
            System.out.println(climate);
        }
    }
    @Test
    public void testToJson3(){
        List<Climate> climates=climateDao.findAllClimate();
        String toJson = climateService.toJson(climates);
        System.out.println(toJson);
    }
}
