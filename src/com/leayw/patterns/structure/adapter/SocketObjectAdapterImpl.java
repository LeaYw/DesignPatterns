package com.leayw.patterns.structure.adapter;


/**
 * Object Adapter 使用组合实现adapter
 */
public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt(), 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(socket.getVolt(), 40);
    }

    private Volt convertVolt(Volt volt, int divider) {
        int v = volt.getVolt() / divider;
        return new Volt(v);
    }
}
