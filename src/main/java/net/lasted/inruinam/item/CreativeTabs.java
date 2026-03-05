package net.lasted.inruinam.item;

import net.lasted.inruinam.InRuinam;
import net.lasted.inruinam.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InRuinam.MODID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("inruinam_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.NETHERITE_BLOCK))
                    .title(Component.translatable("creativetab.inruinam_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.FLIMSY_CHEST.get());
                        output.accept(Items.DIAMOND);
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }
}
