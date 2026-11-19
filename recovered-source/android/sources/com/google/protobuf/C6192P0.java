package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6192P0 implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f24116s = -1;

    /* JADX INFO: renamed from: t */
    public boolean f24117t;

    /* JADX INFO: renamed from: u */
    public Iterator f24118u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C6182K0 f24119v;

    public C6192P0(C6182K0 c6182k0) {
        this.f24119v = c6182k0;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m11810a() {
        if (this.f24118u == null) {
            this.f24118u = this.f24119v.f24099u.entrySet().iterator();
        }
        return this.f24118u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f24116s + 1;
        C6182K0 c6182k0 = this.f24119v;
        return i2 < c6182k0.f24098t.size() || (!c6182k0.f24099u.isEmpty() && m11810a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f24117t = true;
        int i2 = this.f24116s + 1;
        this.f24116s = i2;
        C6182K0 c6182k0 = this.f24119v;
        return i2 < c6182k0.f24098t.size() ? (Map.Entry) c6182k0.f24098t.get(this.f24116s) : (Map.Entry) m11810a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f24117t) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f24117t = false;
        int i2 = C6182K0.f24096y;
        C6182K0 c6182k0 = this.f24119v;
        c6182k0.m11771b();
        if (this.f24116s >= c6182k0.f24098t.size()) {
            m11810a().remove();
            return;
        }
        int i3 = this.f24116s;
        this.f24116s = i3 - 1;
        c6182k0.m11776g(i3);
    }
}
