import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class Main {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }


    public static void main(String[] args){
        Haut haut = Haut.FELL;
        LandTier hase = new LandTier(12, 20, haut);
        System.out.println(hase.toString());

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
