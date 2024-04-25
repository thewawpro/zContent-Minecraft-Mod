package com.zcontent.enchantment;

import com.zcontent.init.ModEnchantments;
import com.zcontent.items.ItemWand1;
import com.zcontent.items.ItemWand2;
import com.zcontent.items.ItemWand3;
import com.zcontent.items.ItemWand4;
import com.zcontent.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class EnchantmentLevitation extends Enchantment {

    public EnchantmentLevitation() {
        super(Rarity.VERY_RARE, ModEnchantments.WAND, new EntityEquipmentSlot[]{});
        this.setName("Levitation");
        this.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":levitation"));
        ModEnchantments.ENCHANTMENTS.add(this);

    }

    @Override
    public boolean canApply(ItemStack stack) {
        Item item = stack.getItem();
        return (item instanceof ItemWand1 || item instanceof ItemWand2 || item instanceof ItemWand3 || item instanceof ItemWand4);
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }

    @Override
    public int getMinEnchantability(int level) {
        return 500;
    }

    @Override
    public int getMaxEnchantability(int level) {
        return 1000;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isCurse() {
        return true;
    }

    @Override
    protected boolean canApplyTogether(Enchantment ench) {
        return this != ench;
    }

}