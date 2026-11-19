package p011H;

/* JADX INFO: renamed from: H.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0268d {

    /* JADX INFO: renamed from: c */
    public static final C0268d f521c;

    /* JADX INFO: renamed from: d */
    public static final C0268d f522d;

    /* JADX INFO: renamed from: a */
    public final boolean f523a;

    /* JADX INFO: renamed from: b */
    public final Throwable f524b;

    static {
        if (AbstractC0290s.f563v) {
            f522d = null;
            f521c = null;
        } else {
            f522d = new C0268d(false, null);
            f521c = new C0268d(true, null);
        }
    }

    public C0268d(boolean z, Throwable th) {
        this.f523a = z;
        this.f524b = th;
    }
}
