import javafx.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class AlertBox  {

	public static void display(String Tittle, String message)
	{
		//create new window
		Stage window = new Stage();
		
	  //block the other window
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(Tittle);
		window.setMinWidth(250);
		window.setMinHeight(50);
		
	//elements on window
	Label label = new Label();
	label.setText(message);
	
	Button closeButton = new Button();
	closeButton.setText( "Close the window");
	closeButton.setOnAction(e->window.close());
	
	//layout
	VBox layout =new VBox(20);
	layout.getChildren().addAll(label,closeButton);
	layout.setAlignment(Pos.CENTER); //align center
	
	//display window and wait to be closed before back to another
	Scene scene = new Scene(layout);
	window.setScene(scene);
	window.showAndWait();  //don't close while y.our you close it

	}

	
}
