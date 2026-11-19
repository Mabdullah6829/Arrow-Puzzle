package p038V;

/* JADX INFO: renamed from: V.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0848b {

    /* JADX INFO: renamed from: a */
    public final boolean f2332a;

    /* JADX INFO: renamed from: b */
    public String[] f2333b;

    /* JADX INFO: renamed from: c */
    public String[] f2334c;

    /* JADX INFO: renamed from: d */
    public boolean f2335d;

    public C0848b(boolean z) {
        this.f2332a = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m1758a(EnumC0847a... enumC0847aArr) {
        if (!this.f2332a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[enumC0847aArr.length];
        for (int i2 = 0; i2 < enumC0847aArr.length; i2++) {
            strArr[i2] = enumC0847aArr[i2].f2331s;
        }
        this.f2333b = strArr;
    }

    /* JADX INFO: renamed from: b */
    public final void m1759b(EnumC0859m... enumC0859mArr) {
        if (!this.f2332a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (enumC0859mArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[enumC0859mArr.length];
        for (int i2 = 0; i2 < enumC0859mArr.length; i2++) {
            strArr[i2] = enumC0859mArr[i2].f2382s;
        }
        this.f2334c = strArr;
    }

    public C0848b(C0849c c0849c) {
        this.f2332a = c0849c.f2337a;
        this.f2333b = c0849c.f2338b;
        this.f2334c = c0849c.f2339c;
        this.f2335d = c0849c.f2340d;
    }
}
