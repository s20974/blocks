package com.alex;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure{
    private final List<Block> blocks;

    public Wall(){
        Blocks block = new Blocks();
        blocks = block.getBlocks();
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream()
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blocks = new ArrayList<>();
        for(Block bl : this.blocks){
            if(bl.getMaterial().equals(material)){
                blocks.add(bl);
            }
        }
        return blocks;
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
