
package net.mcreator.idk.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.idk.entity.DftergreEntity;
import net.mcreator.idk.client.model.Modelcustom_model;

public class DftergreRenderer extends MobRenderer<DftergreEntity, Modelcustom_model<DftergreEntity>> {
	public DftergreRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DftergreEntity entity) {
		return new ResourceLocation("idk:textures/entities/pic_for_thunmbnail.png");
	}
}
