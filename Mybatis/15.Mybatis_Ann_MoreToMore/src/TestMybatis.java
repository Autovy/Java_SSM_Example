import com.select.mapper.OrderMapper;
import com.select.pojo.Order;
import com.select.pojo.OrderItem;
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

        listOrder(session);

        session.commit();
        session.close();

    }

    // 全表查询（以Order作为分类）
    private static void listOrder(SqlSession session){
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        List<Order> os = mapper.list();

        for(Order o : os){
            System.out.println(o.getCode());
            List<OrderItem> ois = o.getOrderItems();
            for (OrderItem oi : ois){
                System.out.format("\t%s\t%f\t%d%n", oi.getProduct().getName(), oi.getProduct().getPrice(), oi.getNumber());
            }
        }

    }



}
