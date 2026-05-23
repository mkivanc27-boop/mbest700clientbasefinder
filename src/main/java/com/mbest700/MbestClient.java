package com.mbest700;
import com.mbest700.manager.ModuleManager;
import net.fabricmc.api.ModInitializer;
public class MbestClient implements ModInitializer {
@Override
public void onInitialize() {
ModuleManager.init();
System.out.println("Mbest700 Initialized - Private Mode");
}
}

