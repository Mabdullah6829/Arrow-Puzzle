package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfk;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class zzx extends zzv {
    @Override // com.google.android.gms.ads.internal.util.zzz
    /* JADX INFO: renamed from: e */
    public final void mo3243e(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8225N1)).booleanValue() && com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().m3188n() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != attributes.layoutInDisplayCutoutMode) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    zzcfk zzcfkVar = com.google.android.gms.ads.internal.zzt.f3698C.f3708h;
                    if (zzcfkVar.m5387g().m3188n() == null) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        String strConcat = "";
                        if (displayCutout != null) {
                            zzj zzjVarM5387g = zzcfkVar.m5387g();
                            for (Rect rect : displayCutout.getBoundingRects()) {
                                Locale locale = Locale.US;
                                int i2 = rect.left;
                                int i3 = rect.top;
                                int i4 = rect.right;
                                int i5 = rect.bottom;
                                StringBuilder sb = new StringBuilder();
                                sb.append(i2);
                                sb.append(",");
                                sb.append(i3);
                                sb.append(",");
                                sb.append(i4);
                                String strM2447n = AbstractC1456a.m2447n(sb, ",", i5);
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("|");
                                }
                                strConcat = strConcat.concat(strM2447n);
                            }
                            zzjVarM5387g.m3189p(strConcat);
                        } else {
                            zzcfkVar.m5387g().m3189p("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    if (2 != attributes2.layoutInDisplayCutoutMode) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    /* JADX INFO: renamed from: f */
    public final int mo3244f(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
