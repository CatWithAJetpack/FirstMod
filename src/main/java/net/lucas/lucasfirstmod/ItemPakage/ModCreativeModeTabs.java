package net.lucas.lucasfirstmod.ItemPakage;

import net.lucas.lucasfirstmod.LucasFirstMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LucasFirstMod.MODID);

    public static final RegistryObject<CreativeModeTab> Sapphire_Tab = CREATIVE_MODE_TABS.register("sapphire_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemsClass.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.sapphire_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItemsClass.SAPPHIRE.get());
                        output.accept(ModItemsClass.RAW_SAPPHIRE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
