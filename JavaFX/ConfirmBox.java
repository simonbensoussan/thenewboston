import javafx.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

	static boolean answer;
	
	public static boolean display(String tittle, String message)
	{
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(tittle);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
		
		Button yesButton = new Button("Yes");
		yesButton.setOnAction(e->{
			answer = true;
			window.close();
		});
		Button noButton = new Button("No");
		noButton.setOnAction(e->{
			answer = false;
			window.close();
		});
		
	//layout
		VBox layout = new VBox(20);
		layout.getChildren().addAll(label,yesButton,noButton);
		layout.setAlignment(Pos.CENTER);
		
		//scene
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		return answer;	
	}

	
	
	
	
}
