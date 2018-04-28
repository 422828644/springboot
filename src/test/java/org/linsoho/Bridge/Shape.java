package org.linsoho.Bridge;

/**
 * Created by admin on 2018/4/24.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
