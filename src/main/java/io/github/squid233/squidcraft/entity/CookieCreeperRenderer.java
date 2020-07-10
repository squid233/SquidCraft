package io.github.squid233.squidcraft.entity;

import io.github.squid233.squidcraft.SquidCraft;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.util.Identifier;

public class CookieCreeperRenderer extends MobEntityRenderer<CookieCreeperEntity, CreeperEntityModel<CookieCreeperEntity>> {
    public CookieCreeperRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CreeperEntityModel<>(), 1);
    }

    @Override
    public Identifier getTexture(CookieCreeperEntity cookieCreeperEntity) {
        return new Identifier(SquidCraft.MODID+":textures/entity/cookie_creeper/creeper.png");
    }
}
