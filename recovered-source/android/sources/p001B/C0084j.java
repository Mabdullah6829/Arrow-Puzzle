package p001B;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: B.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C0084j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f109a;

    /* JADX INFO: renamed from: b */
    public final String f110b;

    public /* synthetic */ C0084j(String str, int i2) {
        this.f109a = i2;
        this.f110b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m146a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f110b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        switch (this.f109a) {
            case 1:
                return AbstractC0271e0.m401i(new StringBuilder("<"), this.f110b, '>');
            case 2:
                return this.f110b;
            default:
                return super.toString();
        }
    }

    public C0084j(String str) {
        this.f109a = 0;
        str.getClass();
        this.f110b = str;
    }
}
