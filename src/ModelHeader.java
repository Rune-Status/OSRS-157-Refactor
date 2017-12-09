public class ModelHeader extends Renderable {

   static int[] anIntArray138;
   static int[] anIntArray139;
   static int[] anIntArray140;
   static int[] anIntArray141;
   static int anInt570;
   boolean aBool76;
   int[] vertexSkins;
   VertexNormal[] normals;
   int[] vertexX;
   int vertexCount;
   short[] faceTextures;
   int triangleCount;
   int anInt571;
   int[] triangleSkinValues;
   int[] vertexY;
   int[] vertexZ;
   short[] triangleColours;
   byte[] faceRenderType;
   VertexNormal[] aVertexNormalArray1;
   int anInt572;
   int anInt573;
   FaceNormal[] faceNormals;
   int[] trianglePointsX;
   int[][] anIntArrayArray19;
   int anInt574;
   byte priority;
   int[][] anIntArrayArray20;
   int[] trianglePointsZ;
   int anInt575;
   int anInt576;
   int[] trianglePointsY;
   public short aShort2;
   byte[] textureCoords;
   public short contrast;
   byte[] faceAlphas;
   byte[] textureRenderTypes;
   byte[] faceRenderPriorities;
   short[] texTriangleX;
   short[] texTriangleY;
   short[] texTriangleZ;
   short[] aShortArray13;
   short[] aShortArray14;
   short[] aShortArray15;
   short[] aShortArray16;
   byte[] aByteArray27;
   short[] aShortArray17;
   short[] texturePrimaryColor;

   static {
      anIntArray139 = new int[10000];
      anIntArray141 = new int[10000];
      anInt570 = 0;
      anIntArray138 = Graphics3D.SINE;
      anIntArray140 = Graphics3D.COSINE;
   }

   ModelHeader() {
      this.vertexCount = 0;
      this.triangleCount = 0;
      this.priority = 0;
      this.aBool76 = false;
   }

   public ModelHeader(ModelHeader[] modeldatas_0, int int_0) {
      this.vertexCount = 0;
      this.triangleCount = 0;
      this.priority = 0;
      this.aBool76 = false;
      boolean bool_0 = false;
      boolean bool_1 = false;
      boolean bool_2 = false;
      boolean bool_3 = false;
      boolean bool_4 = false;
      boolean bool_5 = false;
      this.vertexCount = 0;
      this.triangleCount = 0;
      this.anInt576 = 0;
      this.priority = -1;

      int int_1;
      ModelHeader modeldata_1;
      for (int_1 = 0; int_1 < int_0; int_1++) {
         modeldata_1 = modeldatas_0[int_1];
         if (modeldata_1 != null) {
            this.vertexCount += modeldata_1.vertexCount;
            this.triangleCount += modeldata_1.triangleCount;
            this.anInt576 += modeldata_1.anInt576;
            if (modeldata_1.faceRenderPriorities != null) {
               bool_1 = true;
            } else {
               if (this.priority == -1) {
                  this.priority = modeldata_1.priority;
               }

               if (this.priority != modeldata_1.priority) {
                  bool_1 = true;
               }
            }

            bool_0 |= modeldata_1.faceRenderType != null;
            bool_2 |= modeldata_1.faceAlphas != null;
            bool_3 |= modeldata_1.triangleSkinValues != null;
            bool_4 |= modeldata_1.faceTextures != null;
            bool_5 |= modeldata_1.textureCoords != null;
         }
      }

      this.vertexX = new int[this.vertexCount];
      this.vertexY = new int[this.vertexCount];
      this.vertexZ = new int[this.vertexCount];
      this.vertexSkins = new int[this.vertexCount];
      this.trianglePointsX = new int[this.triangleCount];
      this.trianglePointsY = new int[this.triangleCount];
      this.trianglePointsZ = new int[this.triangleCount];
      if (bool_0) {
         this.faceRenderType = new byte[this.triangleCount];
      }

      if (bool_1) {
         this.faceRenderPriorities = new byte[this.triangleCount];
      }

      if (bool_2) {
         this.faceAlphas = new byte[this.triangleCount];
      }

      if (bool_3) {
         this.triangleSkinValues = new int[this.triangleCount];
      }

      if (bool_4) {
         this.faceTextures = new short[this.triangleCount];
      }

      if (bool_5) {
         this.textureCoords = new byte[this.triangleCount];
      }

      this.triangleColours = new short[this.triangleCount];
      if (this.anInt576 > 0) {
         this.textureRenderTypes = new byte[this.anInt576];
         this.texTriangleX = new short[this.anInt576];
         this.texTriangleY = new short[this.anInt576];
         this.texTriangleZ = new short[this.anInt576];
         this.aShortArray13 = new short[this.anInt576];
         this.aShortArray14 = new short[this.anInt576];
         this.aShortArray15 = new short[this.anInt576];
         this.aShortArray16 = new short[this.anInt576];
         this.aByteArray27 = new byte[this.anInt576];
         this.aShortArray17 = new short[this.anInt576];
         this.texturePrimaryColor = new short[this.anInt576];
      }

      this.vertexCount = 0;
      this.triangleCount = 0;
      this.anInt576 = 0;

      for (int_1 = 0; int_1 < int_0; int_1++) {
         modeldata_1 = modeldatas_0[int_1];
         if (modeldata_1 != null) {
            int int_2;
            for (int_2 = 0; int_2 < modeldata_1.triangleCount; int_2++) {
               if (bool_0 && modeldata_1.faceRenderType != null) {
                  this.faceRenderType[this.triangleCount] = modeldata_1.faceRenderType[int_2];
               }

               if (bool_1) {
                  if (modeldata_1.faceRenderPriorities != null) {
                     this.faceRenderPriorities[this.triangleCount] = modeldata_1.faceRenderPriorities[int_2];
                  } else {
                     this.faceRenderPriorities[this.triangleCount] = modeldata_1.priority;
                  }
               }

               if (bool_2 && modeldata_1.faceAlphas != null) {
                  this.faceAlphas[this.triangleCount] = modeldata_1.faceAlphas[int_2];
               }

               if (bool_3 && modeldata_1.triangleSkinValues != null) {
                  this.triangleSkinValues[this.triangleCount] = modeldata_1.triangleSkinValues[int_2];
               }

               if (bool_4) {
                  if (modeldata_1.faceTextures != null) {
                     this.faceTextures[this.triangleCount] = modeldata_1.faceTextures[int_2];
                  } else {
                     this.faceTextures[this.triangleCount] = -1;
                  }
               }

               if (bool_5) {
                  if (modeldata_1.textureCoords != null && modeldata_1.textureCoords[int_2] != -1) {
                     this.textureCoords[this.triangleCount] = (byte)(this.anInt576 + modeldata_1.textureCoords[int_2]);
                  } else {
                     this.textureCoords[this.triangleCount] = -1;
                  }
               }

               this.triangleColours[this.triangleCount] = modeldata_1.triangleColours[int_2];
               this.trianglePointsX[this.triangleCount] = this.method1059(modeldata_1, modeldata_1.trianglePointsX[int_2]);
               this.trianglePointsY[this.triangleCount] = this.method1059(modeldata_1, modeldata_1.trianglePointsY[int_2]);
               this.trianglePointsZ[this.triangleCount] = this.method1059(modeldata_1, modeldata_1.trianglePointsZ[int_2]);
               ++this.triangleCount;
            }

            for (int_2 = 0; int_2 < modeldata_1.anInt576; int_2++) {
               byte byte_0 = this.textureRenderTypes[this.anInt576] = modeldata_1.textureRenderTypes[int_2];
               if (byte_0 == 0) {
                  this.texTriangleX[this.anInt576] = (short)this.method1059(modeldata_1, modeldata_1.texTriangleX[int_2]);
                  this.texTriangleY[this.anInt576] = (short)this.method1059(modeldata_1, modeldata_1.texTriangleY[int_2]);
                  this.texTriangleZ[this.anInt576] = (short)this.method1059(modeldata_1, modeldata_1.texTriangleZ[int_2]);
               }

               if (byte_0 >= 1 && byte_0 <= 3) {
                  this.texTriangleX[this.anInt576] = modeldata_1.texTriangleX[int_2];
                  this.texTriangleY[this.anInt576] = modeldata_1.texTriangleY[int_2];
                  this.texTriangleZ[this.anInt576] = modeldata_1.texTriangleZ[int_2];
                  this.aShortArray13[this.anInt576] = modeldata_1.aShortArray13[int_2];
                  this.aShortArray14[this.anInt576] = modeldata_1.aShortArray14[int_2];
                  this.aShortArray15[this.anInt576] = modeldata_1.aShortArray15[int_2];
                  this.aShortArray16[this.anInt576] = modeldata_1.aShortArray16[int_2];
                  this.aByteArray27[this.anInt576] = modeldata_1.aByteArray27[int_2];
                  this.aShortArray17[this.anInt576] = modeldata_1.aShortArray17[int_2];
               }

               if (byte_0 == 2) {
                  this.texturePrimaryColor[this.anInt576] = modeldata_1.texturePrimaryColor[int_2];
               }

               ++this.anInt576;
            }
         }
      }

   }

   ModelHeader(byte[] data) {
      this.vertexCount = 0;
      this.triangleCount = 0;
      this.priority = 0;
      this.aBool76 = false;
      if (data[data.length - 1] == -1 && data[data.length - 2] == -1) {
         this.decodeNewFormat(data);
      } else {
         this.decodeOldFormat(data);
      }

   }

   public ModelHeader(ModelHeader modeldata_1, boolean bool_0, boolean bool_1, boolean bool_2, boolean bool_3) {
      this.vertexCount = 0;
      this.triangleCount = 0;
      this.priority = 0;
      this.aBool76 = false;
      this.vertexCount = modeldata_1.vertexCount;
      this.triangleCount = modeldata_1.triangleCount;
      this.anInt576 = modeldata_1.anInt576;
      int int_0;
      if (bool_0) {
         this.vertexX = modeldata_1.vertexX;
         this.vertexY = modeldata_1.vertexY;
         this.vertexZ = modeldata_1.vertexZ;
      } else {
         this.vertexX = new int[this.vertexCount];
         this.vertexY = new int[this.vertexCount];
         this.vertexZ = new int[this.vertexCount];

         for (int_0 = 0; int_0 < this.vertexCount; int_0++) {
            this.vertexX[int_0] = modeldata_1.vertexX[int_0];
            this.vertexY[int_0] = modeldata_1.vertexY[int_0];
            this.vertexZ[int_0] = modeldata_1.vertexZ[int_0];
         }
      }

      if (bool_1) {
         this.triangleColours = modeldata_1.triangleColours;
      } else {
         this.triangleColours = new short[this.triangleCount];

         for (int_0 = 0; int_0 < this.triangleCount; int_0++) {
            this.triangleColours[int_0] = modeldata_1.triangleColours[int_0];
         }
      }

      if (!bool_2 && modeldata_1.faceTextures != null) {
         this.faceTextures = new short[this.triangleCount];

         for (int_0 = 0; int_0 < this.triangleCount; int_0++) {
            this.faceTextures[int_0] = modeldata_1.faceTextures[int_0];
         }
      } else {
         this.faceTextures = modeldata_1.faceTextures;
      }

      this.faceAlphas = modeldata_1.faceAlphas;
      this.trianglePointsX = modeldata_1.trianglePointsX;
      this.trianglePointsY = modeldata_1.trianglePointsY;
      this.trianglePointsZ = modeldata_1.trianglePointsZ;
      this.faceRenderType = modeldata_1.faceRenderType;
      this.faceRenderPriorities = modeldata_1.faceRenderPriorities;
      this.textureCoords = modeldata_1.textureCoords;
      this.priority = modeldata_1.priority;
      this.textureRenderTypes = modeldata_1.textureRenderTypes;
      this.texTriangleX = modeldata_1.texTriangleX;
      this.texTriangleY = modeldata_1.texTriangleY;
      this.texTriangleZ = modeldata_1.texTriangleZ;
      this.aShortArray13 = modeldata_1.aShortArray13;
      this.aShortArray14 = modeldata_1.aShortArray14;
      this.aShortArray15 = modeldata_1.aShortArray15;
      this.aShortArray16 = modeldata_1.aShortArray16;
      this.aByteArray27 = modeldata_1.aByteArray27;
      this.aShortArray17 = modeldata_1.aShortArray17;
      this.texturePrimaryColor = modeldata_1.texturePrimaryColor;
      this.vertexSkins = modeldata_1.vertexSkins;
      this.triangleSkinValues = modeldata_1.triangleSkinValues;
      this.anIntArrayArray19 = modeldata_1.anIntArrayArray19;
      this.anIntArrayArray20 = modeldata_1.anIntArrayArray20;
      this.normals = modeldata_1.normals;
      this.faceNormals = modeldata_1.faceNormals;
      this.aVertexNormalArray1 = modeldata_1.aVertexNormalArray1;
      this.aShort2 = modeldata_1.aShort2;
      this.contrast = modeldata_1.contrast;
   }

   void method1047() {
      if (!this.aBool76) {
         super.modelHeight = 0;
         this.anInt573 = 0;
         this.anInt571 = 999999;
         this.anInt572 = -999999;
         this.anInt575 = -99999;
         this.anInt574 = 99999;

         for (int int_0 = 0; int_0 < this.vertexCount; int_0++) {
            int int_1 = this.vertexX[int_0];
            int int_2 = this.vertexY[int_0];
            int int_3 = this.vertexZ[int_0];
            if (int_1 < this.anInt571) {
               this.anInt571 = int_1;
            }

            if (int_1 > this.anInt572) {
               this.anInt572 = int_1;
            }

            if (int_3 < this.anInt574) {
               this.anInt574 = int_3;
            }

            if (int_3 > this.anInt575) {
               this.anInt575 = int_3;
            }

            if (-int_2 > super.modelHeight) {
               super.modelHeight = -int_2;
            }

            if (int_2 > this.anInt573) {
               this.anInt573 = int_2;
            }
         }

         this.aBool76 = true;
      }
   }

   public void computeNormals() {
      if (this.normals == null) {
         this.normals = new VertexNormal[this.vertexCount];

         int int_0;
         for (int_0 = 0; int_0 < this.vertexCount; int_0++) {
            this.normals[int_0] = new VertexNormal();
         }

         for (int_0 = 0; int_0 < this.triangleCount; int_0++) {
            int int_1 = this.trianglePointsX[int_0];
            int int_2 = this.trianglePointsY[int_0];
            int int_3 = this.trianglePointsZ[int_0];
            int int_4 = this.vertexX[int_2] - this.vertexX[int_1];
            int int_5 = this.vertexY[int_2] - this.vertexY[int_1];
            int int_6 = this.vertexZ[int_2] - this.vertexZ[int_1];
            int int_7 = this.vertexX[int_3] - this.vertexX[int_1];
            int int_8 = this.vertexY[int_3] - this.vertexY[int_1];
            int int_9 = this.vertexZ[int_3] - this.vertexZ[int_1];
            int int_10 = int_5 * int_9 - int_8 * int_6;
            int int_11 = int_6 * int_7 - int_9 * int_4;

            int int_12;
            for (int_12 = int_4 * int_8 - int_7 * int_5; int_10 > 8192 || int_11 > 8192 || int_12 > 8192 || int_10 < -8192 || int_11 < -8192 || int_12 < -8192; int_12 >>= 1) {
               int_10 >>= 1;
               int_11 >>= 1;
            }

            int int_13 = (int)Math.sqrt((double)(int_10 * int_10 + int_11 * int_11 + int_12 * int_12));
            if (int_13 <= 0) {
               int_13 = 1;
            }

            int_10 = int_10 * 256 / int_13;
            int_11 = int_11 * 256 / int_13;
            int_12 = int_12 * 256 / int_13;
            byte byte_0;
            if (this.faceRenderType == null) {
               byte_0 = 0;
            } else {
               byte_0 = this.faceRenderType[int_0];
            }

            if (byte_0 == 0) {
               VertexNormal vertexnormal_0 = this.normals[int_1];
               vertexnormal_0.x += int_10;
               vertexnormal_0.y += int_11;
               vertexnormal_0.z += int_12;
               ++vertexnormal_0.magnitude;
               vertexnormal_0 = this.normals[int_2];
               vertexnormal_0.x += int_10;
               vertexnormal_0.y += int_11;
               vertexnormal_0.z += int_12;
               ++vertexnormal_0.magnitude;
               vertexnormal_0 = this.normals[int_3];
               vertexnormal_0.x += int_10;
               vertexnormal_0.y += int_11;
               vertexnormal_0.z += int_12;
               ++vertexnormal_0.magnitude;
            } else if (byte_0 == 1) {
               if (this.faceNormals == null) {
                  this.faceNormals = new FaceNormal[this.triangleCount];
               }

               FaceNormal facenormal_0 = this.faceNormals[int_0] = new FaceNormal();
               facenormal_0.x = int_10;
               facenormal_0.y = int_11;
               facenormal_0.z = int_12;
            }
         }

      }
   }

   void clean() {
      this.normals = null;
      this.aVertexNormalArray1 = null;
      this.faceNormals = null;
      this.aBool76 = false;
   }

   public ModelHeader method1049() {
      ModelHeader modeldata_1 = new ModelHeader();
      if (this.faceRenderType != null) {
         modeldata_1.faceRenderType = new byte[this.triangleCount];

         for (int int_0 = 0; int_0 < this.triangleCount; int_0++) {
            modeldata_1.faceRenderType[int_0] = this.faceRenderType[int_0];
         }
      }

      modeldata_1.vertexCount = this.vertexCount;
      modeldata_1.triangleCount = this.triangleCount;
      modeldata_1.anInt576 = this.anInt576;
      modeldata_1.vertexX = this.vertexX;
      modeldata_1.vertexY = this.vertexY;
      modeldata_1.vertexZ = this.vertexZ;
      modeldata_1.trianglePointsX = this.trianglePointsX;
      modeldata_1.trianglePointsY = this.trianglePointsY;
      modeldata_1.trianglePointsZ = this.trianglePointsZ;
      modeldata_1.faceRenderPriorities = this.faceRenderPriorities;
      modeldata_1.faceAlphas = this.faceAlphas;
      modeldata_1.textureCoords = this.textureCoords;
      modeldata_1.triangleColours = this.triangleColours;
      modeldata_1.faceTextures = this.faceTextures;
      modeldata_1.priority = this.priority;
      modeldata_1.textureRenderTypes = this.textureRenderTypes;
      modeldata_1.texTriangleX = this.texTriangleX;
      modeldata_1.texTriangleY = this.texTriangleY;
      modeldata_1.texTriangleZ = this.texTriangleZ;
      modeldata_1.aShortArray13 = this.aShortArray13;
      modeldata_1.aShortArray14 = this.aShortArray14;
      modeldata_1.aShortArray15 = this.aShortArray15;
      modeldata_1.aShortArray16 = this.aShortArray16;
      modeldata_1.aByteArray27 = this.aByteArray27;
      modeldata_1.aShortArray17 = this.aShortArray17;
      modeldata_1.texturePrimaryColor = this.texturePrimaryColor;
      modeldata_1.vertexSkins = this.vertexSkins;
      modeldata_1.triangleSkinValues = this.triangleSkinValues;
      modeldata_1.anIntArrayArray19 = this.anIntArrayArray19;
      modeldata_1.anIntArrayArray20 = this.anIntArrayArray20;
      modeldata_1.normals = this.normals;
      modeldata_1.faceNormals = this.faceNormals;
      modeldata_1.aShort2 = this.aShort2;
      modeldata_1.contrast = this.contrast;
      return modeldata_1;
   }

   public void recolor(short src, short dest) {
      for (int triangle = 0; triangle < this.triangleCount; triangle++)
         if (this.triangleColours[triangle] == src)
            this.triangleColours[triangle] = dest;

   }

   public void scaleTriangle(int x, int y, int z) {
      for (int vertex = 0; vertex < this.vertexCount; vertex++) {
         this.vertexX[vertex] = this.vertexX[vertex] * x / 128;
         this.vertexY[vertex] = y * this.vertexY[vertex] / 128;
         this.vertexZ[vertex] = z * this.vertexZ[vertex] / 128;
      }

      this.clean();
   }

   void decodeOldFormat(byte[] bytes_0) {
      boolean bool_0 = false;
      boolean bool_1 = false;
      Buffer buffer_0 = new Buffer(bytes_0);
      Buffer buffer_1 = new Buffer(bytes_0);
      Buffer buffer_2 = new Buffer(bytes_0);
      Buffer buffer_3 = new Buffer(bytes_0);
      Buffer buffer_4 = new Buffer(bytes_0);
      buffer_0.position = bytes_0.length - 18;
      int int_0 = buffer_0.getUnsignedShort();
      int int_1 = buffer_0.getUnsignedShort();
      int int_2 = buffer_0.getUnsignedByte();
      int int_3 = buffer_0.getUnsignedByte();
      int int_4 = buffer_0.getUnsignedByte();
      int int_5 = buffer_0.getUnsignedByte();
      int int_6 = buffer_0.getUnsignedByte();
      int int_7 = buffer_0.getUnsignedByte();
      int int_9 = buffer_0.getUnsignedShort();
      int int_10 = buffer_0.getUnsignedShort();
      int int_11 = buffer_0.getUnsignedShort();
      int int_12 = buffer_0.getUnsignedShort();
      byte byte_0 = 0;
      int int_34 = byte_0 + int_0;
      int int_13 = int_34;
      int_34 += int_1;
      int int_14 = int_34;
      if (int_4 == 255) {
         int_34 += int_1;
      }

      int int_15 = int_34;
      if (int_6 == 1) {
         int_34 += int_1;
      }

      int int_16 = int_34;
      if (int_3 == 1) {
         int_34 += int_1;
      }

      int int_17 = int_34;
      if (int_7 == 1) {
         int_34 += int_0;
      }

      int int_18 = int_34;
      if (int_5 == 1) {
         int_34 += int_1;
      }

      int int_19 = int_34;
      int_34 += int_12;
      int int_20 = int_34;
      int_34 += int_1 * 2;
      int int_21 = int_34;
      int_34 += int_2 * 6;
      int int_22 = int_34;
      int_34 += int_9;
      int int_23 = int_34;
      int_34 += int_10;
      int int_8 = int_34 + int_11;
      this.vertexCount = int_0;
      this.triangleCount = int_1;
      this.anInt576 = int_2;
      this.vertexX = new int[int_0];
      this.vertexY = new int[int_0];
      this.vertexZ = new int[int_0];
      this.trianglePointsX = new int[int_1];
      this.trianglePointsY = new int[int_1];
      this.trianglePointsZ = new int[int_1];
      if (int_2 > 0) {
         this.textureRenderTypes = new byte[int_2];
         this.texTriangleX = new short[int_2];
         this.texTriangleY = new short[int_2];
         this.texTriangleZ = new short[int_2];
      }

      if (int_7 == 1) {
         this.vertexSkins = new int[int_0];
      }

      if (int_3 == 1) {
         this.faceRenderType = new byte[int_1];
         this.textureCoords = new byte[int_1];
         this.faceTextures = new short[int_1];
      }

      if (int_4 == 255) {
         this.faceRenderPriorities = new byte[int_1];
      } else {
         this.priority = (byte)int_4;
      }

      if (int_5 == 1) {
         this.faceAlphas = new byte[int_1];
      }

      if (int_6 == 1) {
         this.triangleSkinValues = new int[int_1];
      }

      this.triangleColours = new short[int_1];
      buffer_0.position = byte_0;
      buffer_1.position = int_22;
      buffer_2.position = int_23;
      buffer_3.position = int_34;
      buffer_4.position = int_17;
      int int_24 = 0;
      int int_25 = 0;
      int int_26 = 0;

      int int_27;
      int int_28;
      int int_29;
      int int_30;
      int int_31;
      for (int_27 = 0; int_27 < int_0; int_27++) {
         int_28 = buffer_0.getUnsignedByte();
         int_29 = 0;
         if ((int_28 & 0x1) != 0) {
            int_29 = buffer_1.readShortSmart();
         }

         int_30 = 0;
         if ((int_28 & 0x2) != 0) {
            int_30 = buffer_2.readShortSmart();
         }

         int_31 = 0;
         if ((int_28 & 0x4) != 0) {
            int_31 = buffer_3.readShortSmart();
         }

         this.vertexX[int_27] = int_24 + int_29;
         this.vertexY[int_27] = int_25 + int_30;
         this.vertexZ[int_27] = int_26 + int_31;
         int_24 = this.vertexX[int_27];
         int_25 = this.vertexY[int_27];
         int_26 = this.vertexZ[int_27];
         if (int_7 == 1) {
            this.vertexSkins[int_27] = buffer_4.getUnsignedByte();
         }
      }

      buffer_0.position = int_20;
      buffer_1.position = int_16;
      buffer_2.position = int_14;
      buffer_3.position = int_18;
      buffer_4.position = int_15;

      for (int_27 = 0; int_27 < int_1; int_27++) {
         this.triangleColours[int_27] = (short)buffer_0.getUnsignedShort();
         if (int_3 == 1) {
            int_28 = buffer_1.getUnsignedByte();
            if ((int_28 & 0x1) == 1) {
               this.faceRenderType[int_27] = 1;
               bool_0 = true;
            } else {
               this.faceRenderType[int_27] = 0;
            }

            if ((int_28 & 0x2) == 2) {
               this.textureCoords[int_27] = (byte)(int_28 >> 2);
               this.faceTextures[int_27] = this.triangleColours[int_27];
               this.triangleColours[int_27] = 127;
               if (this.faceTextures[int_27] != -1) {
                  bool_1 = true;
               }
            } else {
               this.textureCoords[int_27] = -1;
               this.faceTextures[int_27] = -1;
            }
         }

         if (int_4 == 255) {
            this.faceRenderPriorities[int_27] = buffer_2.readByte();
         }

         if (int_5 == 1) {
            this.faceAlphas[int_27] = buffer_3.readByte();
         }

         if (int_6 == 1) {
            this.triangleSkinValues[int_27] = buffer_4.getUnsignedByte();
         }
      }

      buffer_0.position = int_19;
      buffer_1.position = int_13;
      int_27 = 0;
      int_28 = 0;
      int_29 = 0;
      int_30 = 0;

      int int_32;
      int int_33;
      for (int_31 = 0; int_31 < int_1; int_31++) {
         int_32 = buffer_1.getUnsignedByte();
         if (int_32 == 1) {
            int_27 = buffer_0.readShortSmart() + int_30;
            int_28 = buffer_0.readShortSmart() + int_27;
            int_29 = buffer_0.readShortSmart() + int_28;
            int_30 = int_29;
            this.trianglePointsX[int_31] = int_27;
            this.trianglePointsY[int_31] = int_28;
            this.trianglePointsZ[int_31] = int_29;
         }

         if (int_32 == 2) {
            int_28 = int_29;
            int_29 = buffer_0.readShortSmart() + int_30;
            int_30 = int_29;
            this.trianglePointsX[int_31] = int_27;
            this.trianglePointsY[int_31] = int_28;
            this.trianglePointsZ[int_31] = int_29;
         }

         if (int_32 == 3) {
            int_27 = int_29;
            int_29 = buffer_0.readShortSmart() + int_30;
            int_30 = int_29;
            this.trianglePointsX[int_31] = int_27;
            this.trianglePointsY[int_31] = int_28;
            this.trianglePointsZ[int_31] = int_29;
         }

         if (int_32 == 4) {
            int_33 = int_27;
            int_27 = int_28;
            int_28 = int_33;
            int_29 = buffer_0.readShortSmart() + int_30;
            int_30 = int_29;
            this.trianglePointsX[int_31] = int_27;
            this.trianglePointsY[int_31] = int_33;
            this.trianglePointsZ[int_31] = int_29;
         }
      }

      buffer_0.position = int_21;

      for (int_31 = 0; int_31 < int_2; int_31++) {
         this.textureRenderTypes[int_31] = 0;
         this.texTriangleX[int_31] = (short)buffer_0.getUnsignedShort();
         this.texTriangleY[int_31] = (short)buffer_0.getUnsignedShort();
         this.texTriangleZ[int_31] = (short)buffer_0.getUnsignedShort();
      }

      if (this.textureCoords != null) {
         boolean bool_2 = false;

         for (int_32 = 0; int_32 < int_1; int_32++) {
            int_33 = this.textureCoords[int_32] & 0xFF;
            if (int_33 != 255) {
               if (this.trianglePointsX[int_32] == (this.texTriangleX[int_33] & 0xFFFF) && this.trianglePointsY[int_32] == (this.texTriangleY[int_33] & 0xFFFF) && this.trianglePointsZ[int_32] == (this.texTriangleZ[int_33] & 0xFFFF)) {
                  this.textureCoords[int_32] = -1;
               } else {
                  bool_2 = true;
               }
            }
         }

         if (!bool_2) {
            this.textureCoords = null;
         }
      }

      if (!bool_1) {
         this.faceTextures = null;
      }

      if (!bool_0) {
         this.faceRenderType = null;
      }

   }

   public void retexture(short src, short dest) {
      if (this.faceTextures != null) {
         for (int triangle = 0; triangle < this.triangleCount; triangle++) {
            if (this.faceTextures[triangle] == src) {
               this.faceTextures[triangle] = dest;
            }
         }
      }
   }

   public Model applyLighting(int lightAmbient, int multiplier, int l_x, int l_y, int l_z) {
      this.computeNormals();
      int lightMagnitude = (int)Math.sqrt((double)(l_z * l_z + l_x * l_x + l_y * l_y));
      int magnitude = lightMagnitude * multiplier >> 8;
      Model model = new Model();
      model.anIntArray131 = new int[this.triangleCount];
      model.anIntArray133 = new int[this.triangleCount];
      model.anIntArray132 = new int[this.triangleCount];
      if (this.anInt576 > 0 && this.textureCoords != null) {
         int[] ints_0 = new int[this.anInt576];

         int triangle;
         for (triangle = 0; triangle < this.triangleCount; triangle++) {
            if (this.textureCoords[triangle] != -1) {
               ++ints_0[this.textureCoords[triangle] & 0xFF];
            }
         }

         model.texturedTriangleCount = 0;

         for (triangle = 0; triangle < this.anInt576; triangle++) {
            if (ints_0[triangle] > 0 && this.textureRenderTypes[triangle] == 0) {
               ++model.texturedTriangleCount;
            }
         }

         model.texturedTrianglePointsX = new int[model.texturedTriangleCount];
         model.texturedTrianglePointsY = new int[model.texturedTriangleCount];
         model.texturedTrianglePointsZ = new int[model.texturedTriangleCount];
         triangle = 0;

         int int_9;
         for (int_9 = 0; int_9 < this.anInt576; int_9++) {
            if (ints_0[int_9] > 0 && this.textureRenderTypes[int_9] == 0) {
               model.texturedTrianglePointsX[triangle] = this.texTriangleX[int_9] & 0xFFFF;
               model.texturedTrianglePointsY[triangle] = this.texTriangleY[int_9] & 0xFFFF;
               model.texturedTrianglePointsZ[triangle] = this.texTriangleZ[int_9] & 0xFFFF;
               ints_0[int_9] = triangle++;
            } else {
               ints_0[int_9] = -1;
            }
         }

         model.aByteArray25 = new byte[this.triangleCount];

         for (int_9 = 0; int_9 < this.triangleCount; int_9++) {
            if (this.textureCoords[int_9] != -1) {
               model.aByteArray25[int_9] = (byte)ints_0[this.textureCoords[int_9] & 0xFF];
            } else {
               model.aByteArray25[int_9] = -1;
            }
         }
      }

      for (int triangle = 0; triangle < this.triangleCount; triangle++) {
         byte byte_0;
         if (this.faceRenderType == null) {
            byte_0 = 0;
         } else {
            byte_0 = this.faceRenderType[triangle];
         }

         byte byte_1;
         if (this.faceAlphas == null) {
            byte_1 = 0;
         } else {
            byte_1 = this.faceAlphas[triangle];
         }

         short short_0;
         if (this.faceTextures == null) {
            short_0 = -1;
         } else {
            short_0 = this.faceTextures[triangle];
         }

         if (byte_1 == -2) {
            byte_0 = 3;
         }

         if (byte_1 == -1) {
            byte_0 = 2;
         }

         VertexNormal vertexNormal;
         int lightness;
         FaceNormal faceNormal;
         if (short_0 == -1) {
            if (byte_0 != 0) {
               if (byte_0 == 1) {
                  faceNormal = this.faceNormals[triangle];
                  lightness = (l_y * faceNormal.y + l_z * faceNormal.z + l_x * faceNormal.x) / (magnitude / 2 + magnitude) + lightAmbient;
                  model.anIntArray131[triangle] = mixLightness(this.triangleColours[triangle] & 0xFFFF, lightness);
                  model.anIntArray132[triangle] = -1;
               } else if (byte_0 == 3) {
                  model.anIntArray131[triangle] = 128;
                  model.anIntArray132[triangle] = -1;
               } else {
                  model.anIntArray132[triangle] = -2;
               }
            } else {
               int int_10 = this.triangleColours[triangle] & 0xFFFF;
               if (this.aVertexNormalArray1 != null && this.aVertexNormalArray1[this.trianglePointsX[triangle]] != null) {
                  vertexNormal = this.aVertexNormalArray1[this.trianglePointsX[triangle]];
               } else {
                  vertexNormal = this.normals[this.trianglePointsX[triangle]];
               }

               lightness = (l_y * vertexNormal.y + l_z * vertexNormal.z + l_x * vertexNormal.x) / (magnitude * vertexNormal.magnitude) + lightAmbient;
               model.anIntArray131[triangle] = mixLightness(int_10, lightness);
               if (this.aVertexNormalArray1 != null && this.aVertexNormalArray1[this.trianglePointsY[triangle]] != null) {
                  vertexNormal = this.aVertexNormalArray1[this.trianglePointsY[triangle]];
               } else {
                  vertexNormal = this.normals[this.trianglePointsY[triangle]];
               }

               lightness = (l_y * vertexNormal.y + l_z * vertexNormal.z + l_x * vertexNormal.x) / (magnitude * vertexNormal.magnitude) + lightAmbient;
               model.anIntArray133[triangle] = mixLightness(int_10, lightness);
               if (this.aVertexNormalArray1 != null && this.aVertexNormalArray1[this.trianglePointsZ[triangle]] != null) {
                  vertexNormal = this.aVertexNormalArray1[this.trianglePointsZ[triangle]];
               } else {
                  vertexNormal = this.normals[this.trianglePointsZ[triangle]];
               }

               lightness = (l_y * vertexNormal.y + l_z * vertexNormal.z + l_x * vertexNormal.x) / (magnitude * vertexNormal.magnitude) + lightAmbient;
               model.anIntArray132[triangle] = mixLightness(int_10, lightness);
            }
         } else if (byte_0 != 0) {
            if (byte_0 == 1) {
               faceNormal = this.faceNormals[triangle];
               lightness = (l_y * faceNormal.y + l_z * faceNormal.z + l_x * faceNormal.x) / (magnitude / 2 + magnitude) + lightAmbient;
               model.anIntArray131[triangle] = method1062(lightness);
               model.anIntArray132[triangle] = -1;
            } else {
               model.anIntArray132[triangle] = -2;
            }
         } else {
            if (this.aVertexNormalArray1 != null && this.aVertexNormalArray1[this.trianglePointsX[triangle]] != null) {
               vertexNormal = this.aVertexNormalArray1[this.trianglePointsX[triangle]];
            } else {
               vertexNormal = this.normals[this.trianglePointsX[triangle]];
            }

            lightness = (l_y * vertexNormal.y + l_z * vertexNormal.z + l_x * vertexNormal.x) / (magnitude * vertexNormal.magnitude) + lightAmbient;
            model.anIntArray131[triangle] = method1062(lightness);
            if (this.aVertexNormalArray1 != null && this.aVertexNormalArray1[this.trianglePointsY[triangle]] != null) {
               vertexNormal = this.aVertexNormalArray1[this.trianglePointsY[triangle]];
            } else {
               vertexNormal = this.normals[this.trianglePointsY[triangle]];
            }

            lightness = (l_y * vertexNormal.y + l_z * vertexNormal.z + l_x * vertexNormal.x) / (magnitude * vertexNormal.magnitude) + lightAmbient;
            model.anIntArray133[triangle] = method1062(lightness);
            if (this.aVertexNormalArray1 != null && this.aVertexNormalArray1[this.trianglePointsZ[triangle]] != null) {
               vertexNormal = this.aVertexNormalArray1[this.trianglePointsZ[triangle]];
            } else {
               vertexNormal = this.normals[this.trianglePointsZ[triangle]];
            }

            lightness = (l_y * vertexNormal.y + l_z * vertexNormal.z + l_x * vertexNormal.x) / (magnitude * vertexNormal.magnitude) + lightAmbient;
            model.anIntArray132[triangle] = method1062(lightness);
         }
      }

      this.computeAnimationTables();
      model.vertexCount = this.vertexCount;
      model.verticesX = this.vertexX;
      model.verticesY = this.vertexY;
      model.verticesZ = this.vertexZ;
      model.triangleCount = this.triangleCount;
      model.indices1 = this.trianglePointsX;
      model.indices2 = this.trianglePointsY;
      model.indices3 = this.trianglePointsZ;
      model.trianglePriorities = this.faceRenderPriorities;
      model.aByteArray23 = this.faceAlphas;
      model.priorityOffset = this.priority;
      model.anIntArrayArray17 = this.anIntArrayArray19;
      model.anIntArrayArray18 = this.anIntArrayArray20;
      model.aShortArray12 = this.faceTextures;
      return model;
   }

   void decodeNewFormat(byte[] bytes_0) {
      Buffer buffer_0 = new Buffer(bytes_0);
      Buffer buffer_1 = new Buffer(bytes_0);
      Buffer buffer_2 = new Buffer(bytes_0);
      Buffer buffer_3 = new Buffer(bytes_0);
      Buffer buffer_4 = new Buffer(bytes_0);
      Buffer buffer_5 = new Buffer(bytes_0);
      Buffer buffer_6 = new Buffer(bytes_0);
      buffer_0.position = bytes_0.length - 23;
      int int_0 = buffer_0.getUnsignedShort();
      int int_1 = buffer_0.getUnsignedShort();
      int int_2 = buffer_0.getUnsignedByte();
      int int_3 = buffer_0.getUnsignedByte();
      int int_4 = buffer_0.getUnsignedByte();
      int int_5 = buffer_0.getUnsignedByte();
      int int_6 = buffer_0.getUnsignedByte();
      int int_7 = buffer_0.getUnsignedByte();
      int int_8 = buffer_0.getUnsignedByte();
      int int_9 = buffer_0.getUnsignedShort();
      int int_10 = buffer_0.getUnsignedShort();
      int int_11 = buffer_0.getUnsignedShort();
      int int_12 = buffer_0.getUnsignedShort();
      int int_13 = buffer_0.getUnsignedShort();
      int int_14 = 0;
      int int_15 = 0;
      int int_16 = 0;
      int int_17;
      if (int_2 > 0) {
         this.textureRenderTypes = new byte[int_2];
         buffer_0.position = 0;

         for (int_17 = 0; int_17 < int_2; int_17++) {
            byte byte_0 = this.textureRenderTypes[int_17] = buffer_0.readByte();
            if (byte_0 == 0) {
               ++int_14;
            }

            if (byte_0 >= 1 && byte_0 <= 3) {
               ++int_15;
            }

            if (byte_0 == 2) {
               ++int_16;
            }
         }
      }

      int_17 = int_2 + int_0;
      int int_18 = int_17;
      if (int_3 == 1) {
         int_17 += int_1;
      }

      int int_19 = int_17;
      int_17 += int_1;
      int int_20 = int_17;
      if (int_4 == 255) {
         int_17 += int_1;
      }

      int int_21 = int_17;
      if (int_6 == 1) {
         int_17 += int_1;
      }

      int int_22 = int_17;
      if (int_8 == 1) {
         int_17 += int_0;
      }

      int int_23 = int_17;
      if (int_5 == 1) {
         int_17 += int_1;
      }

      int int_24 = int_17;
      int_17 += int_12;
      int int_25 = int_17;
      if (int_7 == 1) {
         int_17 += int_1 * 2;
      }

      int int_26 = int_17;
      int_17 += int_13;
      int int_27 = int_17;
      int_17 += int_1 * 2;
      int int_28 = int_17;
      int_17 += int_9;
      int int_29 = int_17;
      int_17 += int_10;
      int int_30 = int_17;
      int_17 += int_11;
      int int_31 = int_17;
      int_17 += int_14 * 6;
      int int_32 = int_17;
      int_17 += int_15 * 6;
      int int_33 = int_17;
      int_17 += int_15 * 6;
      int int_34 = int_17;
      int_17 += int_15 * 2;
      int int_35 = int_17;
      int_17 += int_15;
      int int_36 = int_17;
      int_17 += int_15 * 2 + int_16 * 2;
      this.vertexCount = int_0;
      this.triangleCount = int_1;
      this.anInt576 = int_2;
      this.vertexX = new int[int_0];
      this.vertexY = new int[int_0];
      this.vertexZ = new int[int_0];
      this.trianglePointsX = new int[int_1];
      this.trianglePointsY = new int[int_1];
      this.trianglePointsZ = new int[int_1];
      if (int_8 == 1) {
         this.vertexSkins = new int[int_0];
      }

      if (int_3 == 1) {
         this.faceRenderType = new byte[int_1];
      }

      if (int_4 == 255) {
         this.faceRenderPriorities = new byte[int_1];
      } else {
         this.priority = (byte)int_4;
      }

      if (int_5 == 1) {
         this.faceAlphas = new byte[int_1];
      }

      if (int_6 == 1) {
         this.triangleSkinValues = new int[int_1];
      }

      if (int_7 == 1) {
         this.faceTextures = new short[int_1];
      }

      if (int_7 == 1 && int_2 > 0) {
         this.textureCoords = new byte[int_1];
      }

      this.triangleColours = new short[int_1];
      if (int_2 > 0) {
         this.texTriangleX = new short[int_2];
         this.texTriangleY = new short[int_2];
         this.texTriangleZ = new short[int_2];
         if (int_15 > 0) {
            this.aShortArray13 = new short[int_15];
            this.aShortArray14 = new short[int_15];
            this.aShortArray15 = new short[int_15];
            this.aShortArray16 = new short[int_15];
            this.aByteArray27 = new byte[int_15];
            this.aShortArray17 = new short[int_15];
         }

         if (int_16 > 0) {
            this.texturePrimaryColor = new short[int_16];
         }
      }

      buffer_0.position = int_2;
      buffer_1.position = int_28;
      buffer_2.position = int_29;
      buffer_3.position = int_30;
      buffer_4.position = int_22;
      int int_37 = 0;
      int int_38 = 0;
      int int_39 = 0;

      int int_40;
      int int_41;
      int int_42;
      int int_43;
      int int_44;
      for (int_40 = 0; int_40 < int_0; int_40++) {
         int_41 = buffer_0.getUnsignedByte();
         int_42 = 0;
         if ((int_41 & 0x1) != 0) {
            int_42 = buffer_1.readShortSmart();
         }

         int_43 = 0;
         if ((int_41 & 0x2) != 0) {
            int_43 = buffer_2.readShortSmart();
         }

         int_44 = 0;
         if ((int_41 & 0x4) != 0) {
            int_44 = buffer_3.readShortSmart();
         }

         this.vertexX[int_40] = int_37 + int_42;
         this.vertexY[int_40] = int_38 + int_43;
         this.vertexZ[int_40] = int_39 + int_44;
         int_37 = this.vertexX[int_40];
         int_38 = this.vertexY[int_40];
         int_39 = this.vertexZ[int_40];
         if (int_8 == 1) {
            this.vertexSkins[int_40] = buffer_4.getUnsignedByte();
         }
      }

      buffer_0.position = int_27;
      buffer_1.position = int_18;
      buffer_2.position = int_20;
      buffer_3.position = int_23;
      buffer_4.position = int_21;
      buffer_5.position = int_25;
      buffer_6.position = int_26;

      for (int_40 = 0; int_40 < int_1; int_40++) {
         this.triangleColours[int_40] = (short)buffer_0.getUnsignedShort();
         if (int_3 == 1) {
            this.faceRenderType[int_40] = buffer_1.readByte();
         }

         if (int_4 == 255) {
            this.faceRenderPriorities[int_40] = buffer_2.readByte();
         }

         if (int_5 == 1) {
            this.faceAlphas[int_40] = buffer_3.readByte();
         }

         if (int_6 == 1) {
            this.triangleSkinValues[int_40] = buffer_4.getUnsignedByte();
         }

         if (int_7 == 1) {
            this.faceTextures[int_40] = (short)(buffer_5.getUnsignedShort() - 1);
         }

         if (this.textureCoords != null && this.faceTextures[int_40] != -1) {
            this.textureCoords[int_40] = (byte)(buffer_6.getUnsignedByte() - 1);
         }
      }

      buffer_0.position = int_24;
      buffer_1.position = int_19;
      int_40 = 0;
      int_41 = 0;
      int_42 = 0;
      int_43 = 0;

      int int_45;
      for (int_44 = 0; int_44 < int_1; int_44++) {
         int_45 = buffer_1.getUnsignedByte();
         if (int_45 == 1) {
            int_40 = buffer_0.readShortSmart() + int_43;
            int_41 = buffer_0.readShortSmart() + int_40;
            int_42 = buffer_0.readShortSmart() + int_41;
            int_43 = int_42;
            this.trianglePointsX[int_44] = int_40;
            this.trianglePointsY[int_44] = int_41;
            this.trianglePointsZ[int_44] = int_42;
         }

         if (int_45 == 2) {
            int_41 = int_42;
            int_42 = buffer_0.readShortSmart() + int_43;
            int_43 = int_42;
            this.trianglePointsX[int_44] = int_40;
            this.trianglePointsY[int_44] = int_41;
            this.trianglePointsZ[int_44] = int_42;
         }

         if (int_45 == 3) {
            int_40 = int_42;
            int_42 = buffer_0.readShortSmart() + int_43;
            int_43 = int_42;
            this.trianglePointsX[int_44] = int_40;
            this.trianglePointsY[int_44] = int_41;
            this.trianglePointsZ[int_44] = int_42;
         }

         if (int_45 == 4) {
            int int_46 = int_40;
            int_40 = int_41;
            int_41 = int_46;
            int_42 = buffer_0.readShortSmart() + int_43;
            int_43 = int_42;
            this.trianglePointsX[int_44] = int_40;
            this.trianglePointsY[int_44] = int_46;
            this.trianglePointsZ[int_44] = int_42;
         }
      }

      buffer_0.position = int_31;
      buffer_1.position = int_32;
      buffer_2.position = int_33;
      buffer_3.position = int_34;
      buffer_4.position = int_35;
      buffer_5.position = int_36;

      for (int_44 = 0; int_44 < int_2; int_44++) {
         int_45 = this.textureRenderTypes[int_44] & 0xFF;
         if (int_45 == 0) {
            this.texTriangleX[int_44] = (short)buffer_0.getUnsignedShort();
            this.texTriangleY[int_44] = (short)buffer_0.getUnsignedShort();
            this.texTriangleZ[int_44] = (short)buffer_0.getUnsignedShort();
         }

         if (int_45 == 1) {
            this.texTriangleX[int_44] = (short)buffer_1.getUnsignedShort();
            this.texTriangleY[int_44] = (short)buffer_1.getUnsignedShort();
            this.texTriangleZ[int_44] = (short)buffer_1.getUnsignedShort();
            this.aShortArray13[int_44] = (short)buffer_2.getUnsignedShort();
            this.aShortArray14[int_44] = (short)buffer_2.getUnsignedShort();
            this.aShortArray15[int_44] = (short)buffer_2.getUnsignedShort();
            this.aShortArray16[int_44] = (short)buffer_3.getUnsignedShort();
            this.aByteArray27[int_44] = buffer_4.readByte();
            this.aShortArray17[int_44] = (short)buffer_5.getUnsignedShort();
         }

         if (int_45 == 2) {
            this.texTriangleX[int_44] = (short)buffer_1.getUnsignedShort();
            this.texTriangleY[int_44] = (short)buffer_1.getUnsignedShort();
            this.texTriangleZ[int_44] = (short)buffer_1.getUnsignedShort();
            this.aShortArray13[int_44] = (short)buffer_2.getUnsignedShort();
            this.aShortArray14[int_44] = (short)buffer_2.getUnsignedShort();
            this.aShortArray15[int_44] = (short)buffer_2.getUnsignedShort();
            this.aShortArray16[int_44] = (short)buffer_3.getUnsignedShort();
            this.aByteArray27[int_44] = buffer_4.readByte();
            this.aShortArray17[int_44] = (short)buffer_5.getUnsignedShort();
            this.texturePrimaryColor[int_44] = (short)buffer_5.getUnsignedShort();
         }

         if (int_45 == 3) {
            this.texTriangleX[int_44] = (short)buffer_1.getUnsignedShort();
            this.texTriangleY[int_44] = (short)buffer_1.getUnsignedShort();
            this.texTriangleZ[int_44] = (short)buffer_1.getUnsignedShort();
            this.aShortArray13[int_44] = (short)buffer_2.getUnsignedShort();
            this.aShortArray14[int_44] = (short)buffer_2.getUnsignedShort();
            this.aShortArray15[int_44] = (short)buffer_2.getUnsignedShort();
            this.aShortArray16[int_44] = (short)buffer_3.getUnsignedShort();
            this.aByteArray27[int_44] = buffer_4.readByte();
            this.aShortArray17[int_44] = (short)buffer_5.getUnsignedShort();
         }
      }

      buffer_0.position = int_17;
      int_44 = buffer_0.getUnsignedByte();
      if (int_44 != 0) {
         new Class53();
         buffer_0.getUnsignedShort();
         buffer_0.getUnsignedShort();
         buffer_0.getUnsignedShort();
         buffer_0.readInt();
      }

   }

   public void translate(int x, int y, int z) {
      for (int vertex = 0; vertex < this.vertexCount; vertex++) {
         this.vertexX[vertex] += x;
         this.vertexY[vertex] += y;
         this.vertexZ[vertex] += z;
      }

      this.clean();
   }

   public ModelHeader method1053(int[][] ints_0, int int_0, int int_1, int int_2, boolean bool_0, int int_3) {
      this.method1047();
      int int_4 = int_0 + this.anInt571;
      int int_5 = int_0 + this.anInt572;
      int int_6 = int_2 + this.anInt574;
      int int_7 = int_2 + this.anInt575;
      if (int_4 >= 0 && int_5 + 128 >> 7 < ints_0.length && int_6 >= 0 && int_7 + 128 >> 7 < ints_0[0].length) {
         int_4 >>= 7;
         int_5 = int_5 + 127 >> 7;
         int_6 >>= 7;
         int_7 = int_7 + 127 >> 7;
         if (int_1 == ints_0[int_4][int_6] && int_1 == ints_0[int_5][int_6] && int_1 == ints_0[int_4][int_7] && int_1 == ints_0[int_5][int_7]) {
            return this;
         } else {
            ModelHeader modeldata_1 = new ModelHeader();
            modeldata_1.vertexCount = this.vertexCount;
            modeldata_1.triangleCount = this.triangleCount;
            modeldata_1.anInt576 = this.anInt576;
            modeldata_1.vertexX = this.vertexX;
            modeldata_1.vertexZ = this.vertexZ;
            modeldata_1.trianglePointsX = this.trianglePointsX;
            modeldata_1.trianglePointsY = this.trianglePointsY;
            modeldata_1.trianglePointsZ = this.trianglePointsZ;
            modeldata_1.faceRenderType = this.faceRenderType;
            modeldata_1.faceRenderPriorities = this.faceRenderPriorities;
            modeldata_1.faceAlphas = this.faceAlphas;
            modeldata_1.textureCoords = this.textureCoords;
            modeldata_1.triangleColours = this.triangleColours;
            modeldata_1.faceTextures = this.faceTextures;
            modeldata_1.priority = this.priority;
            modeldata_1.textureRenderTypes = this.textureRenderTypes;
            modeldata_1.texTriangleX = this.texTriangleX;
            modeldata_1.texTriangleY = this.texTriangleY;
            modeldata_1.texTriangleZ = this.texTriangleZ;
            modeldata_1.aShortArray13 = this.aShortArray13;
            modeldata_1.aShortArray14 = this.aShortArray14;
            modeldata_1.aShortArray15 = this.aShortArray15;
            modeldata_1.aShortArray16 = this.aShortArray16;
            modeldata_1.aByteArray27 = this.aByteArray27;
            modeldata_1.aShortArray17 = this.aShortArray17;
            modeldata_1.texturePrimaryColor = this.texturePrimaryColor;
            modeldata_1.vertexSkins = this.vertexSkins;
            modeldata_1.triangleSkinValues = this.triangleSkinValues;
            modeldata_1.anIntArrayArray19 = this.anIntArrayArray19;
            modeldata_1.anIntArrayArray20 = this.anIntArrayArray20;
            modeldata_1.aShort2 = this.aShort2;
            modeldata_1.contrast = this.contrast;
            modeldata_1.vertexY = new int[modeldata_1.vertexCount];
            int int_8;
            int int_9;
            int int_10;
            int int_11;
            int int_12;
            int int_13;
            int int_14;
            int int_15;
            int int_16;
            int int_17;
            if (int_3 == 0) {
               for (int_8 = 0; int_8 < modeldata_1.vertexCount; int_8++) {
                  int_9 = int_0 + this.vertexX[int_8];
                  int_10 = int_2 + this.vertexZ[int_8];
                  int_11 = int_9 & 0x7F;
                  int_12 = int_10 & 0x7F;
                  int_13 = int_9 >> 7;
                  int_14 = int_10 >> 7;
                  int_15 = ints_0[int_13][int_14] * (128 - int_11) + ints_0[int_13 + 1][int_14] * int_11 >> 7;
                  int_16 = ints_0[int_13][int_14 + 1] * (128 - int_11) + int_11 * ints_0[int_13 + 1][int_14 + 1] >> 7;
                  int_17 = int_15 * (128 - int_12) + int_16 * int_12 >> 7;
                  modeldata_1.vertexY[int_8] = int_17 + this.vertexY[int_8] - int_1;
               }
            } else {
               for (int_8 = 0; int_8 < modeldata_1.vertexCount; int_8++) {
                  int_9 = (-this.vertexY[int_8] << 16) / super.modelHeight;
                  if (int_9 < int_3) {
                     int_10 = int_0 + this.vertexX[int_8];
                     int_11 = int_2 + this.vertexZ[int_8];
                     int_12 = int_10 & 0x7F;
                     int_13 = int_11 & 0x7F;
                     int_14 = int_10 >> 7;
                     int_15 = int_11 >> 7;
                     int_16 = ints_0[int_14][int_15] * (128 - int_12) + ints_0[int_14 + 1][int_15] * int_12 >> 7;
                     int_17 = ints_0[int_14][int_15 + 1] * (128 - int_12) + int_12 * ints_0[int_14 + 1][int_15 + 1] >> 7;
                     int int_18 = int_16 * (128 - int_13) + int_17 * int_13 >> 7;
                     modeldata_1.vertexY[int_8] = (int_3 - int_9) * (int_18 - int_1) / int_3 + this.vertexY[int_8];
                  }
               }
            }

            modeldata_1.clean();
            return modeldata_1;
         }
      } else {
         return this;
      }
   }

   void computeAnimationTables() {
      int[] ints_0;
      int int_0;
      int int_1;
      int int_2;
      if (this.vertexSkins != null) {
         ints_0 = new int[256];
         int_0 = 0;

         for (int_1 = 0; int_1 < this.vertexCount; int_1++) {
            int_2 = this.vertexSkins[int_1];
            ++ints_0[int_2];
            if (int_2 > int_0) {
               int_0 = int_2;
            }
         }

         this.anIntArrayArray19 = new int[int_0 + 1][];

         for (int_1 = 0; int_1 <= int_0; int_1++) {
            this.anIntArrayArray19[int_1] = new int[ints_0[int_1]];
            ints_0[int_1] = 0;
         }

         for (int_1 = 0; int_1 < this.vertexCount; this.anIntArrayArray19[int_2][ints_0[int_2]++] = int_1++) {
            int_2 = this.vertexSkins[int_1];
         }

         this.vertexSkins = null;
      }

      if (this.triangleSkinValues != null) {
         ints_0 = new int[256];
         int_0 = 0;

         for (int_1 = 0; int_1 < this.triangleCount; int_1++) {
            int_2 = this.triangleSkinValues[int_1];
            ++ints_0[int_2];
            if (int_2 > int_0) {
               int_0 = int_2;
            }
         }

         this.anIntArrayArray20 = new int[int_0 + 1][];

         for (int_1 = 0; int_1 <= int_0; int_1++) {
            this.anIntArrayArray20[int_1] = new int[ints_0[int_1]];
            ints_0[int_1] = 0;
         }

         for (int_1 = 0; int_1 < this.triangleCount; this.anIntArrayArray20[int_2][ints_0[int_2]++] = int_1++) {
            int_2 = this.triangleSkinValues[int_1];
         }

         this.triangleSkinValues = null;
      }

   }

   public void mirror() {
      int vertex;
      for (vertex = 0; vertex < this.vertexCount; vertex++) {
         this.vertexZ[vertex] = -this.vertexZ[vertex];
      }

      for (vertex = 0; vertex < this.triangleCount; vertex++) {
         int int_1 = this.trianglePointsX[vertex];
         this.trianglePointsX[vertex] = this.trianglePointsZ[vertex];
         this.trianglePointsZ[vertex] = int_1;
      }

      this.clean();
   }

   public void method1055(int int_0) {
      int int_1 = anIntArray138[int_0];
      int int_2 = anIntArray140[int_0];

      for (int vertex = 0; vertex < this.vertexCount; vertex++) {
         int int_4 = int_1 * this.vertexZ[vertex] + int_2 * this.vertexX[vertex] >> 16;
         this.vertexZ[vertex] = int_2 * this.vertexZ[vertex] - int_1 * this.vertexX[vertex] >> 16;
         this.vertexX[vertex] = int_4;
      }

      this.clean();
   }

   public void rotate90Degrees() {
      for (int vertex = 0; vertex < this.vertexCount; vertex++) {
         int x = this.vertexX[vertex];
         this.vertexX[vertex] = this.vertexZ[vertex];
         this.vertexZ[vertex] = -x;
      }

      this.clean();
   }

   public void rotateXZ() {
      for (int vertex = 0; vertex < this.vertexCount; vertex++) {
         this.vertexX[vertex] = -this.vertexX[vertex];
         this.vertexZ[vertex] = -this.vertexZ[vertex];
      }

      this.clean();
   }

   public void rotateZ() {
      for (int vertex = 0; vertex < this.vertexCount; vertex++) {
         int z = this.vertexZ[vertex];
         this.vertexZ[vertex] = this.vertexX[vertex];
         this.vertexX[vertex] = -z;
      }

      this.clean();
   }

   int method1059(ModelHeader header, int currentVertex) {
      int otherVertex = -1;
      int vertexX = header.vertexX[currentVertex];
      int vertexY = header.vertexY[currentVertex];
      int vertexZ = header.vertexZ[currentVertex];

      for (int vertex = 0; vertex < this.vertexCount; vertex++) {
         if (vertexX == this.vertexX[vertex] && vertexY == this.vertexY[vertex] && vertexZ == this.vertexZ[vertex]) {
            otherVertex = vertex;
            break;
         }
      }

      if (otherVertex == -1) {
         this.vertexX[this.vertexCount] = vertexX;
         this.vertexY[this.vertexCount] = vertexY;
         this.vertexZ[this.vertexCount] = vertexZ;
         if (header.vertexSkins != null) {
            this.vertexSkins[this.vertexCount] = header.vertexSkins[currentVertex];
         }

         otherVertex = this.vertexCount++;
      }

      return otherVertex;
   }

   public static ModelHeader getModel(IndexDataBase index, int archiveId, int fileId) {
      byte[] data = index.getConfigData(archiveId, fileId);
      return data == null ? null : new ModelHeader(data);
   }

   static void method1061(ModelHeader modeldata_0, ModelHeader modeldata_1, int int_0, int int_1, int int_2, boolean bool_0) {
      modeldata_0.method1047();
      modeldata_0.computeNormals();
      modeldata_1.method1047();
      modeldata_1.computeNormals();
      ++anInt570;
      int int_3 = 0;
      int[] ints_0 = modeldata_1.vertexX;
      int int_4 = modeldata_1.vertexCount;

      int int_5;
      for (int_5 = 0; int_5 < modeldata_0.vertexCount; int_5++) {
         VertexNormal vertexnormal_0 = modeldata_0.normals[int_5];
         if (vertexnormal_0.magnitude != 0) {
            int int_6 = modeldata_0.vertexY[int_5] - int_1;
            if (int_6 <= modeldata_1.anInt573) {
               int int_7 = modeldata_0.vertexX[int_5] - int_0;
               if (int_7 >= modeldata_1.anInt571 && int_7 <= modeldata_1.anInt572) {
                  int int_8 = modeldata_0.vertexZ[int_5] - int_2;
                  if (int_8 >= modeldata_1.anInt574 && int_8 <= modeldata_1.anInt575) {
                     for (int int_9 = 0; int_9 < int_4; int_9++) {
                        VertexNormal vertexnormal_1 = modeldata_1.normals[int_9];
                        if (int_7 == ints_0[int_9] && int_8 == modeldata_1.vertexZ[int_9] && int_6 == modeldata_1.vertexY[int_9] && vertexnormal_1.magnitude != 0) {
                           if (modeldata_0.aVertexNormalArray1 == null) {
                              modeldata_0.aVertexNormalArray1 = new VertexNormal[modeldata_0.vertexCount];
                           }

                           if (modeldata_1.aVertexNormalArray1 == null) {
                              modeldata_1.aVertexNormalArray1 = new VertexNormal[int_4];
                           }

                           VertexNormal vertexnormal_2 = modeldata_0.aVertexNormalArray1[int_5];
                           if (vertexnormal_2 == null) {
                              vertexnormal_2 = modeldata_0.aVertexNormalArray1[int_5] = new VertexNormal(vertexnormal_0);
                           }

                           VertexNormal vertexnormal_3 = modeldata_1.aVertexNormalArray1[int_9];
                           if (vertexnormal_3 == null) {
                              vertexnormal_3 = modeldata_1.aVertexNormalArray1[int_9] = new VertexNormal(vertexnormal_1);
                           }

                           vertexnormal_2.x += vertexnormal_1.x;
                           vertexnormal_2.y += vertexnormal_1.y;
                           vertexnormal_2.z += vertexnormal_1.z;
                           vertexnormal_2.magnitude += vertexnormal_1.magnitude;
                           vertexnormal_3.x += vertexnormal_0.x;
                           vertexnormal_3.y += vertexnormal_0.y;
                           vertexnormal_3.z += vertexnormal_0.z;
                           vertexnormal_3.magnitude += vertexnormal_0.magnitude;
                           ++int_3;
                           anIntArray139[int_5] = anInt570;
                           anIntArray141[int_9] = anInt570;
                        }
                     }
                  }
               }
            }
         }
      }

      if (int_3 >= 3 && bool_0) {
         for (int_5 = 0; int_5 < modeldata_0.triangleCount; int_5++) {
            if (anIntArray139[modeldata_0.trianglePointsX[int_5]] == anInt570 && anIntArray139[modeldata_0.trianglePointsY[int_5]] == anInt570 && anIntArray139[modeldata_0.trianglePointsZ[int_5]] == anInt570) {
               if (modeldata_0.faceRenderType == null) {
                  modeldata_0.faceRenderType = new byte[modeldata_0.triangleCount];
               }

               modeldata_0.faceRenderType[int_5] = 2;
            }
         }

         for (int_5 = 0; int_5 < modeldata_1.triangleCount; int_5++) {
            if (anInt570 == anIntArray141[modeldata_1.trianglePointsX[int_5]] && anInt570 == anIntArray141[modeldata_1.trianglePointsY[int_5]] && anInt570 == anIntArray141[modeldata_1.trianglePointsZ[int_5]]) {
               if (modeldata_1.faceRenderType == null) {
                  modeldata_1.faceRenderType = new byte[modeldata_1.triangleCount];
               }

               modeldata_1.faceRenderType[int_5] = 2;
            }
         }

      }
   }

   static int method1062(int lightness) {
      if (lightness < 2) {
         lightness = 2;
      } else if (lightness > 126) {
         lightness = 126;
      }

      return lightness;
   }

   static int mixLightness(int hsl, int lightness) {
      lightness = (hsl & 0x7F) * lightness >> 7;
      if (lightness < 2) {
         lightness = 2;
      } else if (lightness > 126) {
         lightness = 126;
      }

      return (hsl & 0xFF80) + lightness;
   }

}