package galmart.intel.element;

import java.awt.event.KeyEvent;

import com.fs.starfarer.api.campaign.econ.MarketAPI;
import com.fs.starfarer.api.ui.CutStyle;
import com.fs.starfarer.api.util.Misc;

import galmart.KeyboardHelper;
import galmart.intel.IntelTracker;
import galmart.intel.GalmartBoard.CommodityTab;
import galmart.ui.Callable;
import galmart.ui.Size;
import galmart.ui.ToggleButton;

public class IntelButton extends ToggleButton {

    public IntelButton(int i, final CommodityTab commodityTab, final String commodityId, final MarketAPI market,
            final IntelTracker tracker) {
        super(new Size(28f, 24f), String.valueOf(i), String.valueOf(i), true, Misc.getTextColor(), Misc.getGrayColor(),
                tracker.has(commodityTab.title, commodityId, market));
        setCallback(new Callable() {

            @Override
            public void callback() {
                tracker.toggle(commodityId, commodityTab, market);
                KeyboardHelper.send(KeyEvent.VK_E);
            }
        });
        setCutStyle(CutStyle.TL_BR);
    }
}
