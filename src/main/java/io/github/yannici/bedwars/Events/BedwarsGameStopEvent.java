package io.github.yannici.bedwars.Events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import io.github.yannici.bedwars.Game.Game;

public class BedwarsGameStopEvent extends Event {

  private static final HandlerList handlers = new HandlerList();
  private Game game = null;

  public BedwarsGameStopEvent(Game game) {
    this.game = game;
  }

  @Override
  public HandlerList getHandlers() {
    return BedwarsGameStopEvent.handlers;
  }

  public static HandlerList getHandlerList() {
    return BedwarsGameStopEvent.handlers;
  }

  public Game getGame() {
    return this.game;
  }

}
