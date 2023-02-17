package nhom7.trannhatminhdat2;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
<<<<<<< HEAD
        int a = 10;
        if( a > 0)
=======
        int a = 7;
        if( a < 7 && a % 2 == 0)
>>>>>>> main
            App.setRoot("secondary");
    }
}
