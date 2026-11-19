package androidx.core.util;

import p057d0.C6283e;

/* JADX INFO: loaded from: classes.dex */
public final class PairKt {
    public static final <F, S> F component1(Pair<F, S> pair) {
        return pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        return pair.second;
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(C6283e c6283e) {
        return new android.util.Pair<>(c6283e.f24308s, c6283e.f24309t);
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(C6283e c6283e) {
        return new Pair<>(c6283e.f24308s, c6283e.f24309t);
    }

    public static final <F, S> C6283e toKotlinPair(Pair<F, S> pair) {
        return new C6283e(pair.first, pair.second);
    }

    public static final <F, S> F component1(android.util.Pair<F, S> pair) {
        return (F) pair.first;
    }

    public static final <F, S> S component2(android.util.Pair<F, S> pair) {
        return (S) pair.second;
    }

    public static final <F, S> C6283e toKotlinPair(android.util.Pair<F, S> pair) {
        return new C6283e(pair.first, pair.second);
    }
}
