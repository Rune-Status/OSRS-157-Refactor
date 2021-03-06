import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

public class Class32 {

   static final BigInteger aBigInteger3;
   static final BigInteger aBigInteger4;

   static {
      aBigInteger3 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
      aBigInteger4 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   }

   static BuildType[] method238() {
      return new BuildType[] {BuildType.RC, BuildType.WIP, BuildType.BUILD_LIVE, BuildType.LIVE};
   }

   public static File method239(String string_0, String string_1, int int_0) {
      String string_2 = int_0 == 0 ? "" : "" + int_0;
      WidgetNode.aFile3 = new File(Class51.userHome, "jagex_cl_" + string_0 + "_" + string_1 + string_2 + ".dat");
      String name = null;
      String string_4 = null;
      boolean bool_0 = false;
      File file_4;
      if (WidgetNode.aFile3.exists()) {
         try {
            FileOnDisk disk = new FileOnDisk(WidgetNode.aFile3, "rw", 10000L);

            Buffer buffer;
            int data;
            for (buffer = new Buffer((int)disk.length()); buffer.position < buffer.buffer.length; buffer.position += data) {
               data = disk.read(buffer.buffer, buffer.position, buffer.buffer.length - buffer.position);
               if (data == -1) {
                  throw new IOException();
               }
            }

            buffer.position = 0;
            data = buffer.getUnsignedByte();
            if (data < 1 || data > 3) {
               throw new IOException("" + data);
            }

            int type = 0;
            if (data > 1) {
               type = buffer.getUnsignedByte();
            }

            if (data <= 2) {
               name = buffer.getJagString();
               if (type == 1) {
                  string_4 = buffer.getJagString();
               }
            } else {
               name = buffer.getCESU8();
               if (type == 1) {
                  string_4 = buffer.getCESU8();
               }
            }

            disk.close();
         } catch (IOException ioexception_0) {
            ioexception_0.printStackTrace();
         }

         if (name != null) {
            file_4 = new File(name);
            if (!file_4.exists()) {
               name = null;
            }
         }

         if (name != null) {
            file_4 = new File(name, "test.dat");
            if (!WorldMapType3.method574(file_4, true)) {
               name = null;
            }
         }
      }

      if (name == null && int_0 == 0) {
         label124:
         for (int int_3 = 0; int_3 < Class64.aStringArray2.length; int_3++) {
            for (int int_4 = 0; int_4 < WorldMapData_Sub1.cacheLocations.length; int_4++) {
               File file_0 = new File(WorldMapData_Sub1.cacheLocations[int_4] + Class64.aStringArray2[int_3] + File.separatorChar + string_0 + File.separatorChar);
               if (file_0.exists() && WorldMapType3.method574(new File(file_0, "test.dat"), true)) {
                  name = file_0.toString();
                  bool_0 = true;
                  break label124;
               }
            }
         }
      }

      if (name == null) {
         name = Class51.userHome + File.separatorChar + "jagexcache" + string_2 + File.separatorChar + string_0 + File.separatorChar + string_1 + File.separatorChar;
         bool_0 = true;
      }

      if (string_4 != null) {
         File file_3 = new File(string_4);
         file_4 = new File(name);

         try {
            File[] files_1 = file_3.listFiles();
            File[] files_0 = files_1;

            for (int int_5 = 0; int_5 < files_0.length; int_5++) {
               File file_1 = files_0[int_5];
               File file_2 = new File(file_4, file_1.getName());
               boolean bool_1 = file_1.renameTo(file_2);
               if (!bool_1) {
                  throw new IOException();
               }
            }
         } catch (Exception exception_0) {
            exception_0.printStackTrace();
         }

         bool_0 = true;
      }

      if (bool_0) {
         Class36.method249(new File(name), (File) null);
      }

      return new File(name);
   }

}
