class Ponto {
   float x, y;
   Ponto () {
     this(0);
   }  
   Ponto (float a) {
     this(a,a);
   }
   Ponto (float x, float y) {
    this.x = x;
    this.y = y;
   }

   void mover (int c) {
     this.mover(c,c);
   }

   void mover (int dx, int dy) {
     x = x + dx;
     y = y + dy;
   }

}
