import javafx.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class FormMain {

	
	public static GridPane  displayForm()
	{
		
		//GridPane
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));  //pixel of the gridPane
		grid.setVgap(8);  //space between column
		grid.setHgap(10); // //space between row
		
		//name label
		Label nameLabel = new Label("Username :");
		GridPane.setConstraints(nameLabel, 0, 0 );   //set the name label on the gridPane
		
		//password
		Label passLabel = new Label("Password :");
		GridPane.setConstraints(passLabel, 0, 1 );  
		
	
		//input
		TextField nameInput = new TextField("Your default name");
		GridPane.setConstraints(nameInput, 1, 0 );  
		
		PasswordField passInput = new PasswordField();
		passInput.setPromptText("Password"); 				//only for password hide the text
		GridPane.setConstraints(passInput, 1, 1 );

		Button buttonLog = new Button();
		buttonLog.setText( "Log In");
		GridPane.setConstraints(buttonLog, 1, 2);
		
		//set GridPane on the scene
		grid.getChildren().addAll(nameLabel,passLabel,nameInput,passInput,buttonLog);
		
		return grid;
	}
}
