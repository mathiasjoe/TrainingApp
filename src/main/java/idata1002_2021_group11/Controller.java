package idata1002_2021_group11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Thread.sleep;

/**
 * Represents the main menu functionality of the application
 */
public class Controller  {
    public TextArea mainTextBox;

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

    public Controller() {}

    /**
     * Initialize the username and date to the user
     */
    public void initialize()
    {
        // Skal det være sånn eller med pop up vindue som er lagt til i stede?
      mainTextBox.setText("Hello, "+ System.getProperty("user.name") + "\n\n" + "Todays date: " + formatter.format(date));
    }

    /**
     * Switches to the create workout scene
     *
     * @param event the event that happens when the button is pressed
     * @throws IOException the io exception
     */
    @FXML
  public void switchToCreateWorkoutButton(ActionEvent event) throws IOException {
    URL createWorkOut = getClass().getClassLoader()
        .getResource("workouts.fxml");

    assert createWorkOut != null;
    Parent root = FXMLLoader.load(createWorkOut);

    Scene createWorkOutScene = new Scene(root);

    Stage createWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

    root.getStylesheets().add("trainingApp.css");
    createWindow.setScene(createWorkOutScene);
    createWindow.show();
  }

    /**
     * Switches to the Premade workout scene.
     *
     * @param event the event that happens when the button is pressed
     * @throws IOException the io exception
     */
    @FXML
  public void switchToPremadeWorkoutButton(ActionEvent event) throws IOException {

    URL createPremadeWorkout = getClass().getClassLoader().getResource("premadeWorkout.fxml");

    assert createPremadeWorkout != null;
    Parent root = FXMLLoader.load(createPremadeWorkout);

    Scene createPremadeWorkoutScene = new Scene(root);
    Stage createPremadeWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

    root.getStylesheets().add("trainingApp.css");
    createPremadeWindow.setScene(createPremadeWorkoutScene);
    createPremadeWindow.show();
  }

  /**
     * Switches to the calculator scene.
     *
     * @param event the event that happens when the button is pressed
     * @throws IOException the io exception
     */
    @FXML
  public void openCalculatorButton(ActionEvent event) throws IOException {

    URL createCalculator = getClass().getClassLoader().getResource("calculator.fxml");

    assert createCalculator != null;
    Parent root = FXMLLoader.load(createCalculator);

    Scene createCalculatorScene = new Scene(root);
    Stage createCalculatorWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

    root.getStylesheets().add("trainingApp.css");
    createCalculatorWindow.setScene(createCalculatorScene);
    createCalculatorWindow.show();
  }

    /**
     * Function to return to main scene.
     * @param event the event that happens when the button is pressed
     * @throws IOException the io exception
     */
    @FXML public void returnToMainScene(ActionEvent event) throws IOException
  {
    URL createReturnMainMenu = getClass().getClassLoader().getResource("application.fxml");

    assert createReturnMainMenu != null;
    Parent root = FXMLLoader.load(createReturnMainMenu);

    Scene createReturnMainMenuScene = new Scene(root);
    Stage createReturnMainMenuWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

    root.getStylesheets().add("trainingApp.css");
    createReturnMainMenuWindow.setScene(createReturnMainMenuScene);
    createReturnMainMenuWindow.show();

  }
}