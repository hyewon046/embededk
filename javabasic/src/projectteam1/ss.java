package projectteam1;

import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class ss {
	 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {        
 
        final SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    JProgressBar jProgressBar = new JProgressBar();
					jProgressBar.setValue(i);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {}
                }
                return null;
            }
        };
        worker.execute();
 
    }              

}
