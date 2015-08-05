package modelo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Animar {
     private JPanel panel=null;
     Graphics g2=null;
      public Thread hilo1=null;
     
    public int x=0,y=0,posx=350,posy=100,img1=1;
    
    
         //ImageIcon image =new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/puerta.gif")).getImage()); 
  private boolean chocapuerta=false;
    
  public Animar (JPanel j){
  panel=j;
  x=getPanel().getWidth()-100;
  y=getPanel().getHeight()-300;
  
  }
    
  public void paint(Graphics g){
     g2=g;
      //g.drawImage(image.getImage(), x,  y,100, 150,   null);   
  if(chocapuerta){
    ImageIcon image2 =new ImageIcon(new ImageIcon(getClass().getResource("/img/"+img1+".png")).getImage());
    g.drawImage(image2.getImage(), posx, posy,110,250,   null); 
     img1++;
  if(img1==10){
     img1=1;
    }              
                 //
  }  
  }
  
  public void animacion(){

         
   this.panel.getGraphics().drawLine(30, 30,45, 60);
 if(!hilo2.isAlive()){
            hilo2.start();
 }
 
 else{
 hilo2.resume();
 chocapuerta=true;
 posx=50;
 }
      
  }

    /**
     * @return the chocapuerta
     */
    public boolean isChocapuerta() {
        return chocapuerta;
    }

    /**
     * @param chocapuerta the chocapuerta to set
     */
    public void setChocapuerta(boolean chocapuerta) {
        this.chocapuerta = chocapuerta;
    }
    
    
     private Thread hilo2 = new Thread()
    {
        

        @Override
        public void run()
        {
            try
            {
                while(true)
                {
                    //System.out.println("pos x"+posx);
         
               /*   ImageIcon image2 =new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/"+img1+".png")).getImage());
                 panel.getGraphics().drawImage(image2.getImage(), posx, posy,400, 300,   null);     
             
              */
          
               
                  img1++;
                  if(img1==10){
                  img1=1;
                  }
                  
                  if(posx==1150){
                hilo2.suspend();  
                  
                  }
               panel.repaint();   
                 posx+=10;
                 
                 
               
                  hilo2.sleep(160);
                   
                
                     
                     
                }
            } catch (java.lang.InterruptedException ie) { System.out.println(ie.getMessage()); }
        }
    };

    /**
     * @return the panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    /**
     * @return the hilo2
     */
    public Thread getHilo2() {
        return hilo2;
    }

    /**
     * @param hilo2 the hilo2 to set
     */
    public void setHilo2(Thread hilo2) {
        this.hilo2 = hilo2;
    }
}
