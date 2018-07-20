package calculator;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application
{	
	@Override
	public void start(Stage primaryStage)
	{
		try
		{
			AnchorPane root = (AnchorPane) FXMLLoader.load(Main.class.getResource("view/Calculator.fxml"));
			
			Scene scene = new Scene(root);
			
			scene.getStylesheets().add(getClass().getResource("view/calculator.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Calculator");
			primaryStage.setResizable(false);
			primaryStage.show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
	    launch(args);
	}
}