package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqy extends zzgrz {

    /* JADX INFO: renamed from: a */
    public IBinder f18078a;

    /* JADX INFO: renamed from: b */
    public String f18079b;

    /* JADX INFO: renamed from: c */
    public int f18080c;

    /* JADX INFO: renamed from: d */
    public float f18081d;

    /* JADX INFO: renamed from: e */
    public int f18082e;

    /* JADX INFO: renamed from: f */
    public String f18083f;

    /* JADX INFO: renamed from: g */
    public byte f18084g;

    /* JADX INFO: renamed from: a */
    public final zzgsa m7073a() {
        IBinder iBinder;
        if (this.f18084g == 31 && (iBinder = this.f18078a) != null) {
            return new zzgqz(iBinder, this.f18079b, this.f18080c, this.f18081d, this.f18082e, this.f18083f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f18078a == null) {
            sb.append(" windowToken");
        }
        if ((this.f18084g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f18084g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f18084g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f18084g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f18084g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
