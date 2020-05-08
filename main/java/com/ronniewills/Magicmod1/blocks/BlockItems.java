package com.ronniewills.Magicmod1.blocks;

import com.ronniewills.Magicmod1.Magicmod1;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItems extends BlockItem {


    public BlockItems(Block block) {
        super(block, new Item.Properties().group(Magicmod1.TAB));

    }



}




