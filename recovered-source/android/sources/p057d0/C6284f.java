package p057d0;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: d0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6284f implements Serializable {

    /* JADX INFO: renamed from: s */
    public final Throwable f24310s;

    public C6284f(Throwable exception) {
        AbstractC6452k.m12181e(exception, "exception");
        this.f24310s = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6284f) {
            return AbstractC6452k.m12177a(this.f24310s, ((C6284f) obj).f24310s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24310s.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f24310s + ')';
    }
}
