package net.linx.linxtestmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.linx.linxtestmod.LinxTestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static org.apache.logging.log4j.core.util.ExtensionLanguageMapping.RUBY;

public class ModItems {

    public static final Item COIN = registerItem("coin", new Item(new FabricItemSettings()));

    private static void addItemsToIngedientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(COIN);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(LinxTestMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        LinxTestMod.LOGGER.info("REgistering Mod Items for " + LinxTestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngedientTabItemGroup);
    }
}
