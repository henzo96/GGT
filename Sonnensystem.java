import gdp.stdlib.*;
public class Sonnensystem {
	public static void main(String[] args) {
	//initalise	
	int N= StdIn.readInt();
	double R = StdIn.readDouble();
	double[] x = new double[N];
	double[] y = new double[N];
	double[] vy = new double[N];
	double[] vx = new double[N];
	double[] m = new double[N];
	String[] pic = new String[N];
	
	int dt = 25000;
	//get values
	for(int i = 0; i < N;i++){
		x[i] = StdIn.readDouble();
		y[i] = StdIn.readDouble();
		vx[i] = StdIn.readDouble();
		vy[i] = StdIn.readDouble();
		m[i] = StdIn.readDouble();
		pic[i] = StdIn.readString();
	}
	       
		
	
		//planets information placeholder
		
	

//draw area
	StdDraw.setXscale(-R, R); 
	StdDraw.setYscale(-R, R);
	StdDraw.picture(0,0, "starfield.jpg");
	
	  // initialize the planets positions in new arrays
	
	//draw planets loop
	
	  while (true) {

          // clear all the forces
          
          

          // draw everything
          StdDraw.picture(0,0, "starfield.jpg");
          for(int i=0;i<N;i++)	{
        		StdDraw.picture(x[i], y[i], pic[i]);
          }
              
            
              // show and wait
          
          
          for (int i = 0; i < N; i++) {
        	 
        	  double fx = 0;
              double fy = 0;
              double zwx=0;
          	double zwy=0;
          	double ax=0;
          	double ay=0;
        	  for (int j = 0; j < N; j++) {

                  if (i == j) continue;

                  // calculate distance between planets i and j
                  double dx = x[j] - x[i];
                  double dy = y[j] - y[i];
                  double r = Math.sqrt(dx*dx + dy*dy);
                  
                  // figure out the gravity
                  // hier koennte ihre formel stehen
                  double f = ((6.67e-11) * m[i] * m[j]) / (r*r);
                  zwx = f * dx/r;
                  zwy = f * dy/r;
                  fx=fx+zwx;
                  fy=fy+zwy;


                   
                 
              }
              
              ax = fx/m[i] ; //besch
              ay = fy/m[i] ;
              vx[i] += dt * ax ;//gesch
              vy[i] += dt * ay ;
             
          }  
          for(int i=0;i<N;i++){
        	  x[i]+=vx[i]*dt;
        	  y[i]+=vy[i]*dt;
          }
          StdDraw.show(10);
	 }
	  
   }     
}
