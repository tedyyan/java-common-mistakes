package javaskill.multithread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterruptFlag {
	private static final Logger logger = LogManager.getLogger(InterruptFlag.class);
    
	/**
	 * Thread has inner flag to indicate whether we need to run the thread
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
        final Thread t = new Thread(){
            @Override
            public void run() {
                logger.info("show: {}",Thread.interrupted());
                boolean flag;
            	while (!(flag = Thread.interrupted())) {
            		//----------------------------------------------------------
            		for (long  i = 0; i < 100000l; i++) {
                        logger.info("show: {}",i);
                        if (flag = Thread.interrupted()) {
                        	break;
                        }
            		}
            		if (flag) {
                        logger.info("stop here 1 : {}",flag);
                        break;
            		}
            		//---------------------------------------------------------
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                    logger.info("stop here 2 : {}",flag);
            	}
            }
        };
        
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                t.interrupt();
            }
        }).start();
 
        t.start();
        try {
			t.join();
		} catch (InterruptedException e) {
            Thread.currentThread().interrupt();
		}
    }

}