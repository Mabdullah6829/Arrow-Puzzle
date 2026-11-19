package p030R;

import p001B.AbstractC0076b;

/* JADX INFO: renamed from: R.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0580s {

    /* JADX INFO: renamed from: a */
    public final EnumC0578r f1238a;

    /* JADX INFO: renamed from: b */
    public final C0589w0 f1239b;

    public C0580s(EnumC0578r enumC0578r, C0589w0 c0589w0) {
        this.f1238a = enumC0578r;
        AbstractC0076b.m133h(c0589w0, "status is null");
        this.f1239b = c0589w0;
    }

    /* JADX INFO: renamed from: a */
    public static C0580s m1341a(EnumC0578r enumC0578r) {
        AbstractC0076b.m131f(enumC0578r != EnumC0578r.f1234u, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C0580s(enumC0578r, C0589w0.f1275e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0580s)) {
            return false;
        }
        C0580s c0580s = (C0580s) obj;
        return this.f1238a.equals(c0580s.f1238a) && this.f1239b.equals(c0580s.f1239b);
    }

    public final int hashCode() {
        return this.f1238a.hashCode() ^ this.f1239b.hashCode();
    }

    public final String toString() {
        C0589w0 c0589w0 = this.f1239b;
        boolean zM1352e = c0589w0.m1352e();
        EnumC0578r enumC0578r = this.f1238a;
        if (zM1352e) {
            return enumC0578r.toString();
        }
        return enumC0578r + "(" + c0589w0 + ")";
    }
}
