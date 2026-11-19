package p058e0;

import java.util.RandomAccess;

/* JADX INFO: renamed from: e0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6297e extends AbstractC6298f implements RandomAccess {

    /* JADX INFO: renamed from: s */
    public final AbstractC6298f f24326s;

    /* JADX INFO: renamed from: t */
    public final int f24327t;

    /* JADX INFO: renamed from: u */
    public final int f24328u;

    public C6297e(AbstractC6298f abstractC6298f, int i2, int i3) {
        this.f24326s = abstractC6298f;
        this.f24327t = i2;
        C6294b c6294b = AbstractC6298f.Companion;
        int size = abstractC6298f.size();
        c6294b.getClass();
        C6294b.m12079c(i2, i3, size);
        this.f24328u = i3 - i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC6298f.Companion.getClass();
        C6294b.m12077a(i2, this.f24328u);
        return this.f24326s.get(this.f24327t + i2);
    }

    @Override // p058e0.AbstractC6293a
    public final int getSize() {
        return this.f24328u;
    }
}
