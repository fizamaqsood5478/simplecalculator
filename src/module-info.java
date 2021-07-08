module main {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens main to javafx.graphics, javafx.fxml;
}
