import java.util.HashMap;
import java.util.Map;

public class Class34 {

   static int anInt94;
   static final Map chatLineMap;
   static final IterableHashTable anIterableHashTable1;
   static final Class77 aClass77_1;
   static IndexData indexSprites;
   static int playerPin;

   static {
      chatLineMap = new HashMap();
      anIterableHashTable1 = new IterableHashTable(1024);
      aClass77_1 = new Class77();
      anInt94 = 0;
   }

   static void sendGameMessage(int int_0, String string_0, String string_1) {
      DynamicObject.addChatMessage(int_0, string_0, string_1, (String) null);
   }

   static String method243(int int_0) {
      return int_0 < 999999999 ? Integer.toString(int_0) : "*";
   }

}