import com.atzj.selfSpringIoc.Course;
import com.atzj.selfSpringIoc.IocExample;
import com.atzj.selfSpringIoc.Student;
import org.junit.Test;

/**
 * 类描述：
 *
 * @author zhoujing129
 */
public class SelfSpringIocTest {
    @Test
    public void getBean() throws Exception{
        String location = IocExample.class.getClassLoader().getResource("selfIoc.xml").getFile();
        IocExample ie = new IocExample(location);
        Course course = (Course) ie.getBean("course");
        System.out.println(course);
        Student student = (Student) ie.getBean("student");
        System.out.println(student);
    }
}
