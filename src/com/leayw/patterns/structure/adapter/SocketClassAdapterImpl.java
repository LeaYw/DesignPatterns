package com.leayw.patterns.structure.adapter;

/**
 * Class Adapter 使用继承父类实现adapter
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt(), 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(getVolt(), 40);
    }

    private Volt convertVolt(Volt volt, int divider) {
        int v = volt.getVolt() / divider;
        return new Volt(v);
    }
}
