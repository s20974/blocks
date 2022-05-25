package com.alex;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Block block1 = new Blocks("red", "metal");
        Block block2 = new Blocks("silver", "aluminium");
        Block block3 = new Blocks("red", "wood");
        Block block4 = new Blocks("blue", "plastic");


        System.out.println("block1 color: " + block1.getColor());
        System.out.println("block2 color: " + block2.getColor());
        System.out.println("block3 color: " + block3.getColor());
        System.out.println("block4 color: " + block4.getColor());

        System.out.println("\nblock1 material: " + block1.getMaterial());
        System.out.println("block2 material: " + block2.getMaterial());
        System.out.println("block3 material: " + block3.getMaterial());
        System.out.println("block4 material: " + block4.getMaterial());
        System.out.println();

        CompositeBlock block = new Blocks();
        for(Block bl : block.getBlocks()){
            System.out.println(bl);
        }

        Block block5 = new Blocks("silver", "aluminium");

        Structure structure = new Wall();

        System.out.println("\nfindBlockByColor red: " + structure.findBlockByColor("red"));
        System.out.println("findBlocksByMaterial aluminium: " + structure.findBlocksByMaterial("aluminium"));
        System.out.println("count: " + structure.count());

        Optional<Block> blockByColor = structure.findBlockByColor("white");
        blockByColor.ifPresent(System.out::println);
    }
}
