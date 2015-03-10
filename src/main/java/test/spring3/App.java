package test.spring3;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
 
@Component // Spring�R���e�i�ɊǗ��Ώۂł��邱�Ƃ𖾎�
public class App {
 
    @Autowired // Spring�R���e�i���uTestService�v�������ݒ肷�邱�Ƃ𖾎��iprivate�ł��\�j
    private TestService service = null;
 
    public void execService(){
        service.exec();
    }
 
    public static void main( String[] args ){
 
        // Spring�R���e�i�擾
        ApplicationContext appContext =
                //new ClassPathXmlApplicationContext("classpath:./META-INF/spring/app-context.xml");
        		new ClassPathXmlApplicationContext("app-context.xml");
        // Spring�R���e�i����App�N���X�̃I�u�W�F�N�g���擾
        App app = appContext.getBean(App.class);
        // app�����s
        app.execService();
    }
}