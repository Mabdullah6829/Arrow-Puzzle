package p091y0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6452k;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: y0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6572b implements Iterator, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final CharSequence f24800s;

    /* JADX INFO: renamed from: t */
    public int f24801t;

    /* JADX INFO: renamed from: u */
    public int f24802u;

    /* JADX INFO: renamed from: v */
    public int f24803v;

    /* JADX INFO: renamed from: w */
    public int f24804w;

    public C6572b(CharSequence string) {
        AbstractC6452k.m12181e(string, "string");
        this.f24800s = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        int i3;
        int i4 = this.f24801t;
        if (i4 != 0) {
            return i4 == 1;
        }
        if (this.f24804w < 0) {
            this.f24801t = 2;
            return false;
        }
        CharSequence charSequence = this.f24800s;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i5 = this.f24802u; i5 < length2; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i2 = (cCharAt == '\r' && (i3 = i5 + 1) < charSequence.length() && charSequence.charAt(i3) == '\n') ? 2 : 1;
                length = i5;
                this.f24801t = 1;
                this.f24804w = i2;
                this.f24803v = length;
                return true;
            }
        }
        i2 = -1;
        this.f24801t = 1;
        this.f24804w = i2;
        this.f24803v = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f24801t = 0;
        int i2 = this.f24803v;
        int i3 = this.f24802u;
        this.f24802u = this.f24804w + i2;
        return this.f24800s.subSequence(i3, i2).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
