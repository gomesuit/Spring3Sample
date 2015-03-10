package test.spring3;
 
import org.springframework.stereotype.Component;
 
@Component // Springコンテナに管理対象であることを明示
public class TestService {
 
    public void exec(){
        System.out.println("exec()が実行されました。");
    }
}