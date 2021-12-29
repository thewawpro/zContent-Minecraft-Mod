package com.thewawpro.zcontent.init;

import java.util.ArrayList;
import java.util.List;

import com.thewawpro.zcontent.items.ItemAntidote;
import com.thewawpro.zcontent.items.ItemBad;
import com.thewawpro.zcontent.items.ItemBase;
import com.thewawpro.zcontent.items.ItemFertilizer;
import com.thewawpro.zcontent.items.ItemFertilizerWithered;
import com.thewawpro.zcontent.items.ItemFuel;
import com.thewawpro.zcontent.items.ItemGlowing;
import com.thewawpro.zcontent.items.ItemRepair;
import com.thewawpro.zcontent.items.ItemWand;
import com.thewawpro.zcontent.items.ItemWand1;
import com.thewawpro.zcontent.items.ItemWand2;
import com.thewawpro.zcontent.items.ItemWand3;
import com.thewawpro.zcontent.items.ItemWand4;
import com.thewawpro.zcontent.items.tools.ToolAxe;
import com.thewawpro.zcontent.items.tools.ToolAxeBase;
import com.thewawpro.zcontent.items.tools.ToolElementalSword;
import com.thewawpro.zcontent.items.tools.ToolMasterSword;
import com.thewawpro.zcontent.items.tools.ToolPick;
import com.thewawpro.zcontent.items.tools.ToolPickBase;
import com.thewawpro.zcontent.items.tools.ToolShovel;
import com.thewawpro.zcontent.items.tools.ToolShovelBase;
import com.thewawpro.zcontent.items.tools.ToolSword;
import com.thewawpro.zcontent.items.tools.ToolSwordBase;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

		public static final List<Item> ITEMS = new ArrayList<Item>();
		//Materials ("material_stainless", 3, 1561, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_STAINLESS = EnumHelper.addToolMaterial("material_stainless", 3, 8192, 18.0F, 7.0F, 75);
		public static final ToolMaterial MATERIAL_SILVER_OBSIDIAN = EnumHelper.addToolMaterial("material_silver_obsidian", 3, 1561, 8.0F, 3.0F, 75);
		public static final ToolMaterial MATERIAL_MASTER = EnumHelper.addToolMaterial("material_master", 3, 100, 12.0F, 50.0F, 250);
		public static final ToolMaterial MATERIAL_ELEMENTAL = EnumHelper.addToolMaterial("material_elemental", 3, 1, 12.0F, 7.0F, 25);
		public static final ToolMaterial MATERIAL_MASTER_BASE = EnumHelper.addToolMaterial("material_master_base", 3, 1, 12.0F, 7.0F, 25);

		//Items
		public static final Item machineframe_1 = new ItemBase("machineframe_1");
		public static final Item machineframe_2 = new ItemBase("machineframe_2");
		public static final Item machineframe_3 = new ItemBase("machineframe_3");
		public static final Item machineframe = new ItemBase("machineframe");

		public static final Item red_alloy_ingot = new ItemBase("red_alloy_ingot");
		public static final Item blue_alloy_ingot = new ItemBase("blue_alloy_ingot");
		public static final Item purple_alloy_ingot = new ItemBase("purple_alloy_ingot");
		public static final Item red_compound = new ItemBase("red_compound");
		public static final Item blue_compound = new ItemBase("blue_compound");
		public static final Item graphite_ingot = new ItemBase("graphite_ingot");
		public static final Item cold_iron_ingot = new ItemBase("cold_iron_ingot");
		public static final Item ardite_ingot = new ItemBase("ardite_ingot");
		public static final Item cobalt_ingot = new ItemBase("cobalt_ingot");;
		public static final Item brass_ingot = new ItemBase("brass_ingot");
		public static final Item manyullyn_ingot = new ItemBase("manyullyn_ingot");
		public static final Item nichrome_ingot = new ItemBase("nichrome_ingot");
		public static final Item galvanized_steel_ingot = new ItemBase("galvanized_steel_ingot");
		public static final Item stainless_steel_ingot = new ItemBase("stainless_steel_ingot");
		public static final Item terraglaz_ingot = new ItemBase("terraglaz_ingot");
		public static final Item evil_terraglaz_ingot = new ItemBase("evil_terraglaz_ingot");
		public static final Item carbon_ingot = new ItemBase("carbon_ingot");
		public static final ItemSword stainless_steel_sword = new ToolSword("stainless_steel_sword", MATERIAL_STAINLESS);
		public static final ItemPickaxe stainless_steel_pick = new ToolPick("stainless_steel_pick", MATERIAL_STAINLESS);
		public static final ItemSpade stainless_steel_shovel = new ToolShovel("stainless_steel_shovel", MATERIAL_STAINLESS);
		public static final ItemAxe stainless_steel_axe = new ToolAxe("stainless_steel_axe", MATERIAL_STAINLESS);
		public static final ItemSword silver_obsidian_sword = new ToolSwordBase("silver_obsidian_sword", MATERIAL_SILVER_OBSIDIAN);
		public static final ItemPickaxe silver_obsidian_pick = new ToolPickBase("silver_obsidian_pick", MATERIAL_SILVER_OBSIDIAN);
		public static final ItemSpade silver_obsidian_shovel = new ToolShovelBase("silver_obsidian_shovel", MATERIAL_SILVER_OBSIDIAN);
		public static final ItemAxe silver_obsidian_axe = new ToolAxeBase("silver_obsidian_axe", MATERIAL_SILVER_OBSIDIAN);	
		public static final ItemSword firesword = new ToolElementalSword("firesword", MATERIAL_ELEMENTAL);
		public static final ItemSword icesword = new ToolElementalSword("icesword", MATERIAL_ELEMENTAL);
		public static final Item masterswordblade = new ItemBase("masterswordblade");
		public static final Item masterswordcore = new ItemBase("masterswordcore");
		public static final Item masterswordgrip = new ItemBase("masterswordgrip");
		public static final ItemSword mastersword1 = new ToolElementalSword("mastersword1", MATERIAL_MASTER_BASE);
		public static final ItemSword mastersword2 = new ToolMasterSword("mastersword2", MATERIAL_MASTER);
		public static final Item excavation_wand = new ItemWand("excavation_wand");
		public static final Item magic_fertilizer = new ItemFertilizer("magic_fertilizer");
		public static final Item withered_bone_meal = new ItemFertilizerWithered("withered_bone_meal");
		public static final Item repairer = new ItemRepair("repairer");
		public static final Item coal_tiny_small = new ItemFuel("coal_tiny_small");
		public static final Item charcoal_tiny_small = new ItemFuel("charcoal_tiny_small");
		public static final Item redstone_ball = new ItemBase("redstone_ball");
		public static final Item substrate = new ItemBase("substrate");
		public static final Item polyethylene = new ItemBase("polyethylene");
		public static final Item biofuel = new ItemBase("biofuel");
		public static final Item blue_mat_dust = new ItemBase("blue_mat_dust");
		public static final Item purple_mat_dust = new ItemBase("purple_mat_dust");
		public static final Item charged_gunpowder = new ItemGlowing("charged_gunpowder");
		public static final Item halcyon_shard = new ItemGlowing("halcyon_shard");
		public static final Item meteor_dust = new ItemBase("meteor_dust");
		public static final Item et_frag = new ItemBase("et_frag");
		public static final Item sulfur_crystal = new ItemBase("sulfur_crystal");
		public static final Item enricheduranium = new ItemBad("enricheduranium");
		public static final Item vial = new ItemBase("vial");
		public static final Item pill_antidote = new ItemAntidote("pill_antidote", 0, 0.0f, false);
		public static final Item angel_wing = new ItemBase("angel_wing");
		public static final Item bat_wing = new ItemBase("bat_wing");
		public static final Item gold_feather = new ItemBase("gold_feather");
		public static final Item wither_bone = new ItemBase("wither_bone");
		public static final Item collector_star = new ItemBase("collector_star");
		public static final Item collector_dark = new ItemBase("collector_dark");
		public static final Item collector_red = new ItemBase("collector_red");
		public static final Item black_gem = new ItemBase("black_gem");
		public static final Item blue_gem = new ItemBase("blue_gem");
		public static final Item green_gem = new ItemBase("green_gem");
		public static final Item indigo_gem = new ItemBase("indigo_gem");
		public static final Item orange_gem = new ItemBase("orange_gem");
		public static final Item red_gem = new ItemBase("red_gem");
		public static final Item violet_gem = new ItemBase("violet_gem");
		public static final Item white_gem = new ItemBase("white_gem");
		public static final Item yellow_gem = new ItemBase("yellow_gem");
		public static final Item wood_plate = new ItemBase("wood_plate");
		public static final Item extended_tier1 = new ItemBase("extended_tier1");
		public static final Item extended_tier2 = new ItemBase("extended_tier2");
		public static final Item extended_tier3 = new ItemBase("extended_tier3");
		public static final Item extended_tier4 = new ItemBase("extended_tier4");
		public static final Item mold = new ItemBase("mold");
		public static final Item mold_proc = new ItemBase("mold_proc");
		public static final Item carbon_fragment = new ItemBase("carbon_fragment");
		public static final Item carbon_mesh = new ItemBase("carbon_mesh");
		public static final Item carbon_panel = new ItemBase("carbon_panel");
		public static final Item ancientdebris_chunk = new ItemBase("ancientdebris_chunk");
		public static final Item andesite_chunk = new ItemBase("andesite_chunk");
		public static final Item basalt_chunk = new ItemBase("basalt_chunk");
		public static final Item clay_chunk = new ItemBase("clay_chunk");
		public static final Item dirt_chunk = new ItemBase("dirt_chunk");
		public static final Item diorite_chunk = new ItemBase("diorite_chunk");
		public static final Item end_chunk = new ItemBase("end_chunk");
		public static final Item granite_chunk = new ItemBase("granite_chunk");
		public static final Item gravel_chunk = new ItemBase("gravel_chunk");
		public static final Item jasper_chunk = new ItemBase("jasper_chunk");
		public static final Item limestone_chunk = new ItemBase("limestone_chunk");
		public static final Item marble_chunk = new ItemBase("marble_chunk");
		public static final Item nether_chunk = new ItemBase("nether_chunk");
		public static final Item obsidian_chunk = new ItemBase("obsidian_chunk");
		public static final Item sand_chunk = new ItemBase("sand_chunk");
		public static final Item slate_chunk = new ItemBase("slate_chunk");
		public static final Item soulsand_chunk = new ItemBase("soulsand_chunk");
		public static final Item soulstone_chunk = new ItemBase("soulstone_chunk");
		public static final Item meteor_chunk = new ItemBase("meteor_chunk");
		public static final Item stone_chunk = new ItemBase("stone_chunk");
		public static final Item combiner_core = new ItemBase("combiner_core");
		public static final Item dissolver_core = new ItemBase("dissolver_core");
		public static final Item enderio_speed_upgrade_base = new ItemBase("enderio_speed_upgrade_base");
		public static final Item transistor = new ItemBase("transistor");
		public static final Item alu = new ItemBase("alu");
		public static final Item cu = new ItemBase("cu");
		public static final Item rawcircuitboard = new ItemBase("rawcircuitboard");
		public static final Item circuitboard = new ItemBase("circuitboard");
		public static final Item printedcircuitboard = new ItemBase("printedcircuitboard");
		public static final Item card = new ItemBase("card");
		public static final Item proc_base = new ItemBase("proc_base");
		public static final Item proc_raw_1 = new ItemBase("proc_raw_1");
		public static final Item proc_raw_2 = new ItemBase("proc_raw_2");
		public static final Item proc_raw_3 = new ItemBase("proc_raw_3");
		public static final Item proc_1 = new ItemBase("proc_1");
		public static final Item proc_2 = new ItemBase("proc_2");
		public static final Item proc_3 = new ItemBase("proc_3");
		public static final Item chip1 = new ItemBase("chip1");
		public static final Item chip2 = new ItemBase("chip2");
		public static final Item chip3 = new ItemBase("chip3");
		public static final Item componentbus1 = new ItemBase("componentbus1");
		public static final Item componentbus2 = new ItemBase("componentbus2");
		public static final Item componentbus3 = new ItemBase("componentbus3");
		public static final Item cpu1 = new ItemBase("cpu1");
		public static final Item cpu2 = new ItemBase("cpu2");
		public static final Item cpu3 = new ItemBase("cpu3");
		public static final Item datacard1 = new ItemBase("datacard1");
		public static final Item datacard2 = new ItemBase("datacard2");
		public static final Item datacard3 = new ItemBase("datacard3");
		public static final Item graphicscard1 = new ItemBase("graphicscard1");
		public static final Item graphicscard2 = new ItemBase("graphicscard2");
		public static final Item graphicscard3 = new ItemBase("graphicscard3");
		public static final Item hdd1 = new ItemBase("hdd1");
		public static final Item hdd2 = new ItemBase("hdd2");
		public static final Item hdd3 = new ItemBase("hdd3");
		public static final Item ram1 = new ItemBase("ram1");
		public static final Item ram2 = new ItemBase("ram2");
		public static final Item ram3 = new ItemBase("ram3");
		public static final Item server1 = new ItemBase("server1");
		public static final Item server2 = new ItemBase("server2");
		public static final Item server3 = new ItemBase("server3");
		public static final Item terminalserver = new ItemBase("terminalserver");
		public static final Item rf_fe_flux_power_energy = new ItemBase("rf_fe_flux_power_energy");
		public static final Item magic = new ItemBad("magic");

		public static final Item wand_1 = new ItemWand1("wand_1");
		public static final Item wand_2 = new ItemWand2("wand_2");
		public static final Item wand_3 = new ItemWand3("wand_3");
		public static final Item wand_4 = new ItemWand4("wand_4");
		
		public static final Item luck = new ItemGlowing("luck");
		public static final Item nightvision = new ItemGlowing("nightvision");
		public static final Item regeneration = new ItemGlowing("regeneration");
		public static final Item resistance = new ItemGlowing("resistance");
		public static final Item saturation = new ItemGlowing("saturation");
		public static final Item strength = new ItemGlowing("strength");
		public static final Item waterbreathing = new ItemGlowing("waterbreathing");
		public static final Item absorption = new ItemGlowing("absorption");
		public static final Item antidote = new ItemGlowing("antidote");
		public static final Item fireresistance = new ItemGlowing("fireresistance");
		public static final Item glowing = new ItemGlowing("glowing");
		public static final Item haste = new ItemGlowing("haste");
		public static final Item instanthealth = new ItemGlowing("instanthealth");
		public static final Item invisibility = new ItemGlowing("invisibility");
		public static final Item jumpboost = new ItemGlowing("jumpboost");
		public static final Item levitation = new ItemGlowing("levitation");
		public static final Item speed = new ItemGlowing("speed");
		public static final Item thunder = new ItemGlowing("thunder");
		public static final Item paralysis = new ItemGlowing("paralysis");
		public static final Item instantkill = new ItemGlowing("instantkill");
		public static final Item disarm = new ItemGlowing("disarm");
		public static final Item weaken = new ItemGlowing("weaken");
		public static final Item fertilizer = new ItemGlowing("fertilizer");
}
