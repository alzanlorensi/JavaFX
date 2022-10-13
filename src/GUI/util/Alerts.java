package GUI.util;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {
    public static void ShowAlert(String title, String heading, String content, AlertType type){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(heading);
        alert.setContentText(content);
        alert.show();
    }
}
