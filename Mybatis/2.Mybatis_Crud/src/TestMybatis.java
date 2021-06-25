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
    public static void list(SqlSession session){
        // 通过selectList方法调用listCategory sql语句
        List<Category> cs = session.selectList("list");
        for(Category c : cs ){
            System.out.println(c.getName());
        }
    }


    // 增加
    public static void add(SqlSession session, String name){

        Category c = new Category();
        c.setName(name);
        session.insert("add", c);

    }

    // 删除
    public static void del(SqlSession session, int id){
        Category c = new Category();
        c.setId(id);
        session.delete("del", c);
    }

    // 获取
    public  static  void get(SqlSession session, int id){
        Category c = session.selectOne("getone", id);
        System.out.println(c.getName());
    }

    // 更新
    public static void update(SqlSession session, int id, String name){
        Category c = session.selectOne("getone", id);
        c.setName(name);
        session.update("update", c);
    }

    public static void main(String[] args) throws IOException {

        // 读取mybatis配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 从sqlSessionFactory中得到session
        SqlSession session = sqlSessionFactory.openSession();

        update(session, 1, "cate1");

        list(session);

        session.commit();
        session.close();

    }



}
