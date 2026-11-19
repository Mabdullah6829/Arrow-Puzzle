package androidx.datastore.core;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class CorruptionException extends IOException {
    public /* synthetic */ CorruptionException(String str, Throwable th, int i2, AbstractC6447f abstractC6447f) {
        this(str, (i2 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(String message, Throwable th) {
        super(message, th);
        AbstractC6452k.m12181e(message, "message");
    }
}
