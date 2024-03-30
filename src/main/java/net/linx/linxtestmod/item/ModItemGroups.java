package net.linx.linxtestmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.linx.linxtestmod.LinxTestMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CURRENCY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LinxTestMod.MOD_ID, "currency"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.currency"))
                    .icon(() -> new ItemStack(ModItems.COIN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COIN);
                        entries.add(ModItems.COINBAG);
                    }).build());

    public static void registerItemGroups(){
        LinxTestMod.LOGGER.info("Registering Item Groups for " + LinxTestMod.MOD_ID);
    }
}
