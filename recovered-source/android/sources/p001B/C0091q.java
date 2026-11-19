package p001B;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p072l.AbstractC6468c;

/* JADX INFO: renamed from: B.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0091q implements Iterator {

    /* JADX INFO: renamed from: t */
    public String f122t;

    /* JADX INFO: renamed from: u */
    public final String f123u;

    /* JADX INFO: renamed from: v */
    public final AbstractC0076b f124v;

    /* JADX INFO: renamed from: w */
    public final boolean f125w;

    /* JADX INFO: renamed from: y */
    public int f127y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0092r f128z;

    /* JADX INFO: renamed from: s */
    public int f121s = 2;

    /* JADX INFO: renamed from: x */
    public int f126x = 0;

    public C0091q(C0092r c0092r, C0094t c0094t, String str) {
        this.f128z = c0092r;
        this.f124v = c0094t.f133a;
        this.f125w = c0094t.f134b;
        this.f127y = c0094t.f136d;
        this.f123u = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC0076b abstractC0076b;
        AbstractC0076b.m138m(this.f121s != 4);
        int iM12193b = AbstractC6468c.m12193b(this.f121s);
        if (iM12193b == 0) {
            return true;
        }
        if (iM12193b != 2) {
            this.f121s = 4;
            int i2 = this.f126x;
            while (true) {
                int length = this.f126x;
                if (length == -1) {
                    this.f121s = 3;
                    string = null;
                    break;
                }
                C0077c c0077c = (C0077c) this.f128z.f130t;
                String str = this.f123u;
                int length2 = str.length();
                AbstractC0076b.m135j(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (c0077c.mo145q(str.charAt(length))) {
                        break;
                    }
                    length++;
                }
                String str2 = this.f123u;
                if (length == -1) {
                    length = str2.length();
                    this.f126x = -1;
                } else {
                    this.f126x = length + 1;
                }
                int i3 = this.f126x;
                if (i3 == i2) {
                    int i4 = i3 + 1;
                    this.f126x = i4;
                    if (i4 > str2.length()) {
                        this.f126x = -1;
                    }
                } else {
                    while (true) {
                        abstractC0076b = this.f124v;
                        if (i2 >= length || !abstractC0076b.mo145q(str2.charAt(i2))) {
                            break;
                        }
                        i2++;
                    }
                    while (length > i2 && abstractC0076b.mo145q(str2.charAt(length - 1))) {
                        length--;
                    }
                    if (!this.f125w || i2 != length) {
                        int i5 = this.f127y;
                        if (i5 == 1) {
                            length = str2.length();
                            this.f126x = -1;
                            while (length > i2 && abstractC0076b.mo145q(str2.charAt(length - 1))) {
                                length--;
                            }
                        } else {
                            this.f127y = i5 - 1;
                        }
                        string = str2.subSequence(i2, length).toString();
                        break;
                    }
                    i2 = this.f126x;
                }
            }
            this.f122t = string;
            if (this.f121s != 3) {
                this.f121s = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f121s = 2;
        String str = this.f122t;
        this.f122t = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
