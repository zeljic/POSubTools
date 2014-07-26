package com.zeljic.subtitlemerger.parser;

public class Item
{

	private int start = 0;
	private int end = 0;
	private String text = "";

	public Item(int start, int end, String text)
	{
		this.start = start;
		this.end = end;
		this.text = text;
	}

	public int getStart()
	{
		return start;
	}

	public int getEnd()
	{
		return end;
	}

	public String getText()
	{
		return text;
	}

}
