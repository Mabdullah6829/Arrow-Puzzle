package p000A0;

import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: A0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0009J implements InterfaceC0018T {

    /* JADX INFO: renamed from: s */
    public final boolean f5s;

    public C0009J(boolean z) {
        this.f5s = z;
    }

    @Override // p000A0.InterfaceC0018T
    /* JADX INFO: renamed from: c */
    public final boolean mo10c() {
        return this.f5s;
    }

    @Override // p000A0.InterfaceC0018T
    /* JADX INFO: renamed from: d */
    public final C0038g0 mo11d() {
        return null;
    }

    public final String toString() {
        return AbstractC0271e0.m401i(new StringBuilder("Empty{"), this.f5s ? "Active" : "New", '}');
    }
}
