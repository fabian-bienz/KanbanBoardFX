package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Controller {
	
	@FXML
	private TextField newTask;
	
	@FXML
	private VBox tbd;
	
	@FXML
	private VBox inProgress;
	
	@FXML
	private VBox done;
	
	@FXML
	private void addTask(ActionEvent e) {
		System.out.print(newTask.getText());
		TextField task = new TextField(newTask.getText());
		task.setEditable(false);
		task.setOnMouseClicked(event -> {
			tbd.getChildren().remove(task);
			inProgress.getChildren().add(task);
			newEvent1(task);
		});
		tbd.getChildren().addAll(task);
	}
	
	private void newEvent1(TextField task) {
		task.setOnMouseClicked(event -> {
			inProgress.getChildren().remove(task);
			done.getChildren().add(task);
			newEvent2(task);
		});
	}
	
	private void newEvent2(TextField task) {
		task.setOnMouseClicked(event -> {
			done.getChildren().remove(task);
		});
	}
}
