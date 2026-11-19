package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzciu extends zzaus {

    /* JADX INFO: renamed from: c */
    public static final zzciu f10175c = new zzciu();

    @Override // com.google.android.gms.internal.ads.zzaus
    /* JADX INFO: renamed from: b */
    public final zzauw mo4428b(String str) {
        if ("moov".equals(str)) {
            return new zzauy();
        }
        return "mvhd".equals(str) ? new zzauz() : new zzava(str);
    }
}
