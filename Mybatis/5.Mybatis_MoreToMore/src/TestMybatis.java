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

        deleteOrderItem(session);
        listOrder(session);

        session.commit();
        session.close();

    }

    // 全表查询（以Order作为分类）
    private static void listOrder(SqlSession session){
        List<Order> os = session.selectList("listOrder");

        for(Order o : os){
            System.out.println(o.getCode());
            List<OrderItem> ois = o.getOrderItems();
            for (OrderItem oi : ois){
                System.out.format("\t%s\t%f\t%d%n", oi.getProduct().getName(), oi.getProduct().getPrice(), oi.getNumber());
            }
        }

    }

    // 建立关系
    private static void adddOrderItem(SqlSession session){

        Order o1 = session.selectOne("getOrder", 1);
        Product p6 = session.selectOne("getProduct", 6);

        OrderItem oi = new OrderItem();
        oi.setProduct(p6);
        oi.setOrder(o1);
        oi.setNumber(200);

        session.insert("addOrderItem", oi);

    }

    // 删除关系
    private static void deleteOrderItem(SqlSession session){

        Order o1 = session.selectOne("getOrder", 1);
        Product p6 = session.selectOne("getProduct", 6);

        OrderItem oi = new OrderItem();
        oi.setProduct(p6);
        oi.setOrder(o1);

        session.delete("deleteOrderItem", oi);

    }

    // 删除菜单
    private static void deleteOrder(SqlSession session) {
        int id = 1;

        session.delete("deleteOrder",id);

    }

}
