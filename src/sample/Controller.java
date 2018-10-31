package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML
	private TextField newTask;
	
	@FXML
	private void addTask(ActionEvent e) {
		System.out.print(newTask.getText());
	}
	
}
