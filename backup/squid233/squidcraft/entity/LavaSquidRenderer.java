package io.github.squid233.squidcraft.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.SquidEntityModel;
import net.minecraft.util.Identifier;

public class LavaSquidRenderer extends MobEntityRenderer<LavaSquidEntity, SquidEntityModel<LavaSquidEntity>> {

    public LavaSquidRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new SquidEntityModel<>(), 0.7F);
    }

    @Override
    public Identifier getTexture(LavaSquidEntity entity) {
        return new Identifier("textures/entity/squid.png");
    }
}
