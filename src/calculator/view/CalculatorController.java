package calculator.view;

import calculator.model.ArithmeticOperations;
import calculator.model.ArithmeticOperations.Operator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController
{
    ArithmeticOperations main = new ArithmeticOperations();
    
    @FXML
    private Label displayLabel;

    @FXML
    void clearOnAction(ActionEvent event)
    {
	displayLabel.setText(main.clear());
    }

    @FXML
    void divisonOnAction(ActionEvent event)
    {
	displayLabel.setText("÷");
	main.operator(Operator.DIVISION);
    }

    @FXML
    void eightOnAction(ActionEvent event)
    {
	displayLabel.setText(main.digitInput(8));
    }

    @FXML
    void equalsOnAction(ActionEvent event)
    {
	displayLabel.setText(main.equals());
    }

    @FXML
    void fiveOnAction(ActionEvent event)
    {
	displayLabel.setText(main.digitInput(5));
    }

    @FXML
    void fourOnAction(ActionEvent event)
    {
	displayLabel.setText(main.digitInput(4));
    }

    @FXML
    void minusOnAction(ActionEvent event)
    {
	displayLabel.setText("−");
	main.operator(Operator.SUBTRACTION);
    }

    @FXML
    void multiplicationOnAction(ActionEvent event)
    {
	displayLabel.setText("×");
	main.operator(Operator.MULTIPLICATION);
    }

    @FXML
    void nineOnAction(ActionEvent event)
    {
	displayLabel.setText(main.digitInput(9));
    }

    @FXML
    void oneOnAction(ActionEvent event)
    {
	displayLabel.setText(main.digitInput(1));
    }

    @FXML
    void plusOnAction(ActionEvent event)
    {
	displayLabel.setText("+");
	main.operator(Operator.ADDITION);
    }

    @FXML
    void sevenOnAction(ActionEvent event)
    {
	displayLabel.setText(main.digitInput(7));
    }

    @FXML
    void sixOnAction(ActionEvent event)
    {
	displayLabel.setText(main.digitInput(6));
    }

    @FXML
    void threeOnAction(ActionEvent event)
    {
	displayLabel.setText(main.digitInput(3));
    }

    @FXML
    void twoOnAction(ActionEvent event)
    {
	displayLabel.setText(main.digitInput(2));
    }

    @FXML
    void zeroOnAction(ActionEvent event)
    {
	displayLabel.setText(main.digitInput(0));
    }
}
