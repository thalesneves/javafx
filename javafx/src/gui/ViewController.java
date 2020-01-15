package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label txtResult;
	
	@FXML
	private Button btnSum;
	
	@FXML
	public void onBtnSumAction() {
		Alerts.showAlert("Sum Calculator", "Sum", "Sucess!", AlertType.INFORMATION);
		
		Integer soma = Integer.parseInt(txtNumber1.getText()) + Integer.parseInt(txtNumber2.getText());
		txtResult.setText(soma.toString());
	}
	
}
