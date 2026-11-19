package p024O;

import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: O.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0467j {

    /* JADX INFO: renamed from: a */
    public final C0470m f817a;

    /* JADX INFO: renamed from: b */
    public final int[] f818b;

    /* JADX INFO: renamed from: c */
    public final int f819c;

    /* JADX INFO: renamed from: d */
    public final C0461d f820d;

    /* JADX INFO: renamed from: e */
    public final int f821e;

    /* JADX INFO: renamed from: f */
    public boolean f822f;

    /* JADX INFO: renamed from: g */
    public boolean f823g;

    /* JADX INFO: renamed from: h */
    public int f824h;

    public C0467j(C0470m c0470m, String str) {
        this.f817a = c0470m;
        int i2 = c0470m.f833t.f841d;
        this.f819c = i2;
        this.f818b = new int[(i2 * 2) + 2];
        C0461d c0461d = new C0461d();
        c0461d.f793a = str;
        this.f820d = c0461d;
        this.f821e = str.length();
        this.f822f = false;
        this.f823g = false;
    }

    /* JADX INFO: renamed from: a */
    public final String m1004a(int i2) {
        m1005b(i2);
        int i3 = i2 * 2;
        int[] iArr = this.f818b;
        int i4 = iArr[i3];
        m1005b(i2);
        int i5 = iArr[i3 + 1];
        if (i4 >= 0 || i5 >= 0) {
            return ((CharSequence) this.f820d.f793a).subSequence(i4, i5).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1005b(int i2) {
        int i3;
        if (i2 < 0 || i2 > (i3 = this.f819c)) {
            throw new IndexOutOfBoundsException(AbstractC0271e0.m396d(i2, "Group index out of bounds: "));
        }
        if (!this.f822f) {
            throw new IllegalStateException("perhaps no match attempted");
        }
        if (i2 == 0 || this.f823g) {
            return;
        }
        int[] iArr = this.f818b;
        int i4 = iArr[1] + 1;
        int i5 = this.f821e;
        if (!this.f817a.f833t.m1033a(this.f820d, iArr[0], i4 > i5 ? i5 : i4, this.f824h, iArr, i3 + 1)) {
            throw new IllegalStateException("inconsistency in matching group data");
        }
        this.f823g = true;
    }
}
