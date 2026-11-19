package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
abstract class zzm extends zzj {

    /* JADX INFO: renamed from: v */
    public static final WeakReference f4676v = new WeakReference(null);

    /* JADX INFO: renamed from: u */
    public WeakReference f4677u;

    public zzm(byte[] bArr) {
        super(bArr);
        this.f4677u = f4676v;
    }

    @Override // com.google.android.gms.common.zzj
    /* JADX INFO: renamed from: k0 */
    public final byte[] mo3670k0() {
        byte[] bArrMo3668x0;
        synchronized (this) {
            try {
                bArrMo3668x0 = (byte[]) this.f4677u.get();
                if (bArrMo3668x0 == null) {
                    bArrMo3668x0 = mo3668x0();
                    this.f4677u = new WeakReference(bArrMo3668x0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrMo3668x0;
    }

    /* JADX INFO: renamed from: x0 */
    public abstract byte[] mo3668x0();
}
