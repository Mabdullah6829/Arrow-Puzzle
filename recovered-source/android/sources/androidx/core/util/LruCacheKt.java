package androidx.core.util;

import android.util.LruCache;
import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6504r;

/* JADX INFO: loaded from: classes.dex */
public final class LruCacheKt {

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$1 */
    public static final class C12191 extends AbstractC6453l implements InterfaceC6502p {
        public static final C12191 INSTANCE = new C12191();

        public C12191() {
            super(2);
        }

        @Override // p078p0.InterfaceC6502p
        public final Integer invoke(Object obj, Object obj2) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$2 */
    public static final class C12202 extends AbstractC6453l implements InterfaceC6498l {
        public static final C12202 INSTANCE = new C12202();

        public C12202() {
            super(1);
        }

        @Override // p078p0.InterfaceC6498l
        public final Object invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$3 */
    public static final class C12213 extends AbstractC6453l implements InterfaceC6504r {
        public static final C12213 INSTANCE = new C12213();

        public C12213() {
            super(4);
        }

        public final void invoke(boolean z, Object obj, Object obj2, Object obj3) {
        }

        @Override // p078p0.InterfaceC6504r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$4 */
    public static final class C12224<K, V> extends LruCache<K, V> {
        final /* synthetic */ InterfaceC6498l $create;
        final /* synthetic */ InterfaceC6504r $onEntryRemoved;
        final /* synthetic */ InterfaceC6502p $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12224(int i2, InterfaceC6502p interfaceC6502p, InterfaceC6498l interfaceC6498l, InterfaceC6504r interfaceC6504r) {
            super(i2);
            this.$sizeOf = interfaceC6502p;
            this.$create = interfaceC6498l;
            this.$onEntryRemoved = interfaceC6504r;
        }

        @Override // android.util.LruCache
        public V create(K k2) {
            return (V) this.$create.invoke(k2);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, K k2, V v, V v2) {
            this.$onEntryRemoved.invoke(Boolean.valueOf(z), k2, v, v2);
        }

        @Override // android.util.LruCache
        public int sizeOf(K k2, V v) {
            return ((Number) this.$sizeOf.invoke(k2, v)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i2, InterfaceC6502p interfaceC6502p, InterfaceC6498l interfaceC6498l, InterfaceC6504r interfaceC6504r) {
        return new C12224(i2, interfaceC6502p, interfaceC6498l, interfaceC6504r);
    }

    public static /* synthetic */ LruCache lruCache$default(int i2, InterfaceC6502p interfaceC6502p, InterfaceC6498l interfaceC6498l, InterfaceC6504r interfaceC6504r, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            interfaceC6502p = C12191.INSTANCE;
        }
        if ((i3 & 4) != 0) {
            interfaceC6498l = C12202.INSTANCE;
        }
        if ((i3 & 8) != 0) {
            interfaceC6504r = C12213.INSTANCE;
        }
        return new C12224(i2, interfaceC6502p, interfaceC6498l, interfaceC6504r);
    }
}
