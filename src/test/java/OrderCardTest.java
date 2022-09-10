import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderCardTest {


        @Test
        public void FormForOrder () {
            Configuration.holdBrowserOpen = true;
            open("http://localhost:9999/");
            $("[name='name'").setValue("Дивов Дмитрий");
            $("[name='phone'").setValue("+79777777775");
            $("[role='presentation']").click();
            $(byText("Продолжить")).click();
            $("[data-test-id='order-success']").shouldHave(Condition.exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));


    }
}
