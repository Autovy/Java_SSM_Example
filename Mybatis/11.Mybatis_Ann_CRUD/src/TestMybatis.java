import com.select.mapper.CategoryMapper;
import com.select.pojo.Category;
import com.select.pojo.Product;
import javafx.scene.chart.CategoryAxis;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import sun.misc.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class TestMybatis {

    // 列出数据库name字段
    public static void list(CategoryMapper mapper){
        // 通过selectList方法调用listCategory sql语句
        List<Category> cs = mapper.list();
        for(Category c : cs ){
            System.out.println(c.getName());
        }
    }


    // 增加
    public static void add(CategoryMapper mapper, String name){

        Category c = new Category();
        c.setName(name);
        mapper.add(c);

    }

    // 删除
    public static void del(CategoryMapper mapper, int id){
        mapper.delete(id);
    }

    // 获取
    public  static  void get(CategoryMapper mapper, int id){
        Category c = mapper.get(id);
        System.out.println(c.getName());
    }

    // 更新
    public static void update(CategoryMapper mapper, int id, String name){
        Category c = mapper.get(id);
        c.setName(name);
        mapper.update(c);
    }

    public static void main(String[] args) throws IOException {

        // 读取mybatis配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 从sqlSessionFactory中得到session
        SqlSession session = sqlSessionFactory.openSession();
        // 获得mapper类，通过mapper类获得对应的sql方法
        CategoryMapper mapper = session.getMapper(CategoryMapper.class);

        update(mapper, 1, "cate1");
        add(mapper, "cate3");

        list(mapper);

        session.commit();
        session.close();

    }



}
