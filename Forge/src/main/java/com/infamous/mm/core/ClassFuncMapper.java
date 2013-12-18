package com.infamous.mm.core;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import com.infamous.mm.core.lib.BlockRef;


public class ClassFuncMapper {
	private static Map<Integer,Object> sub_classes = BlockRef.sub_classes;
	
	public static Object methodCaller(Object object, String methodName, ParameterBuilder params) {
		//TODO put in proper exceptions   
		
		try {
			return object.getClass().getMethod(methodName, ParameterBuilder.class).invoke(object, params);
		} catch (IllegalArgumentException e) {
			System.out.println(e + ":" + object + ":" + methodName);
			return null;
		} catch (SecurityException e) {
			System.out.println(e + ":" + object + ":" + methodName);
			return null;
		} catch (IllegalAccessException e) {
			System.out.println(e + ":" + object + ":" + methodName);
			return null;
		} catch (InvocationTargetException e) {
			System.out.println(e + ":" + object + ":" + methodName);
			return null;
		} catch (NoSuchMethodException e) {
			System.out.println(e+ ":" + object);
			return null;
		}
		}
	
	public static Object func_mapper(int sub_id, String func_name, ParameterBuilder params){
		
		return methodCaller(sub_classes.get(sub_id), func_name, params);
		
	}
	
	public static Object func_mapper(int sub_id, String func_name){
		
		return methodCaller(sub_classes.get(sub_id), func_name);
		
	}

	public static Object methodCaller(Object object, String methodName) {
		try {
			return object.getClass().getMethod(methodName).invoke(object);
		} catch (IllegalArgumentException e) {
			System.out.println(e + ":" + object + ":" + methodName);
			return null;
		} catch (SecurityException e) {
			System.out.println(e + ":" + object + ":" + methodName);
			return null;
		} catch (IllegalAccessException e) {
			System.out.println(e + ":" + object + ":" + methodName);
			return null;
		} catch (InvocationTargetException e) {
			System.out.println(e + ":" + object + ":" + methodName);
			return null;
		} catch (NoSuchMethodException e) {
			System.out.println(e + ":" + object + ":" + methodName);
			return null;
		}
		
	}
	
}
