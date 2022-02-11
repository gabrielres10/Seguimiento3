package application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class SampleController {
	private int a=-1;
	private int b=-1;
	private int result;
	private String resultt;
	@FXML
	Label history1;
	@FXML
	Label history2;
	@FXML
	Label history3;
	@FXML
	Label history4;
	@FXML
	Label labelResult;
	@FXML
	public void num1() {
		if(a==-1) {
		a=1;
		}else {
			b=1;
		}
	}
	@FXML
	public void num2() {
		if(a==-1) {
		a=2;
		}else {
			b=2;
		}
	}
	@FXML
	public void num3() {
		if(a==-1) {
		a=3;
		}else {
			b=3;
		}
	}
	@FXML
	public void num4() {
		if(a==-1) {
		a=4;
		}else {
			b=4;
		}
	}
	@FXML
	public void num5() {
		if(a==-1) {
		a=5;
		}else {
			b=5;
		}
	}
	@FXML
	public void num6() {
		if(a==-1) {
		a=6;
		}else {
			b=6;
		}
	}
	@FXML
	public void num7() {
		if(a==-1) {
		a=7;
		}else {
			b=7;
		}
	}
	@FXML
	public void num8() {
		if(a==-1) {
		a=8;
		}else {
			b=8;
		}
	}
	@FXML
	public void num9() {
		if(a==-1) {
		a=9;
		}else {
			b=9;
		}
	}
	@FXML
	public void num0() {
		if(a==-1) {
		a=0;
		}else {
			b=0;
		}
	}
	@FXML
	public void sum() {
		result= a+b;
		resultt = String.valueOf(result);
		
	}
	@FXML
	public void difference() {
		result= a-b;
		resultt = String.valueOf(result);
		
	}
	@FXML
	public void product() {
		if(a!=-1 && b!=-1) {
		result= a*b;
		resultt = String.valueOf(result);
		}else{
			resultt = "Por favor ingrese números";
		}
		
		
	}
	@FXML
	public void seeResult() {
		String aText ="";
		aText = String.valueOf(a);
		String bText ="";
		bText = String.valueOf(b);
		labelResult.setText(resultt);
		history1.setText(aText+"+"+bText+"="+resultt);
		a=-1;
		b=-1;
	}
}
