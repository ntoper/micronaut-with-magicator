package io.manycore;

public class Reflector {

    public static String reflect() throws ClassNotFoundException {
    	    String retur = "";

                for (int classCount = 0; classCount <= 15; classCount++) {
                    Class thisClass = Class.forName("io.manycore.reflection.Meng" + classCount);
                    retur += thisClass.toString() + "\n";
             
            }
            return retur;
    }
}
