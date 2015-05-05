package com.zeljic.posubtools.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableView;

import com.zeljic.posubtools.parser.Item;

public class BootController implements Initializable
{
	private URL url;
	private ResourceBundle bundle;

	@FXML
	private Button btnOpen, btnSave, btnReset, btnRun, btnLayout;

	@FXML
	private TableView<Item> tvSource, tvResult;

	@FXML
	private SplitPane spMain;

	@Override
	public void initialize(URL url, ResourceBundle bundle)
	{
		this.url = url;
		this.bundle = bundle;
	}

	@FXML
	private void btnLayoutOnAction()
	{
		spMain.setOrientation( Orientation.HORIZONTAL == spMain.getOrientation() ? Orientation.VERTICAL : Orientation.HORIZONTAL );
	}

}
