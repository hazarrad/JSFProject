package com.everis.day12.reflexion;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InterruptedException {

		Class<?> clazz = Class.forName("com.everis.day12.reflexion.ReflextionDemo");

		System.out.println(clazz.getName());

		for (Method method : clazz.getDeclaredMethods()) {
			System.out.println("method name : " + method.getName());
		}
		for (Constructor<?> constructor : clazz.getConstructors()) {
			System.out.println("constructor name : " + constructor.getParameterCount());
		}

		System.out.println(clazz.getDeclaredFields()[0].getType());

		for (Annotation annotation : clazz.getAnnotations()) {
			System.out.println(annotation);
			if ("FirstAnnotation".equals(annotation.annotationType().getSimpleName())) {
				ReflextionDemo reflextionDemo = new ReflextionDemo(3);
				// Thread.sleep(10000);
				System.out.println("Before invoke " + reflextionDemo);
				Method methodSetId = null;
				for (Method method : clazz.getDeclaredMethods()) {

					if ("setId".equals(method.getName())) {
						methodSetId = method;
					}
				}
				methodSetId.invoke(reflextionDemo, 6); // reflextionDemo.setId(6);
				System.out.println("After invoke " + reflextionDemo);
			}
		}
	}
}
