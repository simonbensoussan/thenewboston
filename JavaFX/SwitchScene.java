import com.sun.xml.internal.ws.org.objectweb.asm.Label;

import javafx.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class SwitchScene extends Application {
	
	Stage window;
	Scene scene1,scene2;
	Button btn_switch,btn_switch2;
	Label label;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		
	
		
		btn_switch = new Button();
		btn_switch.setText("Switch with me !!!");
		
		btn_switch.setOnAction(e -> window.setScene(scene2));
		

		//layout 1 - children() column on the right of the window
		//vBox => put element in column
		StackPane layout1 = new StackPane();
		layout1.getChildren().add(btn_switch);
		
		scene1 = new Scene(layout1,250,300);
		
		//Scene2
		btn_switch2 = new Button();
		btn_switch2.setText( "come back");
		
		btn_switch2.setOnAction(e->window.setScene(scene1));
		
		//layou2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(btn_switch2);
		
		scene2 = new Scene(layout2,550,370);
		
		window.setTitle( "Switch me");
		window.setScene(scene1);
		window.show();
	}

}
