package com.zeljic.subtitlemerger;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import com.zeljic.subtitlemerger.uil.Loader;
import com.zeljic.subtitlemerger.utils.R;

public class Boot extends Application
{

	@Override
	public void start(Stage stage) throws Exception
	{
		Loader loader = Loader.setInstance("Boot", stage, R.get("/fxml/Boot.fxml"));
		stage.setScene(loader.getScene());
		stage.setTitle("Subtitle Merger");
		stage.setMinWidth(800);
		stage.setMinHeight(400);

		// add application icon
		stage.getIcons().add(new Image( R.getAsStream("/gfx/icon.png") ));

		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}
