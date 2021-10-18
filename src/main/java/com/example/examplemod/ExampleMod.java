package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod {
  private static final Logger LOGGER = LogManager.getLogger();
  public static final String MOD_ID = "examplemod";

  public ExampleMod() { }
}
