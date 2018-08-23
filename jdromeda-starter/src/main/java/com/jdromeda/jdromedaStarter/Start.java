package com.jdromeda.jdromedaStarter;


import static def.dom.Globals.alert;


import def.dom.Event;

import java.util.ArrayList;
import java.util.List;

import com.jdromeda.widgets.Button;
import com.jdromeda.widgets.Container;
import com.jdromeda.widgets.RootPanel;
import com.jdromeda.widgets.listener.ClickListener;

public class Start {

	
	public static void main(String args[])
	{
		List a = new ArrayList<>();
		a.add("test");
		a.add("ss");
		
		alert(a);
		
		Container div = new Container();
		Button b = new Button("Hallo, klick mich!");
		div.add(b); 
		
		RootPanel.addStatic(b);

		b.addClickListener(new ClickListener() {

			@Override
			public void click(Event e) {
				alert("danke dir!");

			}
		});
		
	  
	}
}
