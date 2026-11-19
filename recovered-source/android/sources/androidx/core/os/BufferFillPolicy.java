package androidx.core.os;

import kotlin.jvm.internal.AbstractC6447f;

/* JADX INFO: loaded from: classes.dex */
public abstract class BufferFillPolicy {
    public static final Companion Companion = new Companion(null);
    public static final BufferFillPolicy DISCARD = new Discard();
    public static final BufferFillPolicy RING_BUFFER = new RingBuffer();
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Discard extends BufferFillPolicy {
        public Discard() {
            super(1, null);
        }
    }

    public static final class RingBuffer extends BufferFillPolicy {
        public RingBuffer() {
            super(2, null);
        }
    }

    public /* synthetic */ BufferFillPolicy(int i2, AbstractC6447f abstractC6447f) {
        this(i2);
    }

    public final int getValue$core_release() {
        return this.value;
    }

    private BufferFillPolicy(int i2) {
        this.value = i2;
    }
}
