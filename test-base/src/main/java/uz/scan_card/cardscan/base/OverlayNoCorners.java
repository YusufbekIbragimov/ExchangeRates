package uz.scan_card.cardscan.base;

import android.content.Context;
import android.util.AttributeSet;

public class OverlayNoCorners extends Overlay {
    public OverlayNoCorners(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.drawCorners = true;
    }
}
