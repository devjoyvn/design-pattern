package vn.devjoy.adapter;

import vn.devjoy.round.RoundPeg;
import vn.devjoy.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Tính bán kính hình tròn nhỏ nhất có thể lắp được cái chốt này.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
