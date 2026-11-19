package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqq {

    /* JADX INFO: renamed from: a */
    public static final ClipData f18072a = ClipData.newIntent("", new Intent());

    /* JADX INFO: renamed from: a */
    public static Intent m7066a(Intent intent, int i2) {
        boolean zM7067b = m7067b(0, 17);
        boolean zM7067b2 = m7067b(0, 9);
        boolean zM7067b3 = m7067b(0, 5);
        boolean zM7067b4 = m7067b(0, 3);
        zzgtr.m7129b("Must set component on Intent.", intent.getComponent() != null);
        if (m7067b(0, 1)) {
            zzgtr.m7129b("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !m7067b(i2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        } else {
            zzgtr.m7129b("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", m7067b(i2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        }
        Intent intent2 = new Intent(intent);
        if (!m7067b(i2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zM7067b4 && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zM7067b2 && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zM7067b3 && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zM7067b && intent2.getClipData() == null) {
                intent2.setClipData(f18072a);
            }
        }
        return intent2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7067b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
