package carracing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputViewTest {

    @Test
    @DisplayName("숫자포멧에러")
    void valid() {
        assertThatThrownBy(() -> {
            new InputView("오", "육");
        }).isInstanceOf(NumberFormatException.class);
    }

    @Test
    @DisplayName("자동차 split 에러")
    void split() {
        InputView inputView = new InputView("car1,car2", "1");
        Assertions.assertThat(inputView.getCarList().size()).isEqualTo(2);
    }
}
