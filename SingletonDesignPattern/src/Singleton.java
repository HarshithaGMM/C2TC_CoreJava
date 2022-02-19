import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	import java.lang.reflect.*;

	 class Singleton
{
     static Singleton instance;
    public static String str;
    Singleton() {}

    static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}



