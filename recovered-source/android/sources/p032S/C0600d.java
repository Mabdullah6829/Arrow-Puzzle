package p032S;

import android.content.Context;
import android.util.Log;
import p030R.AbstractC0518B;
import p030R.AbstractC0541X;
import p030R.AbstractC0542Y;
import p030R.AbstractC0543Z;
import p036U.C0828i;

/* JADX INFO: renamed from: S.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0600d extends AbstractC0518B {

    /* JADX INFO: renamed from: a */
    public final AbstractC0542Y f1320a;

    /* JADX INFO: renamed from: b */
    public Context f1321b;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        try {
            try {
                ((AbstractC0543Z) C0828i.class.asSubclass(AbstractC0543Z.class).getConstructor(null).newInstance(null)).getClass();
            } catch (Exception e) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e);
            }
        } catch (ClassCastException e2) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
        }
    }

    public C0600d(AbstractC0542Y abstractC0542Y) {
        this.f1320a = abstractC0542Y;
    }

    @Override // p030R.AbstractC0516A, p030R.AbstractC0542Y
    /* JADX INFO: renamed from: a */
    public final AbstractC0541X mo1232a() {
        return new C0599c(this.f1320a.mo1232a(), this.f1321b);
    }

    @Override // p030R.AbstractC0516A
    /* JADX INFO: renamed from: c */
    public final AbstractC0542Y mo1233c() {
        return this.f1320a;
    }
}
