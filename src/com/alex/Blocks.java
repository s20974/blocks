package com.alex;

import java.util.ArrayList;
import java.util.List;

public class Blocks implements CompositeBlock{
    private String color;
    private String material;

    private static final List<Block> blocks = new ArrayList<>();

    public Blocks(String color, String material){
        this.color = color;
        this.material = material;

        blocks.add(this);
    }

    public Blocks(){

    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    public String toString() {
        return "Blocks{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
