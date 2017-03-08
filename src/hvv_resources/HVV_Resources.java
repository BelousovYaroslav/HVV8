/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvv_resources;

import java.io.File;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;

/**
 *
 * @author yaroslav
 */
public class HVV_Resources {
    
    static Logger logger = Logger.getLogger( HVV_Resources.class);
    
    private static HVV_Resources singletonResources = null;
    
    public static HVV_Resources getInstance() {
        if( singletonResources == null) {
            String strAmsRoot = System.getenv( "AMS_ROOT");
            if( strAmsRoot != null) {
                singletonResources = new HVV_Resources( strAmsRoot);
            }
            else {
                logger.error( "Не задана переменная окружения AMS_ROOT!");
            }
        }
        return singletonResources;
    }
    
    
    private final ImageIcon m_icoBigRed;
    public ImageIcon getIconBigRed() { return m_icoBigRed;}
    
    private final ImageIcon m_icoBigGreen;
    public ImageIcon getIconBigGreen() { return m_icoBigGreen;}
    
    private final ImageIcon m_icoBigBlue;
    public ImageIcon getIconBigBlue() { return m_icoBigBlue;}
    
    private final ImageIcon m_icoBigYellow;
    public ImageIcon getIconBigYellow() { return m_icoBigYellow;}
    
    private final ImageIcon m_icoBigBlack;
    public ImageIcon getIconBigBlack() { return m_icoBigBlack;}
    
    private final ImageIcon m_icoLittleBrightRed;
    public ImageIcon getIconLittleBrightRed() { return m_icoLittleBrightRed;}
    
    private final ImageIcon m_icoLittleBrightGreen;
    public ImageIcon getIconLittleBrightGreen() { return m_icoLittleBrightGreen;}
    
    private final ImageIcon m_icoLittleBrightBlue;
    public ImageIcon getIconLittleBrightBlue() { return m_icoLittleBrightBlue;}
    
    private final ImageIcon m_icoUp;
    public ImageIcon getIconUp() { return m_icoUp;}
    
    private final ImageIcon m_icoDown;
    public ImageIcon getIconDown() { return m_icoDown;}
    
    private final ImageIcon m_icoMinus;
    public ImageIcon getIconMinus() { return m_icoMinus;}
    
    private final ImageIcon m_icoTriangleRight;
    public ImageIcon getIconTriaRight() { return m_icoTriangleRight;}
    
    private final ImageIcon m_icoTriangleDown;
    public ImageIcon getIconTriaDown() { return m_icoTriangleDown;}
    
    private final ImageIcon m_icoAnimatedProgress25;
    public ImageIcon getIconAnimatedProgress25() { return m_icoAnimatedProgress25;}
    
    private final ImageIcon m_icoAnimatedProgress30;
    public ImageIcon getIconAnimatedProgress30() { return m_icoAnimatedProgress30;}
    
    private ImageIcon LoadIconShortCut( String strFilePathName) {
        File f = new File( strFilePathName);
        if(f.exists() && !f.isDirectory()) {
            return new ImageIcon( strFilePathName);
        }
        else {
            logger.warn( "File not found: " + strFilePathName);
            return null;
        }
    }
    public HVV_Resources( String strAMSRoot) {
        
        m_icoBigRed    = LoadIconShortCut( strAMSRoot + "/res/images/redLED.gif");
        m_icoBigGreen  = LoadIconShortCut( strAMSRoot + "/res/images/greenLED.gif");
        m_icoBigBlack  = LoadIconShortCut( strAMSRoot + "/res/images/blackLED.gif");
        m_icoBigBlue   = LoadIconShortCut( strAMSRoot + "/res/images/blueLED.gif");
        m_icoBigYellow = LoadIconShortCut( strAMSRoot + "/res/images/yellowLED.gif");
        
        m_icoLittleBrightRed   = LoadIconShortCut( strAMSRoot + "/res/images/red_little_bright.gif");
        m_icoLittleBrightGreen = LoadIconShortCut( strAMSRoot + "/res/images/green_little_bright.gif");
        m_icoLittleBrightBlue  = LoadIconShortCut( strAMSRoot + "/res/images/blue_little_bright.gif");
        
        m_icoUp    = LoadIconShortCut( strAMSRoot + "/res/images/up.gif");
        m_icoDown  = LoadIconShortCut( strAMSRoot + "/res/images/down.gif");
        m_icoMinus = LoadIconShortCut( strAMSRoot + "/res/images/minus.gif");
        
        m_icoTriangleRight = LoadIconShortCut( strAMSRoot + "/res/images/right.gif");
        m_icoTriangleDown  = LoadIconShortCut( strAMSRoot + "/res/images/down.gif");
        
        m_icoAnimatedProgress25 = LoadIconShortCut( strAMSRoot + "/res/images/progress_25.gif");
        m_icoAnimatedProgress30 = LoadIconShortCut( strAMSRoot + "/res/images/progress_30.gif");
    }
}
