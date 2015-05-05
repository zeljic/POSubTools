package com.zeljic.posubtools.parser;

import java.util.ArrayList;

public abstract class Parser
{
	private String content;
	private ArrayList<Item> list = new ArrayList<Item>();

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getContent()
	{
		return content;
	}

	public ArrayList<Item> getList()
	{
		return list;
	}

	public void parse()
	{

	}
}