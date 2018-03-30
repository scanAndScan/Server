package com.example.demo;

import org.python.core.Py;
import org.python.core.PyFunction;
import org.python.core.PyObject;
import org.python.core.PySystemState;
import org.python.util.PythonInterpreter;

public class HelloPython {

	public static void main(String args[]) {
		PythonInterpreter pythonInterpreter = new PythonInterpreter();
		PySystemState sys = Py.getSystemState();     
        sys.path.add("D:\\program file\\PycharmProjects\\untitled2\\venv\\Lib\\site-packages");       
        pythonInterpreter.exec("import sys");   
		pythonInterpreter.execfile("D:\\program file\\PycharmProjects\\untitled2\\autopjt\\autopjt\\spiders\\autospd.py");
		PyFunction pyFunction = pythonInterpreter.get("hello",PyFunction.class);
		PyObject pyObject = pyFunction.__call__();
		System.out.println(pyObject);
	}
}
