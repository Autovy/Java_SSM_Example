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


        Map<String, Object> params = new HashMap<>();
        //    params.put("name","a");
        //    params.put("price","10");

        List<Product> ps2 = session.selectList("listProduct",params);
        for (Product p : ps2){
            System.out.println(p);
        }

        session.commit();
        session.close();


    }

}
