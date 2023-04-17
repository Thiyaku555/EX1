 
 class Multithreading extends Thread
  {
  public synchronized  void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
    // public synchronized    void run(String name){
    //     for(int j=0;j<5;j++){
                   
    //     System.out.println(name);
    //     try {
    //         Thread.sleep(2000);
    //     } catch (InterruptedException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }
    //     }
    // }


    public static void main(String[] args) {
        Multithreading m = new Multithreading();
        m.start();
        for (int j = 0; j <= 5; j++) {
            
            try {
                Thread.sleep(1000);
                m.interrupt();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
