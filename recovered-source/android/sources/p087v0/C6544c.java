package p087v0;

import java.util.NoSuchElementException;
import p058e0.AbstractC6316x;

/* JADX INFO: renamed from: v0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6544c extends AbstractC6316x {

    /* JADX INFO: renamed from: s */
    public final int f24770s;

    /* JADX INFO: renamed from: t */
    public final int f24771t;

    /* JADX INFO: renamed from: u */
    public boolean f24772u;

    /* JADX INFO: renamed from: v */
    public int f24773v;

    public C6544c(int i2, int i3, int i4) {
        this.f24770s = i4;
        this.f24771t = i3;
        boolean z = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z = true;
        }
        this.f24772u = z;
        this.f24773v = z ? i2 : i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24772u;
    }

    @Override // p058e0.AbstractC6316x
    public final int nextInt() {
        int i2 = this.f24773v;
        if (i2 != this.f24771t) {
            this.f24773v = this.f24770s + i2;
            return i2;
        }
        if (!this.f24772u) {
            throw new NoSuchElementException();
        }
        this.f24772u = false;
        return i2;
    }
}
