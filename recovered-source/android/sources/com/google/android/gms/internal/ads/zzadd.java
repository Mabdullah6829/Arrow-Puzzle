package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.RequiresApi;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(26)
final class zzadd {
    /* JADX INFO: renamed from: a */
    public static boolean m3973a(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr() && (hdrCapabilities = display.getHdrCapabilities()) != null) {
            for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
                if (i2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
