package com.github.ericliucn.redmoon.blocks;

import com.github.ericliucn.redmoon.Main;
import com.github.ericliucn.redmoon.blocks.tiles.TileGenerator;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import vazkii.arl.block.BlockMod;

import javax.annotation.Nullable;

public class BlockGenerator extends BlockMod {

    public BlockGenerator(String name, Material materialIn, String... variants) {
        super(name, materialIn, variants);
        this.setCreativeTab(Main.creativeTab);
    }

    @Override
    public String getModNamespace() {
        return Main.MOD_ID;
    }

    @Override
    public String getUniqueModel() {
        return "block_generator";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileGenerator();
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }


}
