package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzicq implements Closeable, Flushable {

    /* JADX INFO: renamed from: B */
    public static final Pattern f19684B = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: C */
    public static final String[] f19685C = new String[128];

    /* JADX INFO: renamed from: A */
    public String f19686A;

    /* JADX INFO: renamed from: s */
    public final Writer f19687s;

    /* JADX INFO: renamed from: t */
    public int[] f19688t;

    /* JADX INFO: renamed from: u */
    public int f19689u;

    /* JADX INFO: renamed from: v */
    public final zzibp f19690v;

    /* JADX INFO: renamed from: w */
    public final String f19691w;

    /* JADX INFO: renamed from: x */
    public final String f19692x;

    /* JADX INFO: renamed from: y */
    public final boolean f19693y;

    /* JADX INFO: renamed from: z */
    public zzibw f19694z;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f19685C[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f19685C;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzicq(Writer writer) {
        int[] iArr = new int[32];
        this.f19688t = iArr;
        boolean z = false;
        this.f19689u = 0;
        if (iArr.length == 0) {
            this.f19688t = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f19688t;
        int i2 = this.f19689u;
        this.f19689u = i2 + 1;
        iArr2[i2] = 6;
        this.f19694z = zzibw.f19626t;
        this.f19687s = writer;
        zzibp zzibpVar = zzibp.f19617d;
        Objects.requireNonNull(zzibpVar);
        String str = zzibpVar.f19618a;
        this.f19690v = zzibpVar;
        this.f19692x = ",";
        if (zzibpVar.f19620c) {
            this.f19691w = ": ";
            if (str.isEmpty()) {
                this.f19692x = ", ";
            }
        } else {
            this.f19691w = ":";
        }
        if (str.isEmpty() && zzibpVar.f19619b.isEmpty()) {
            z = true;
        }
        this.f19693y = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m8087c() throws IOException {
        if (this.f19686A != null) {
            m8090i();
        }
        m8093n();
        this.f19687s.write("null");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19687s.close();
        int i2 = this.f19689u;
        if (i2 > 1 || (i2 == 1 && this.f19688t[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f19689u = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m8088e(int i2, int i3, char c) throws IOException {
        int iM8089h = m8089h();
        if (iM8089h != i3 && iM8089h != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f19686A;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f19689u--;
        if (iM8089h == i3) {
            m8092l();
        }
        this.f19687s.write(c);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f19689u == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f19687s.flush();
    }

    /* JADX INFO: renamed from: h */
    public final int m8089h() {
        int i2 = this.f19689u;
        if (i2 != 0) {
            return this.f19688t[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: i */
    public final void m8090i() throws IOException {
        if (this.f19686A != null) {
            int iM8089h = m8089h();
            if (iM8089h == 5) {
                this.f19687s.write(this.f19692x);
            } else if (iM8089h != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m8092l();
            this.f19688t[this.f19689u - 1] = 4;
            m8091j(this.f19686A);
            this.f19686A = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX INFO: renamed from: j */
    public final void m8091j(String str) throws IOException {
        String str2;
        Writer writer = this.f19687s;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = f19685C[cCharAt];
                if (str2 != null) {
                    if (i3 < i2) {
                        writer.write(str, i3, i2 - i3);
                    }
                    writer.write(str2);
                    i3 = i4;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i3 < i2) {
                    writer.write(str, i3, i2 - i3);
                }
                writer.write(str2);
                i3 = i4;
            }
            i2 = i4;
        }
        if (i3 < length) {
            writer.write(str, i3, length - i3);
        }
        writer.write(34);
    }

    /* JADX INFO: renamed from: l */
    public final void m8092l() throws IOException {
        if (this.f19693y) {
            return;
        }
        zzibp zzibpVar = this.f19690v;
        String str = zzibpVar.f19618a;
        Writer writer = this.f19687s;
        writer.write(str);
        int i2 = this.f19689u;
        for (int i3 = 1; i3 < i2; i3++) {
            writer.write(zzibpVar.f19619b);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8093n() throws IOException {
        int iM8089h = m8089h();
        if (iM8089h == 1) {
            this.f19688t[this.f19689u - 1] = 2;
            m8092l();
            return;
        }
        Writer writer = this.f19687s;
        if (iM8089h == 2) {
            writer.append((CharSequence) this.f19692x);
            m8092l();
        } else {
            if (iM8089h == 4) {
                writer.append((CharSequence) this.f19691w);
                this.f19688t[this.f19689u - 1] = 5;
                return;
            }
            if (iM8089h != 6) {
                if (iM8089h != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f19694z != zzibw.f19625s) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f19688t[this.f19689u - 1] = 7;
        }
    }
}
