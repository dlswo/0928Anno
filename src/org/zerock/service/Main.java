package org.zerock.service;

import java.lang.reflect.Method;
import java.util.Scanner;

import org.zerock.anno.BGM;
import org.zerock.anno.Trailer;

public class Main {

	public static void main(String[] args)throws Exception {
		
		Scanner scanner = 
				new Scanner(System.in);
		
		String prefix = "org.zerock.service.";
		
		System.out.println("INPUT NAME");
		String heroName = scanner.nextLine();
		
		Class clz = Class.forName(prefix + heroName);
		
		Object obj = clz.newInstance();
		
		
		BGM bgm = (BGM) clz.getAnnotation(BGM.class);
		
		String music = bgm.value();
		int duration = bgm.duration();
		
		System.out.println("~~!~~~~~~~~~");
		System.out.println(music +": " + duration);
		System.out.println(obj);
		
		Method[] methods = clz.getDeclaredMethods();
		
		for(Method method:methods) {
			
			Trailer anno = method.getAnnotation(Trailer.class);
			
			if(anno != null) {
				method.invoke(obj, null);
			}
			
		}
		
	}
}
