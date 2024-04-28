package net.lucas.lucasfirstmod.Block;

import net.lucas.lucasfirstmod.ItemPakage.ModItemsClass;
import net.lucas.lucasfirstmod.LucasFirstMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, LucasFirstMod.MODID);


    public static final RegistryObject<Block> Sapphire_Block = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.IRON_BLOCK).sound(SoundType.AMETHYST))
            );

    public static final RegistryObject<Block> Raw_Sapphire_Block = registerBlock("raw_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.RAW_IRON_BLOCK).sound(SoundType.AMETHYST))
    );




    private static <T extends Block>RegistryObject<T> registerBlock(String Name, Supplier<T> block) {
        RegistryObject<T> toReturn = Blocks.register(Name, block);
        registerBlockItem(Name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItemsClass.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties()));

    }


    public static void register(IEventBus eventBus){Blocks.register(eventBus);}


}
