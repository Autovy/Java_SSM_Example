import com.select.pojo.Product;
import com.sun.org.apache.xpath.internal.operations.Or;
import javafx.beans.binding.ObjectExpression;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMybatis {

    public static void main(String[] args) throws IOException {

        // 读取mybatis配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 从sqlSessionFactory中得到session
        SqlSession session = sqlSessionFactory.openSession();

        System.out.println("查询所有的");
        List<Product> ps = session.selectList("listProduct");
        for(Product p : ps){
            System.out.println(p);
        }

        System.out.println("模糊查询");
        // 以Map实现输入name:a
        Map<String, Object> params = new HashMap<>();
        params.put("name", "a");

        List<Product> ps2 = session.selectList("listProduct",params);
        for (Product p : ps2){
            System.out.println(p);
        }

        session.commit();
        session.close();


    }

}
