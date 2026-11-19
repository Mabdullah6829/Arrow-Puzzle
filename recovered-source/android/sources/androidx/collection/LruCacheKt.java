package androidx.collection;

import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6504r;

/* JADX INFO: loaded from: classes.dex */
public final class LruCacheKt {

    /* JADX INFO: renamed from: androidx.collection.LruCacheKt$lruCache$1 */
    public static final class C10881 extends AbstractC6453l implements InterfaceC6502p {
        public static final C10881 INSTANCE = new C10881();

        public C10881() {
            super(2);
        }

        @Override // p078p0.InterfaceC6502p
        public final Integer invoke(Object obj, Object obj2) {
            AbstractC6452k.m12181e(obj, "<anonymous parameter 0>");
            AbstractC6452k.m12181e(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.LruCacheKt$lruCache$2 */
    public static final class C10892 extends AbstractC6453l implements InterfaceC6498l {
        public static final C10892 INSTANCE = new C10892();

        public C10892() {
            super(1);
        }

        @Override // p078p0.InterfaceC6498l
        public final Object invoke(Object it) {
            AbstractC6452k.m12181e(it, "it");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.LruCacheKt$lruCache$3 */
    public static final class C10903 extends AbstractC6453l implements InterfaceC6504r {
        public static final C10903 INSTANCE = new C10903();

        public C10903() {
            super(4);
        }

        public final void invoke(boolean z, Object obj, Object obj2, Object obj3) {
            AbstractC6452k.m12181e(obj, "<anonymous parameter 1>");
            AbstractC6452k.m12181e(obj2, "<anonymous parameter 2>");
        }

        @Override // p078p0.InterfaceC6504r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.collection.LruCacheKt$lruCache$4 */
    public static final class C10914<K, V> extends LruCache<K, V> {
        final /* synthetic */ InterfaceC6498l $create;
        final /* synthetic */ InterfaceC6504r $onEntryRemoved;
        final /* synthetic */ InterfaceC6502p $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10914(int i2, InterfaceC6502p interfaceC6502p, InterfaceC6498l interfaceC6498l, InterfaceC6504r interfaceC6504r) {
            super(i2);
            this.$sizeOf = interfaceC6502p;
            this.$create = interfaceC6498l;
            this.$onEntryRemoved = interfaceC6504r;
        }

        @Override // androidx.collection.LruCache
        public V create(K key) {
            AbstractC6452k.m12181e(key, "key");
            return (V) this.$create.invoke(key);
        }

        @Override // androidx.collection.LruCache
        public void entryRemoved(boolean z, K key, V oldValue, V v) {
            AbstractC6452k.m12181e(key, "key");
            AbstractC6452k.m12181e(oldValue, "oldValue");
            this.$onEntryRemoved.invoke(Boolean.valueOf(z), key, oldValue, v);
        }

        @Override // androidx.collection.LruCache
        public int sizeOf(K key, V value) {
            AbstractC6452k.m12181e(key, "key");
            AbstractC6452k.m12181e(value, "value");
            return ((Number) this.$sizeOf.invoke(key, value)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i2, InterfaceC6502p sizeOf, InterfaceC6498l create, InterfaceC6504r onEntryRemoved) {
        AbstractC6452k.m12181e(sizeOf, "sizeOf");
        AbstractC6452k.m12181e(create, "create");
        AbstractC6452k.m12181e(onEntryRemoved, "onEntryRemoved");
        return new C10914(i2, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i2, InterfaceC6502p sizeOf, InterfaceC6498l create, InterfaceC6504r onEntryRemoved, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            sizeOf = C10881.INSTANCE;
        }
        if ((i3 & 4) != 0) {
            create = C10892.INSTANCE;
        }
        if ((i3 & 8) != 0) {
            onEntryRemoved = C10903.INSTANCE;
        }
        AbstractC6452k.m12181e(sizeOf, "sizeOf");
        AbstractC6452k.m12181e(create, "create");
        AbstractC6452k.m12181e(onEntryRemoved, "onEntryRemoved");
        return new C10914(i2, sizeOf, create, onEntryRemoved);
    }
}
