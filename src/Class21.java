import java.awt.Component;
import javax.imageio.ImageIO;

public class Class21 {

   static short[] aShortArray1;

   static {
      ImageIO.setUseCache(false);
   }

   static void method210(Component component_0) {
      component_0.removeMouseListener(MouseInput.mouse);
      component_0.removeMouseMotionListener(MouseInput.mouse);
      component_0.removeFocusListener(MouseInput.mouse);
      MouseInput.anInt257 = 0;
   }

   static boolean method211() {
      return Class54.aBool21;
   }

   static void method212(int int_0) {
      WorldMapData_Sub1.topContextMenuRow = new ContextMenuRow();
      WorldMapData_Sub1.topContextMenuRow.param0 = Client.menuActionParams0[int_0];
      WorldMapData_Sub1.topContextMenuRow.param1 = Client.menuActionParams1[int_0];
      WorldMapData_Sub1.topContextMenuRow.type = Client.menuTypes[int_0];
      WorldMapData_Sub1.topContextMenuRow.identifier = Client.menuIdentifiers[int_0];
      WorldMapData_Sub1.topContextMenuRow.option = Client.menuOptions[int_0];
   }

   static void method213() {
      ItemContainer.itemContainers = new HashTable(32);
   }

   static int getSmoothNoise2D(int int_0, int int_1) {
      int int_2 = Class40.method260(int_0 - 1, int_1 - 1) + Class40.method260(1 + int_0, int_1 - 1) + Class40.method260(int_0 - 1, int_1 + 1) + Class40.method260(1 + int_0, 1 + int_1);
      int int_3 = Class40.method260(int_0 - 1, int_1) + Class40.method260(1 + int_0, int_1) + Class40.method260(int_0, int_1 - 1) + Class40.method260(int_0, 1 + int_1);
      int int_4 = Class40.method260(int_0, int_1);
      return int_2 / 16 + int_3 / 8 + int_4 / 4;
   }

}
