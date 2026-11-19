package com.google.firebase.firestore;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.util.Executors;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p004C0.EnumC0136a;
import p004C0.InterfaceC0152q;
import p006D0.C0168c;
import p006D0.InterfaceC0170e;
import p011H.AbstractC0242F;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.C6354i;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public final class FirestoreKt {

    /* JADX INFO: renamed from: com.google.firebase.firestore.FirestoreKt$snapshots$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.firestore.FirestoreKt$snapshots$1", m12159f = "Firestore.kt", m12160l = {242}, m12161m = "invokeSuspend")
    public static final class C57261 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ MetadataChanges $metadataChanges;
        final /* synthetic */ DocumentReference $this_snapshots;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57261(DocumentReference documentReference, MetadataChanges metadataChanges, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$this_snapshots = documentReference;
            this.$metadataChanges = metadataChanges;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC0152q interfaceC0152q, DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null) {
                AbstractC0069y.m104c(interfaceC0152q, "Error getting DocumentReference snapshot", firebaseFirestoreException);
            } else if (documentSnapshot != null) {
                AbstractC0242F.m360q(interfaceC0152q, documentSnapshot);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6289k invokeSuspend$lambda$1(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return C6289k.f24318a;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C57261 c57261 = new C57261(this.$this_snapshots, this.$metadataChanges, interfaceC6348c);
            c57261.L$0 = obj;
            return c57261;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0152q interfaceC0152q, InterfaceC6348c interfaceC6348c) {
            return ((C57261) create(interfaceC0152q, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                InterfaceC0152q interfaceC0152q = (InterfaceC0152q) this.L$0;
                ListenerRegistration listenerRegistrationAddSnapshotListener = this.$this_snapshots.addSnapshotListener(Executors.BACKGROUND_EXECUTOR, this.$metadataChanges, new C5941q(interfaceC0152q, 0));
                AbstractC6452k.m12180d(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                C5942r c5942r = new C5942r(listenerRegistrationAddSnapshotListener, 0);
                this.label = 1;
                if (AbstractC0243G.m367e(interfaceC0152q, c5942r, this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.FirestoreKt$snapshots$2 */
    @InterfaceC6375e(m12158c = "com.google.firebase.firestore.FirestoreKt$snapshots$2", m12159f = "Firestore.kt", m12160l = {266}, m12161m = "invokeSuspend")
    public static final class C57272 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ MetadataChanges $metadataChanges;
        final /* synthetic */ Query $this_snapshots;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57272(Query query, MetadataChanges metadataChanges, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$this_snapshots = query;
            this.$metadataChanges = metadataChanges;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC0152q interfaceC0152q, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null) {
                AbstractC0069y.m104c(interfaceC0152q, "Error getting Query snapshot", firebaseFirestoreException);
            } else if (querySnapshot != null) {
                AbstractC0242F.m360q(interfaceC0152q, querySnapshot);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6289k invokeSuspend$lambda$1(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return C6289k.f24318a;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C57272 c57272 = new C57272(this.$this_snapshots, this.$metadataChanges, interfaceC6348c);
            c57272.L$0 = obj;
            return c57272;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0152q interfaceC0152q, InterfaceC6348c interfaceC6348c) {
            return ((C57272) create(interfaceC0152q, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                InterfaceC0152q interfaceC0152q = (InterfaceC0152q) this.L$0;
                ListenerRegistration listenerRegistrationAddSnapshotListener = this.$this_snapshots.addSnapshotListener(Executors.BACKGROUND_EXECUTOR, this.$metadataChanges, new C5941q(interfaceC0152q, 1));
                AbstractC6452k.m12180d(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                C5942r c5942r = new C5942r(listenerRegistrationAddSnapshotListener, 1);
                this.label = 1;
                if (AbstractC0243G.m367e(interfaceC0152q, c5942r, this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    public static final <T> InterfaceC0170e dataObjects(Query query, MetadataChanges metadataChanges) {
        AbstractC6452k.m12181e(query, "<this>");
        AbstractC6452k.m12181e(metadataChanges, "metadataChanges");
        snapshots(query, metadataChanges);
        AbstractC6452k.m12184h();
        throw null;
    }

    public static InterfaceC0170e dataObjects$default(Query query, MetadataChanges metadataChanges, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        AbstractC6452k.m12181e(query, "<this>");
        AbstractC6452k.m12181e(metadataChanges, "metadataChanges");
        snapshots(query, metadataChanges);
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final FirebaseFirestore firestore(Firebase firebase, FirebaseApp app) {
        AbstractC6452k.m12181e(firebase, "<this>");
        AbstractC6452k.m12181e(app, "app");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(app);
        AbstractC6452k.m12180d(firebaseFirestore, "getInstance(...)");
        return firebaseFirestore;
    }

    public static final FirebaseFirestoreSettings firestoreSettings(InterfaceC6498l init) {
        AbstractC6452k.m12181e(init, "init");
        FirebaseFirestoreSettings.Builder builder = new FirebaseFirestoreSettings.Builder();
        init.invoke(builder);
        FirebaseFirestoreSettings firebaseFirestoreSettingsBuild = builder.build();
        AbstractC6452k.m12180d(firebaseFirestoreSettingsBuild, "build(...)");
        return firebaseFirestoreSettingsBuild;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, FieldPath fieldPath) {
        AbstractC6452k.m12181e(documentSnapshot, "<this>");
        AbstractC6452k.m12181e(fieldPath, "fieldPath");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final FirebaseFirestore getFirestore(Firebase firebase) {
        AbstractC6452k.m12181e(firebase, "<this>");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
        AbstractC6452k.m12180d(firebaseFirestore, "getInstance(...)");
        return firebaseFirestore;
    }

    public static final MemoryCacheSettings memoryCacheSettings(InterfaceC6498l init) {
        AbstractC6452k.m12181e(init, "init");
        MemoryCacheSettings.Builder builderNewBuilder = MemoryCacheSettings.newBuilder();
        AbstractC6452k.m12180d(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        MemoryCacheSettings memoryCacheSettingsBuild = builderNewBuilder.build();
        AbstractC6452k.m12180d(memoryCacheSettingsBuild, "build(...)");
        return memoryCacheSettingsBuild;
    }

    public static final MemoryEagerGcSettings memoryEagerGcSettings(InterfaceC6498l init) {
        AbstractC6452k.m12181e(init, "init");
        MemoryEagerGcSettings.Builder builderNewBuilder = MemoryEagerGcSettings.newBuilder();
        AbstractC6452k.m12180d(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        MemoryEagerGcSettings memoryEagerGcSettingsBuild = builderNewBuilder.build();
        AbstractC6452k.m12180d(memoryEagerGcSettingsBuild, "build(...)");
        return memoryEagerGcSettingsBuild;
    }

    public static final MemoryLruGcSettings memoryLruGcSettings(InterfaceC6498l init) {
        AbstractC6452k.m12181e(init, "init");
        MemoryLruGcSettings.Builder builderNewBuilder = MemoryLruGcSettings.newBuilder();
        AbstractC6452k.m12180d(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        MemoryLruGcSettings memoryLruGcSettingsBuild = builderNewBuilder.build();
        AbstractC6452k.m12180d(memoryLruGcSettingsBuild, "build(...)");
        return memoryLruGcSettingsBuild;
    }

    public static final PersistentCacheSettings persistentCacheSettings(InterfaceC6498l init) {
        AbstractC6452k.m12181e(init, "init");
        PersistentCacheSettings.Builder builderNewBuilder = PersistentCacheSettings.newBuilder();
        AbstractC6452k.m12180d(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        PersistentCacheSettings persistentCacheSettingsBuild = builderNewBuilder.build();
        AbstractC6452k.m12180d(persistentCacheSettingsBuild, "build(...)");
        return persistentCacheSettingsBuild;
    }

    public static final InterfaceC0170e snapshots(DocumentReference documentReference, MetadataChanges metadataChanges) {
        AbstractC6452k.m12181e(documentReference, "<this>");
        AbstractC6452k.m12181e(metadataChanges, "metadataChanges");
        return new C0168c(new C57261(documentReference, metadataChanges, null), C6354i.f24409s, -2, EnumC0136a.f215s);
    }

    public static /* synthetic */ InterfaceC0170e snapshots$default(DocumentReference documentReference, MetadataChanges metadataChanges, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        return snapshots(documentReference, metadataChanges);
    }

    public static final <T> T toObject(DocumentSnapshot documentSnapshot) {
        AbstractC6452k.m12181e(documentSnapshot, "<this>");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final <T> List<T> toObjects(QuerySnapshot querySnapshot) {
        AbstractC6452k.m12181e(querySnapshot, "<this>");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final FirebaseFirestore firestore(Firebase firebase, FirebaseApp app, String database) {
        AbstractC6452k.m12181e(firebase, "<this>");
        AbstractC6452k.m12181e(app, "app");
        AbstractC6452k.m12181e(database, "database");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(app, database);
        AbstractC6452k.m12180d(firebaseFirestore, "getInstance(...)");
        return firebaseFirestore;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, FieldPath fieldPath, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        AbstractC6452k.m12181e(documentSnapshot, "<this>");
        AbstractC6452k.m12181e(fieldPath, "fieldPath");
        AbstractC6452k.m12181e(serverTimestampBehavior, "serverTimestampBehavior");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final <T> T toObject(DocumentSnapshot documentSnapshot, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        AbstractC6452k.m12181e(documentSnapshot, "<this>");
        AbstractC6452k.m12181e(serverTimestampBehavior, "serverTimestampBehavior");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final <T> List<T> toObjects(QuerySnapshot querySnapshot, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        AbstractC6452k.m12181e(querySnapshot, "<this>");
        AbstractC6452k.m12181e(serverTimestampBehavior, "serverTimestampBehavior");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final <T> InterfaceC0170e dataObjects(DocumentReference documentReference, MetadataChanges metadataChanges) {
        AbstractC6452k.m12181e(documentReference, "<this>");
        AbstractC6452k.m12181e(metadataChanges, "metadataChanges");
        snapshots(documentReference, metadataChanges);
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final FirebaseFirestore firestore(Firebase firebase, String database) {
        AbstractC6452k.m12181e(firebase, "<this>");
        AbstractC6452k.m12181e(database, "database");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(database);
        AbstractC6452k.m12180d(firebaseFirestore, "getInstance(...)");
        return firebaseFirestore;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, String field) {
        AbstractC6452k.m12181e(documentSnapshot, "<this>");
        AbstractC6452k.m12181e(field, "field");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static /* synthetic */ InterfaceC0170e snapshots$default(Query query, MetadataChanges metadataChanges, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        return snapshots(query, metadataChanges);
    }

    public static final <T> T toObject(QueryDocumentSnapshot queryDocumentSnapshot) {
        AbstractC6452k.m12181e(queryDocumentSnapshot, "<this>");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, String field, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        AbstractC6452k.m12181e(documentSnapshot, "<this>");
        AbstractC6452k.m12181e(field, "field");
        AbstractC6452k.m12181e(serverTimestampBehavior, "serverTimestampBehavior");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final <T> T toObject(QueryDocumentSnapshot queryDocumentSnapshot, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        AbstractC6452k.m12181e(queryDocumentSnapshot, "<this>");
        AbstractC6452k.m12181e(serverTimestampBehavior, "serverTimestampBehavior");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static InterfaceC0170e dataObjects$default(DocumentReference documentReference, MetadataChanges metadataChanges, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        AbstractC6452k.m12181e(documentReference, "<this>");
        AbstractC6452k.m12181e(metadataChanges, "metadataChanges");
        snapshots(documentReference, metadataChanges);
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final InterfaceC0170e snapshots(Query query, MetadataChanges metadataChanges) {
        AbstractC6452k.m12181e(query, "<this>");
        AbstractC6452k.m12181e(metadataChanges, "metadataChanges");
        return new C0168c(new C57272(query, metadataChanges, null), C6354i.f24409s, -2, EnumC0136a.f215s);
    }
}
