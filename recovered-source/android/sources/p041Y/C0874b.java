package p041Y;

import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6262s0;
import p001B.AbstractC0076b;
import p030R.InterfaceC0563j0;

/* JADX INFO: renamed from: Y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0874b implements InterfaceC0563j0 {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f2452d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final InterfaceC6162A0 f2453a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6262s0 f2454b;

    /* JADX INFO: renamed from: c */
    public final int f2455c;

    public C0874b(InterfaceC6262s0 interfaceC6262s0) {
        AbstractC0076b.m133h(interfaceC6262s0, "defaultInstance cannot be null");
        this.f2454b = interfaceC6262s0;
        this.f2453a = interfaceC6262s0.getParserForType();
        this.f2455c = -1;
    }
}
