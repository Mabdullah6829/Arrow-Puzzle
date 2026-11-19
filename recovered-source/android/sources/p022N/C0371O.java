package p022N;

import com.google.protobuf.AbstractC6175H;
import com.google.protobuf.InterfaceC6264t0;
import java.util.Map;

/* JADX INFO: renamed from: N.O */
/* JADX INFO: loaded from: classes2.dex */
public final class C0371O extends AbstractC6175H implements InterfaceC6264t0 {
    /* JADX INFO: renamed from: b */
    public final boolean m632b(String str) {
        str.getClass();
        return ((C0375Q) this.instance).m648h().containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m633c(Map map) {
        copyOnWrite();
        C0375Q.m644e((C0375Q) this.instance).putAll(map);
    }

    /* JADX INFO: renamed from: d */
    public final void m634d(String str, C0393Z0 c0393z0) {
        str.getClass();
        c0393z0.getClass();
        copyOnWrite();
        C0375Q.m644e((C0375Q) this.instance).put(str, c0393z0);
    }

    /* JADX INFO: renamed from: e */
    public final void m635e(String str) {
        copyOnWrite();
        C0375Q.m644e((C0375Q) this.instance).remove(str);
    }
}
