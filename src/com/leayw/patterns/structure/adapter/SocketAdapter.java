package com.leayw.patterns.structure.adapter;


/**
 *  Adapter Design Pattern Example in JDK
 *
 * java.util.Arrays#asList()
 * java.io.InputStreamReader(InputStream) (returns a Reader)
 * java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 */
public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();
}
