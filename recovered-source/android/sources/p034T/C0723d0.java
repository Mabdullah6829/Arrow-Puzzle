package p034T;

import p030R.AbstractC0575p0;

/* JADX INFO: renamed from: T.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0723d0 extends AbstractC0575p0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f1800a;

    static {
        boolean z = false;
        try {
            Class.forName("android.app.Application", false, C0723d0.class.getClassLoader());
            z = true;
        } catch (Exception unused) {
        }
        f1800a = z;
    }
}
