package p001B;

import java.util.Iterator;

/* JADX INFO: renamed from: B.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C0093s implements Iterable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f131s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0094t f132t;

    public C0093s(C0094t c0094t, String str) {
        this.f132t = c0094t;
        this.f131s = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0094t c0094t = this.f132t;
        C0092r c0092r = c0094t.f135c;
        c0092r.getClass();
        return new C0091q(c0092r, c0094t, this.f131s);
    }

    public final String toString() {
        C0084j c0084j = new C0084j(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        c0084j.m146a(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
