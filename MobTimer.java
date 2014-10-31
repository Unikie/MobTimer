import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.Color;

public class MobTimer
{
    private JFrame mainWindow;
    private Timer timer;

    public void setTimer(int minutes) {
        timer.stop();
        timer.setDelay(minutes*60000);
        timer.start();
    }

    public void createAndShowGUI() {

        mainWindow = new JFrame("MobTimer");
        mainWindow.setBackground(Color.BLACK);
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(Color.BLACK);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3,3,3,3);

        // Create configuration panel

        JPanel configurationPanel = new JPanel(new GridBagLayout());
        JLabel minutesToDriveLabel = new JLabel("Minutes to drive");
        minutesToDriveLabel.setForeground(Color.WHITE);
        configurationPanel.add(minutesToDriveLabel, c);

        final SpinnerNumberModel minutesToDriveModel = new SpinnerNumberModel(15,1,60,1);
        JSpinner spinner1 = new JSpinner(minutesToDriveModel);
        configurationPanel.add(spinner1, c);
        configurationPanel.setBackground(Color.BLACK);

        // Create panel for showing next driver and the Drive-button
        JPanel drivePanel = new JPanel(new GridBagLayout());
        JButton nextDriverButton = new JButton("NEXT DRIVER - OK GO!");

        drivePanel.add(nextDriverButton, c);
        drivePanel.setBackground(Color.BLACK);

        mainPanel.add(configurationPanel, c);
        mainPanel.add(drivePanel, c);
        mainWindow.add(mainPanel, BorderLayout.CENTER);

        nextDriverButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                setTimer(minutesToDriveModel.getNumber().intValue());
                mainWindow.setAlwaysOnTop(false);
                mainWindow.setExtendedState(JFrame.ICONIFIED);
            }
        });

        mainWindow.setAlwaysOnTop(true);
        mainWindow.toFront();
        mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setUndecorated(true);
        mainWindow.pack();
        mainWindow.setVisible(true);


    }

    public MobTimer() {
        createAndShowGUI();
/*
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainWindow.toFront();
                mainWindow.repaint();
            }
        });
*/
        ActionListener taskPerformer = new ActionListener() {
              public void actionPerformed(ActionEvent evt) {

                mainWindow.setAlwaysOnTop(true);
                mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
                mainWindow.requestFocus();
                mainWindow.repaint();

              }
          };
        timer = new Timer(0, taskPerformer);

    }

    public static void main(String[] args)
    {
        new MobTimer();
    }
}