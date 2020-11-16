package dad.calculadoraFXML.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.calculadoraFXML.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {
	Model modelo =new Model();
	Calculadora calc= new Calculadora();
	//View
	@FXML
	private GridPane view;
	@FXML
	private TextField textField;
	@FXML
	private Button bSiete,bOcho,bNueve,borrarTodoB,borrarB,bCuatro,bCinco,
				   bSeis,bMultiplicar,bDividir,bMenos,bUno,bDos,bTres,bCero,bSuma,bComa,bIgual;
	public Controller() throws IOException {
		FXMLLoader lector=new FXMLLoader(getClass().getResource("/View.fxml"));
		lector.setController(this);
		lector.load();
	}
	public void initialize(URL location,ResourceBundle resources) {
		
	}
	@FXML
	private void onCeroButtonAction(ActionEvent event) {
		calc.insertar('0');
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onOneButtonAction(ActionEvent event) {
		calc.insertar('1');
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onTwoButtonAction(ActionEvent event) {
		calc.insertar('2');
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onTresButtonAction(ActionEvent event) {
		calc.insertar('3');
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onFourButtonAction(ActionEvent event) {
		calc.insertar('4');
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onFiveButtonAction(ActionEvent event) {
		calc.insertar('5');
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onSixButtonAction(ActionEvent event) {
		calc.insertar('6');
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onSevenButtonAction(ActionEvent event) {
		calc.insertar('7');
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onEightButtonAction(ActionEvent event) {
		calc.insertar('8');
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onNineButtonAction(ActionEvent event) {
		calc.insertar('9');
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onDeleteAllButtonAction(ActionEvent event) {
		calc.borrarTodo();
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onDeleteButtonAction(ActionEvent event) {
		calc.borrar();
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onMultiplicarButtonAction(ActionEvent event) {
		calc.operar(Calculadora.MULTIPLICAR);
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onDividirButtonAction(ActionEvent event) {
		calc.operar(Calculadora.DIVIDIR);
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onRestarButtonAction(ActionEvent event) {
		calc.operar(Calculadora.RESTAR);
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onSumaButtonAction(ActionEvent event) {
		calc.operar(Calculadora.SUMAR);
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onIgualButtonAction(ActionEvent event) {
		calc.operar(Calculadora.IGUAL);
		textField.setText(calc.getPantalla());
	}
	@FXML
	private void onComaButtonAction(ActionEvent event) {
		calc.insertarComa();
		textField.setText(calc.getPantalla());
	}
	public GridPane getView() {
		return this.view;
	}
}
