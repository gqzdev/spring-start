import com.gqzdev.bean.User;
import com.gqzdev.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description
 * @Author ganquanzhong
 * @Date2020/1/3 0:20
 * @Version
 **/
public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
        User user = (User)ac.getBean("user");
        System.out.println(user.toString());

    }
}
