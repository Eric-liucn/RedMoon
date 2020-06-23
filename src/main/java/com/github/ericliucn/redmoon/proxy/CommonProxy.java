package com.github.ericliucn.redmoon.proxy;

import com.github.ericliucn.redmoon.blocks.ModBlock;
import com.github.ericliucn.redmoon.blocks.tiles.ModTile;
import com.github.ericliucn.redmoon.command.TestCommand;
import com.github.ericliucn.redmoon.handlers.EventHandler;
import com.github.ericliucn.redmoon.items.ModItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {

    public void preinit(FMLPreInitializationEvent event){
        new EventHandler();
        ModItem.preInit();
        ModBlock.preInit();
        ModTile.preInit();
    }

    public void init(FMLInitializationEvent event){

    }

    public void postinit(FMLPostInitializationEvent event){

    }

    public void serverstarting(FMLServerStartingEvent event){
        // 注册指令
        event.registerServerCommand(new TestCommand());
    }


}
