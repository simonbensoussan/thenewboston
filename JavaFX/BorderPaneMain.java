import javafx.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class BorderPaneMain {

	public static  BorderPane  displayBorderPane() {
		/*to create a basic software with top/bottom/left/right menu */
		
		//horizontal layout on the top
		HBox topMenu = new HBox();
		Button buttonA = new Button("File");
		Button buttonB = new Button("Edit");
		Button buttonC = new Button("Source");
		topMenu.getChildren().addAll(buttonA,buttonB,buttonC);
		
		//vertical layout on the left
		VBox leftMenu = new VBox();
		Button buttonD = new Button("File");
		Button buttonE = new Button("Edit");
		Button buttonF = new Button("Source");
		leftMenu.getChildren().addAll(buttonD,buttonE,buttonF);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);

		return borderPane;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
