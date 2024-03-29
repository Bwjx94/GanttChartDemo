package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.flexganttfx.view.GanttChart;

//Copied from the user manual
public class MyFirstGanttChart extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		// <- Our Gantt chart
		GanttChart<?> gantt = new GanttChart<>();
		Scene scene = new Scene(gantt);
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}