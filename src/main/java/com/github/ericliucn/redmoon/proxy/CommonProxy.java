package com.github.ericliucn.redmoon.proxy;

import com.github.ericliucn.redmoon.blocks.ModBlock;
import com.github.ericliucn.redmoon.blocks.TEMachines;
import com.github.ericliucn.redmoon.command.TestCommand;
import com.github.ericliucn.redmoon.handlers.EventHandler;
import com.github.ericliucn.redmoon.handlers.GUIHandler;
import com.github.ericliucn.redmoon.handlers.TEHandler;
import com.github.ericliucn.redmoon.items.ModItem;
import com.github.ericliucn.redmoon.worldgen.OreGenHandler;
import com.github.ericliucn.redmoon.worldgen.TestGenerator;
import com.github.ericliucn.redmoon.worldgen.WorldOreGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void start(FMLConstructionEvent event){
        new TEHandler();
    }

    public void preinit(FMLPreInitializationEvent event){
        new EventHandler();
        new GUIHandler();
        ModItem.preInit();
        ModBlock.preInit();
    }

    public void init(FMLInitializationEvent event){
        TEMachines.buildDummies();
        GameRegistry.registerWorldGenerator(new TestGenerator(), 0);
        //new OreGenHandler();
    }

    public void postinit(FMLPostInitializationEvent event){

    }

    public void serverstarting(FMLServerStartingEvent event){
        // 注册指令
        event.registerServerCommand(new TestCommand());
    }


}
