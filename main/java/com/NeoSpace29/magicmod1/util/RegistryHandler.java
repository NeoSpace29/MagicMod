 package com.NeoSpace29.magicmod1.util;

import com.NeoSpace29.magicmod1.blocks.BlockItems;
import com.NeoSpace29.magicmod1.blocks.Demon_Block;
import com.NeoSpace29.magicmod1.blocks.First_Block;
import com.NeoSpace29.magicmod1.items.Items;
import com.NeoSpace29.magicmod1.Magicmod1;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

 public class RegistryHandler {

     public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Magicmod1.MOD_ID);
     public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Magicmod1.MOD_ID);


     public static void init() {
         ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
         BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        /* for future setup
         TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
         CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
         ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
         DIMENSIONS.register(FMLJavaModLoadingContext.get().getModEventBus());}*/
     }
     //items
     public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", Items::new);
     public static final RegistryObject<Item> FIRST_ITEM = ITEMS.register("first_item", Items::new);


     //blocks
     public static final RegistryObject<Block> FIRST_BLOCK = BLOCKS.register("first_block", First_Block::new);
     public static final RegistryObject<Block> DEMON_BLOCK = BLOCKS.register("demon_block", Demon_Block::new);

     //block items
     public static final RegistryObject<Item> FIRST_BLOCK_ITEM = ITEMS.register("first_block", () -> new BlockItems(FIRST_BLOCK.get()));
     public static final RegistryObject<Item> DEMON_BLOCK_ITEM = ITEMS.register("demon_block", () -> new BlockItems(DEMON_BLOCK.get()));



     }
