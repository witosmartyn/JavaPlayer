

package player;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SkinUtil {
    public static void changeSkin(Component comp ,String s){
        try {
            UIManager.setLookAndFeel(s);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SkinUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SkinUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SkinUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SkinUtil.class.getName()).log(Level.SEVERE, null, ex);
        }SwingUtilities.updateComponentTreeUI(comp);
            }
    
}
