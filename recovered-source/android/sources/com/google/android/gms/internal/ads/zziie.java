package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zziie implements zziev {

    /* JADX INFO: renamed from: a */
    public static final zziev f19934a = new zziie();

    private zziie() {
    }

    @Override // com.google.android.gms.internal.ads.zziev
    public final boolean zza(int i2) {
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 1999) {
            switch (i2) {
                case 1000:
                case 1001:
                case 1002:
                case PointerIconCompat.TYPE_HELP /* 1003 */:
                case PointerIconCompat.TYPE_WAIT /* 1004 */:
                case 1005:
                case PointerIconCompat.TYPE_CELL /* 1006 */:
                case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                case PointerIconCompat.TYPE_TEXT /* 1008 */:
                case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
