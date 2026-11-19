package p034T;

import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.C0529K;
import p030R.C0546b;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0739h0 implements InterfaceC0654H {
    @Override // p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: a */
    public final Runnable mo1562a(InterfaceC0748j1 interfaceC0748j1) {
        return mo1611f().mo1562a(interfaceC0748j1);
    }

    @Override // p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: b */
    public void mo1563b(C0589w0 c0589w0) {
        mo1611f().mo1563b(c0589w0);
    }

    @Override // p030R.InterfaceC0528J
    /* JADX INFO: renamed from: d */
    public final C0529K mo1253d() {
        return mo1611f().mo1253d();
    }

    @Override // p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: e */
    public void mo1564e(C0589w0 c0589w0) {
        mo1611f().mo1564e(c0589w0);
    }

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC0654H mo1611f();

    @Override // p034T.InterfaceC0654H
    public final C0546b getAttributes() {
        return mo1611f().getAttributes();
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(mo1611f(), "delegate");
        return c0087mM143s.toString();
    }
}
