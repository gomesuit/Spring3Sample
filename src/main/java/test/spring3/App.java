package test.spring3;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
 
@Component // Springコンテナに管理対象であることを明示
public class App {
 
    @Autowired // Springコンテナが「TestService」を自動設定することを明示（privateでも可能）
    private TestService service = null;
 
    public void execService(){
        service.exec();
    }
 
    public static void main( String[] args ){
 
        // Springコンテナ取得
        ApplicationContext appContext =
                //new ClassPathXmlApplicationContext("classpath:./META-INF/spring/app-context.xml");
        		new ClassPathXmlApplicationContext("app-context.xml");
        // SpringコンテナからAppクラスのオブジェクトを取得
        App app = appContext.getBean(App.class);
        // appを実行
        app.execService();
    }
}