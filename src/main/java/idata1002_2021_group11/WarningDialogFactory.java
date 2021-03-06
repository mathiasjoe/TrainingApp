package idata1002_2021_group11;

import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;

/**
 * Is responsible for creating various warning dialogs to user.
 */
public class WarningDialogFactory {
    private static WarningDialogFactory instance;

    /**
     * Creates an instance of the WarningDialogFactory class. The reason the constructor is private is to follow the
     * singleton pattern.
     */
    private WarningDialogFactory() {
    }

    /**
     * Returns the instance of the WarningDialogFactory, the instance will only be set once (singleton pattern).
     *
     * @return the instance of the WarningDialogFactory.
     */
    public static WarningDialogFactory getInstance() {
        if (instance == null) {
            instance = new WarningDialogFactory();
        }
        return instance;
    }

    /**
     * Creates a dialog warning the user that input fields cannot be empty, and the inputs have to be numeric.
     *
     * @return a dialog warning the user that input fields cannot be empty, and the inputs have to be numeric.
     */
    public Alert createCalculatorEmptyFieldsDialog() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText("Insufficient input");
        alert.setContentText("Input fields can not be empty.\nThey also have to be numeric.");

        //Styling
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add("trainingApp.css");
        dialogPane.getStyleClass().add("customDialog");
        return alert;
    }

    /**
     * Creates a dialog warning the user that inputs cannot be negative, and specifically the repetitions
     * input cannot be 0 either.
     *
     * @return a dialog warning the user that inputs cannot be negative.
     */
    public Alert createCalculatorInvalidInputDialog() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText("Insufficient input");
        alert.setContentText("Inputs cannot be negative, repetitions cannot be 0 either.");

        //Styling
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add("trainingApp.css");
        dialogPane.getStyleClass().add("customDialog");
        return alert;
    }

    /**
     * Creates a dialog warning the user that input fields cannot be empty, and the inputs have to be numeric.
     *
     * @return a dialog warning the user that input fields cannot be empty, and the inputs have to be numeric.
     */
    public Alert createWorkoutsInvalidInputDialog() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText("Insufficient input");
        alert.setContentText("All input fields must be filled.");

        //Styling
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add("trainingApp.css");;
        dialogPane.getStyleClass().add("customDialog");
        return alert;
    }

    /**
     * Creates a dialog warning the user that an exercise needs to be selected before deleting.
     *
     * @return a dialog warning the user that an exercise needs to be selected before deleting.
     */
    public Alert createWorkoutNotSelectedDialog() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText("No values selected");
        alert.setContentText("You need to select an item from the list before deleting.");
        //Styling
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add("trainingApp.css");;
        dialogPane.getStyleClass().add("customDialog");
        return alert;
    }
}
