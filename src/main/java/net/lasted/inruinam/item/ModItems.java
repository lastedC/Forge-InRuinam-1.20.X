package net.lasted.inruinam.item;

import net.lasted.inruinam.InRuinam;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InRuinam.MODID);

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
