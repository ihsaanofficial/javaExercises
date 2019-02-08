class pract5{
 static final double PI = 3.14; 
 static int count = 0; 
 
 double radius; 
 double xCenter; 
 double yCenter; 
 double zCenter; 
 pract5(double theRadius, double x, double y, double z) {
 radius = theRadius; 
 xCenter = x;
 yCenter = y;
 zCenter = z;
 ++count; 
 }
 static int getCount() {
 return count; 
 }
 double volume() {
 return 4.0/3.0*PI*radius*radius*radius;
 }
}