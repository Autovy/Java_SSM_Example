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

        // 通过selectList方法调用listCategory sql语句
        List<Category> cs = session.selectList("list");
        for(Category c : cs ){
            System.out.println(c);
            List<Product> ps = c.getProducts();
            for (Product p: ps){
                System.out.println("\t" + p.tostring());
            }
        }

        session.commit();
        session.close();


    }

}
