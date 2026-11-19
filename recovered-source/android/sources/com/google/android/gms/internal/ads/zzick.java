package com.google.android.gms.internal.ads;

import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzick extends Writer {

    /* JADX INFO: renamed from: s */
    public final StringBuilder f19668s;

    /* JADX INFO: renamed from: t */
    public final zzicj f19669t = new zzicj();

    public zzick(StringBuilder sb) {
        this.f19668s = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f19668s.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        zzicj zzicjVar = this.f19669t;
        zzicjVar.f19666s = cArr;
        zzicjVar.f19667t = null;
        this.f19668s.append((CharSequence) zzicjVar, i2, i3 + i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i2, int i3) {
        this.f19668s.append(charSequence, i2, i3);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i2, int i3) {
        append(charSequence, i2, i3);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i2) {
        this.f19668s.append((char) i2);
    }

    @Override // java.io.Writer
    public final void write(String str, int i2, int i3) {
        Objects.requireNonNull(str);
        this.f19668s.append((CharSequence) str, i2, i3 + i2);
    }
}
