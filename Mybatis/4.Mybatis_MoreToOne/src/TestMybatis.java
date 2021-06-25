import com.select.pojo.Category;
import com.select.pojo.Product;
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

    public static void main(String[] args) throws IOException {

        // 读取mybatis配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 从sqlSessionFactory中得到session
        SqlSession session = sqlSessionFactory.openSession();

        Product p1 = session.selectOne("getProduct", 5);
        Category c1 = p1.getCategory();
        c1.setId(1);

        session.update("updatep", p1);


//        List<Product> ps = session.selectList("listProduct");
//        for (Product p : ps) {
//			System.out.println(p+" 对应的分类是 \t "+ p.getCategory());
//		}


        session.commit();
        session.close();


    }

}
