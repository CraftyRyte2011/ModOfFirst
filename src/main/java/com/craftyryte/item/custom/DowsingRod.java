package com.craftyryte.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class DowsingRod extends Item {
    public DowsingRod(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        user.sendMessage(Text.of("Successfully Killed Entity: " + entity.getEntityName()), false);
        entity.kill();
        return super.useOnEntity(stack, user, entity, hand);
    }
}
