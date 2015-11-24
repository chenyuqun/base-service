package com.zizaike.common.service;



import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.zizaike.common.basetest.BaseTest;
import com.zizaike.common.service.impl.HanLPServiceImpl;
import com.zizaike.entity.recommend.Recommend;
import com.zizaike.entity.recommend.vo.CountryArea;
import com.zizaike.entity.recommend.vo.RecommendArea;
import com.zizaike.entity.solr.dto.PlaceDTO;
import com.zizaike.is.common.HanLPService;


/**
 * ClassName:TtopsAdaptTest <br/>
 * Date: 2015年3月5日 下午3:51:51 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.6
 * @see
 */
public class HanLPServiceTest extends BaseTest {
    @Autowired
    HanLPService hanLPService;
    @Test(description = "简体转繁体")
    public void convertToTraditionalChinese()  {
        String str = hanLPService.convertToTraditionalChinese("我是中ttettt: yes国人台湾有我我爱你");
        System.err.println(str);
     /**   RecommendArea recommendArea = new RecommendArea();
        List<Recommend> recommends = new ArrayList<Recommend>();
        List<CountryArea> countryAreas = new ArrayList<CountryArea>();
        for (int i = 0; i < 10; i++) {
            Recommend recommend = new Recommend();
            recommend.setRecommendName("这个是测试数据" + i);
            recommends.add(recommend);
        }
        recommendArea.setRecommends(recommends);
        for (int j = 0; j < 10; j++) {
            DestConfig country = new DestConfig();
            country.setDestName("我是台湾国家"+j);
            List<Loctype> loctypes = new ArrayList<Loctype>();
            for (int i = 0; i < 20; i++) {
                CountryArea countryArea = new CountryArea();
                countryArea.setCountry(country);
                Loctype loctype = new Loctype();
                loctype.setTypeName("高雄我是高雄市"+i);
                loctypes.add(loctype);
                countryArea.setAreaList(loctypes);
                countryAreas.add(countryArea);
            }
        }
        recommendArea.setCountryAreas(countryAreas);

        HanLPServiceImpl service = new HanLPServiceImpl();
        System.err.println("before====" + recommendArea);
        System.err.println("after====" + service.translate(recommendArea)); **/
//      public void translate(Object obj) throws Exception {
//      if (obj == null) {
//          return;
//      }
//      Class<? extends Object> clazz = obj.getClass();// 类
//      System.err.println("clazz.getSuperclass()>>>>>>>>>:" + clazz.getSuperclass());
//      if (clazz.getSuperclass().equals(AbstractList.class)) {// list的处理
//          List list = (List) obj;
//          for (Object object : list) {
//              translate(object);
//          }
//      }
//      for (Field field : clazz.getDeclaredFields()) {
//          field.setAccessible(true);
//          if (field.getType().equals(List.class)) {
//              translate(field.get(obj));
//          }
//          Object val = field.get(obj);
//          if (field.getAnnotation(Translate.class) != null && field.getType() == String.class) {
//              System.out.println("name:" + field.getName() + "\t value = " + val + "\t annotation:"
//                      + field.getAnnotation(Translate.class));
//              field.set(obj, HanLP.convertToTraditionalChinese((String) val));
//          } else if (field.getType().getName().startsWith("com.zizaike")) {
//              translate(val);// 递归遍历所有的数据
//          }
//      }
//      System.err.println(obj);
//  }
    }
    @Test(description = "繁体转简体")
    public void convertToSimplifiedChinese()  {
        String str = hanLPService.convertToSimplifiedChinese("「以後等妳當上皇后，就能買士多啤梨慶祝了」");
        System.err.println(str);
    }
  
}
