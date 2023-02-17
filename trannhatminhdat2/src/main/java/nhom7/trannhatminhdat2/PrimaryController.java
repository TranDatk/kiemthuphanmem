package nhom7.trannhatminhdat2;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = 7;
        if( a < 7 && a % 2 == 0)
            App.setRoot("secondary");
    }
}
