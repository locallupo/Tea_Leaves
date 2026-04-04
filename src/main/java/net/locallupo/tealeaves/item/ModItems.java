package net.locallupo.tealeaves.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.locallupo.tealeaves.TeaLeaves;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumable;

import java.util.function.Function;

public class ModItems {

    public static final Item TEA_LEAVES = register("tea_leaves", Item::new, new Item.Properties());
    public static final Item YELLOW_TEA_LEAVES = register("yellow_tea_leaves", Item::new, new Item.Properties());
    public static final Item WHITE_TEA_LEAVES = register("white_tea_leaves", Item::new, new Item.Properties());
    public static final Item OOLONG_TEA_LEAVES = register("oolong_tea_leaves", Item::new, new Item.Properties());
    public static final Item BLACK_TEA_LEAVES = register("black_tea_leaves", Item::new, new Item.Properties());
    public static final Item DARK_TEA_LEAVES = register("dark_tea_leaves", Item::new, new Item.Properties());
    //public static final Item MATCHA_POWDER = register("matcha_powder", Item::new, new Item.Properties());

    public static final Item TEA_CUP = register("tea_cup", Item::new, new Item.Properties());
    public static final Item WATER_TEA_CUP = register("water_tea_cup", Item::new, new Item.Properties().usingConvertsTo(TEA_CUP).component(DataComponents.CONSUMABLE, Consumable.builder().consumeSeconds(1.6f).hasConsumeParticles(false).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).build()));
    public static final Item BOILED_WATER_TEA_CUP = register("boiled_water_tea_cup", Item::new, new Item.Properties().usingConvertsTo(TEA_CUP).component(DataComponents.CONSUMABLE, Consumable.builder().consumeSeconds(1.6f).hasConsumeParticles(false).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).build()));

    public static final Item GREEN_TEA = register("green_tea", Item::new, new Item.Properties().usingConvertsTo(TEA_CUP).component(DataComponents.CONSUMABLE, Consumable.builder().consumeSeconds(1.6f).hasConsumeParticles(false).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).build()));
    public static final Item YELLOW_TEA = register("yellow_tea", Item::new, new Item.Properties().usingConvertsTo(TEA_CUP).component(DataComponents.CONSUMABLE, Consumable.builder().consumeSeconds(1.6f).hasConsumeParticles(false).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).build()));
    public static final Item WHITE_TEA = register("white_tea", Item::new, new Item.Properties().usingConvertsTo(TEA_CUP).component(DataComponents.CONSUMABLE, Consumable.builder().consumeSeconds(1.6f).hasConsumeParticles(false).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).build()));
    public static final Item OOLONG_TEA = register("oolong_tea", Item::new, new Item.Properties().usingConvertsTo(TEA_CUP).component(DataComponents.CONSUMABLE, Consumable.builder().consumeSeconds(1.6f).hasConsumeParticles(false).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).build()));
    public static final Item BLACK_TEA = register("black_tea", Item::new, new Item.Properties().usingConvertsTo(TEA_CUP).component(DataComponents.CONSUMABLE, Consumable.builder().consumeSeconds(1.6f).hasConsumeParticles(false).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).build()));
    public static final Item DARK_TEA = register("dark_tea", Item::new, new Item.Properties().usingConvertsTo(TEA_CUP).component(DataComponents.CONSUMABLE, Consumable.builder().consumeSeconds(1.6f).hasConsumeParticles(false).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).build()));
    public static final Item MATCHA = register("matcha", Item::new, new Item.Properties().usingConvertsTo(TEA_CUP).component(DataComponents.CONSUMABLE, Consumable.builder().consumeSeconds(1.6f).hasConsumeParticles(false).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).build()));

    //public static final Item CHAMOMILE = register("chamomile", Item::new, new Item.Properties());
    //public static final Item MINT = register("mint", Item::new, new Item.Properties());
    //public static final Item LEMON_BALM = register("lemon_balm", Item::new, new Item.Properties());
    //public static final Item YERBA_MATE = register("yerba_mate", Item::new, new Item.Properties());
    //public static final Item RASPBERRY_LEAF = register("raspberry_leaf", Item::new, new Item.Properties());
    //public static final Item HOLY_BASIL = register("holy_basil", Item::new, new Item.Properties());
    //public static final Item ELDERFLOWER = register("elderflower", Item::new, new Item.Properties());
    //public static final Item LAVENDER = register("lavender", Item::new, new Item.Properties());

    //public static final Item CHAMOMILE_TEA = register("chamomile_tea", Item::new, new Item.Properties());
    //public static final Item MINT_TEA = register("mint_tea", Item::new, new Item.Properties());
    //public static final Item LEMON_BALM_TEA = register("lemon_balm_tea", Item::new, new Item.Properties());
    //public static final Item YERBA_MATE_TEA = register("yerba_mate_tea", Item::new, new Item.Properties());
    //public static final Item RASPBERRY_LEAF_TEA = register("raspberry_leaf_tea", Item::new, new Item.Properties());
    //public static final Item HOLY_BASIL_TEA = register("holy_basil_tea", Item::new, new Item.Properties());
    //public static final Item ELDERFLOWER_TEA = register("elderflower_tea", Item::new, new Item.Properties());
    //public static final Item LAVENDER_TEA = register("lavender_tea", Item::new, new Item.Properties());

    //public static final Item STRAWBERRY = register("strawberry", Item::new, new Item.Properties());
    //public static final Item RASPBERRY = register("raspberry", Item::new, new Item.Properties());

    //public static final Item ELDERFLOWER_CORDIAL = register("elderflower_cordial", Item::new, new Item.Properties());
    //public static final Item STRAWBERRY_AND_WATERMELON_ICED_TEA = register("strawberry_and_watermelon_iced_tea", Item::new, new Item.Properties());
    //public static final Item RASPBERRY_CORDIAL = register("raspberry_cordial", Item::new, new Item.Properties());
    //public static final Item STRAWBERRY_CORDIAL = register("strawberry_cordial", Item::new, new Item.Properties());
    //public static final Item APPLE_JUICE = register("apple_juice", Item::new, new Item.Properties());

    //public static final Item HOT_CHOCOLATE = register("hot_chocolate", Item::new, new Item.Properties());




    public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
        // Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TeaLeaves.MOD_ID, name));

        // Create the item instance.
        T item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize(){
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.TEA_LEAVES));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.YELLOW_TEA_LEAVES));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.WHITE_TEA_LEAVES));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.OOLONG_TEA_LEAVES));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.BLACK_TEA_LEAVES));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.DARK_TEA_LEAVES));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.TEA_CUP));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((itemGroup) -> itemGroup.accept(ModItems.WATER_TEA_CUP));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((itemGroup) -> itemGroup.accept(ModItems.BOILED_WATER_TEA_CUP));



        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((itemGroup) -> itemGroup.accept(ModItems.GREEN_TEA));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((itemGroup) -> itemGroup.accept(ModItems.YELLOW_TEA));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((itemGroup) -> itemGroup.accept(ModItems.WHITE_TEA));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((itemGroup) -> itemGroup.accept(ModItems.OOLONG_TEA));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((itemGroup) -> itemGroup.accept(ModItems.BLACK_TEA));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((itemGroup) -> itemGroup.accept(ModItems.DARK_TEA));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((itemGroup) -> itemGroup.accept(ModItems.MATCHA));
    }
}
