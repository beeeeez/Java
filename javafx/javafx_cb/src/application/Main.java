package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.Insets;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane border = new BorderPane();
			VBox supermasterbox = new VBox(10);
			HBox masterBox = new HBox(10);
			VBox vboxLabels = new VBox(17);

			VBox vboxInputs = new VBox(8);

		//	HBox weightH = new HBox();		    	
			    Label weightL = new Label();
			    weightL.setText("Weight In Pounds:");
			    TextField weightT = new TextField();
			   
			  //  weightH.getChildren().addAll(weightL, weightT);
			   
		//	    HBox heightH = new HBox();		
			    Label heightL = new Label();
			    heightL.setText("Height In Inches:");
			    TextField heightT = new TextField();
			  //  heightH.getChildren().addAll(heightL, heightT);
			    
			 //   HBox ageH = new HBox();	
			    Label ageL = new Label();			    
			    ageL.setText("Age in Years:");
			    TextField ageT = new TextField();
			 //   ageH.getChildren().addAll(ageL, ageT);
			    
			  //  HBox sexH = new HBox();	
			    Label sexL = new Label();
			    sexL.setText("Sex:");
			    ToggleGroup sexGroup  = new ToggleGroup();
			    HBox sexInputs = new HBox();
			    RadioButton rm = new RadioButton("m");
			    rm.setToggleGroup(sexGroup);
			    RadioButton rf = new RadioButton("f");
			    sexGroup.selectToggle(rm);
			    rf.setToggleGroup(sexGroup);
			    sexInputs.getChildren().addAll(rm, rf);		
			  //  sexH.getChildren().addAll(sexL, sexT);
			    
			  //  HBox actH = new HBox();	
			    Label actL = new Label();
			    actL.setText("Activity Level: ");
			    ComboBox actCombo = new ComboBox();
			    actCombo.getItems().addAll(
			    		"Sedentary",
			    		"Somewhat Active",
			    		"Active",
			    		"Highly Active"
			    		);
			    actCombo.setValue("Sedentary");
			 //   actH.getChildren().addAll(actL, actT);
			    Label answer = new Label();
			    answer.setText("number of chocolate bars");
			    vboxLabels.getChildren().addAll(weightL, heightL, ageL, sexL, actL);
				vboxInputs.getChildren().addAll(weightT, heightT, ageT, sexInputs, actCombo);
			    Button calBut = new Button("Calculate Calories");
			    masterBox.getChildren().addAll(vboxLabels, vboxInputs, calBut);
		//	    vboxLabels.getChildren().addAll(weightH, heightH, ageH, sexH, actH, calBut);
			    
			   supermasterbox.getChildren().addAll(masterBox, calBut, answer);
			   
			    border.setLeft(supermasterbox);    
			    calBut.setOnAction(new EventHandler<ActionEvent>(){
			    	@Override
			    	public void handle(ActionEvent event){
			    		String sex="";
			    		if(rm.isSelected()) {
			    			sex="m";
			    		}
			    		else {
			    			sex="f";
			    		}
			    		String wgt = weightT.getText();
			    		String hgt = heightT.getText();
			    		String actX = actCombo.getValue().toString(), act="";
			    		String age = ageT.getText();
			    		
			    		switch(actX) {
			    		case "Sedentary":
			    			act="a";
			    			break;
			    		case "Somewhat Active":
			    			act="b";
			    			break;
			    		case "Active":
			    			act="c";
			    			break;
			    		case "Highly Active":
			    			act="d";
			    			break;
			    		default:
			    			act="a";
			    			break;
			    		}
			    		
			    		
			    		double glun=0;
			    		switch(sex) {
			    		case "f":
			    			sex="female";
			    			glun = 655 + (4.3 * Double.parseDouble(wgt)) + (4.7*Double.parseDouble(hgt)) - (4.7*Double.parseDouble(age));
			    			break;
			    		case "m":
			    			sex="male";
			    			glun = 66 + (6.3 * Double.parseDouble(wgt)) + (12.9*Double.parseDouble(hgt)) - (6.8*Double.parseDouble(age));
			    			break;
			    		default: 
			    			System.out.println("try gender again");
			    			System.exit(0);
			    		}	
			    		switch(act) {
			    		case "a":
			    			glun=glun*1.2;
			    			break;
			    		case "b":
			    			glun=glun*1.3;
			    			break;
			    		case "c":
			    			glun=glun*1.4;
			    			break;
			    		case "d":
			    			glun=glun*1.5;
			    			break;
			    		default:
			    			System.out.println("dun goof'd the activity level");
			    			System.exit(0);
			    		}
			    		glun = glun/230;
			    		String jimmy = String.format("%2.2f", glun);
			    		answer.setText(jimmy);			    		
			    		
			    		
			    		
			    		}
			    });
			Scene scene = new Scene(border,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
