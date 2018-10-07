package org.zerock.service;

import org.zerock.anno.BGM;
import org.zerock.anno.Trailer;

@BGM("I'm Not A Hero")
public class DarkKnight {
	
	@BGM("Strike")
	@Trailer
	public void strike() {
		System.out.println("strike");
	}

}
