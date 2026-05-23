package com.mbest700.manager;
import com.mbest700.modules.Module;
import java.util.ArrayList;
public class ModuleManager {
public static ArrayList<Module> modules = new ArrayList<>();
public static void init() {
// Buraya 80 modülü ekleyeceksin
for(int i = 0; i < 80; i++) {
modules.add(new Module("Module " + i) {
@Override public void onTick() {}
});
}
}
}

