package org.linsoho.Bridge;

/**
 * Created by admin on 2018/4/24.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ Color: green, radius: "
            + radius + ", x: " + x + ", " + y + "]");
    }
}
