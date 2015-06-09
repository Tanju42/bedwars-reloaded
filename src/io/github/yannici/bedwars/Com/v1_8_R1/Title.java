package io.github.yannici.bedwars.Com.v1_8_R1;

import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R1.ChatSerializer;
import net.minecraft.server.v1_8_R1.IChatBaseComponent;
import net.minecraft.server.v1_8_R1.PacketPlayOutTitle;
import net.minecraft.server.v1_8_R1.EnumTitleAction;

public class Title {
	
	public static void showTitle(Player player, String title, double fadeIn, double fadeOut, double stay) {
		IChatBaseComponent titleComponent = ChatSerializer.a("{\"text\": \"" + title + "\"}");
		
		PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(EnumTitleAction.TITLE, titleComponent);
		PacketPlayOutTitle timesPacket = new PacketPlayOutTitle(EnumTitleAction.TIMES, null, (int) Math.round(fadeIn*20), (int) Math.round(stay*20), (int) Math.round(fadeOut*20));
		
		((CraftPlayer) player).getHandle().playerConnection.sendPacket(timesPacket);
		((CraftPlayer) player).getHandle().playerConnection.sendPacket(titlePacket);
	}
	
	public static void showSubTitle(Player player, String subTitle, double fadeIn, double fadeOut, double stay) {
		IChatBaseComponent subTitleComponent = ChatSerializer.a("{\"text\": \"" + subTitle + "\"}");
		
		PacketPlayOutTitle subTitlePacket = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, subTitleComponent);
		PacketPlayOutTitle timesPacket = new PacketPlayOutTitle(EnumTitleAction.TIMES, null, (int) Math.round(fadeIn*20.0), (int) Math.round(stay*20.0), (int) Math.round(fadeOut*20.0));
		
		((CraftPlayer) player).getHandle().playerConnection.sendPacket(timesPacket);
		((CraftPlayer) player).getHandle().playerConnection.sendPacket(subTitlePacket);
	}
	
}