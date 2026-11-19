package p069k;

import java.util.Set;
import p063h.C6357c;
import p063h.InterfaceC6359e;
import p063h.InterfaceC6361g;

/* JADX INFO: renamed from: k.s */
/* JADX INFO: loaded from: classes.dex */
public final class C6438s implements InterfaceC6361g {

    /* JADX INFO: renamed from: a */
    public final Set f24613a;

    /* JADX INFO: renamed from: b */
    public final C6430k f24614b;

    /* JADX INFO: renamed from: c */
    public final C6440u f24615c;

    public C6438s(Set set, C6430k c6430k, C6440u c6440u) {
        this.f24613a = set;
        this.f24614b = c6430k;
        this.f24615c = c6440u;
    }

    /* JADX INFO: renamed from: a */
    public final C6439t m12170a(String str, C6357c c6357c, InterfaceC6359e interfaceC6359e) {
        Set set = this.f24613a;
        if (set.contains(c6357c)) {
            return new C6439t(this.f24614b, str, c6357c, interfaceC6359e, this.f24615c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c6357c, set));
    }
}
