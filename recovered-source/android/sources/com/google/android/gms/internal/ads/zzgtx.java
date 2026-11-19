package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgtx extends zzgue {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ zzgtf f18184z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgtx(zzgug zzgugVar, CharSequence charSequence, zzgtf zzgtfVar) {
        super(zzgugVar, charSequence);
        this.f18184z = zzgtfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    /* JADX INFO: renamed from: b */
    public final int mo7140b(int i2) {
        CharSequence charSequence = this.f18192u;
        int length = charSequence.length();
        zzgtr.m7137j(i2, length);
        while (i2 < length) {
            if (this.f18184z.mo7123a(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    /* JADX INFO: renamed from: c */
    public final int mo7141c(int i2) {
        return i2 + 1;
    }
}
