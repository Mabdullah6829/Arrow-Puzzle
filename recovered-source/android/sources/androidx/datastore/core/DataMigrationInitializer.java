package androidx.datastore.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.C6462u;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class DataMigrationInitializer<T> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x006d  */
        /* JADX WARN: Code duplicated, block: B:37:0x0096  */
        /* JADX WARN: Code duplicated, block: B:39:0x0099  */
        /* JADX WARN: Code duplicated, block: B:43:0x007f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0067->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
        public final <T> Object runMigrations(List<? extends DataMigration<T>> list, InitializerApi<T> initializerApi, InterfaceC6348c interfaceC6348c) throws Throwable {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            List list2;
            C6462u c6462u;
            Iterator<T> it;
            Throwable th;
            InterfaceC6498l interfaceC6498l;
            if (interfaceC6348c instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) interfaceC6348c;
                int i2 = dataMigrationInitializer$Companion$runMigrations$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.label = i2 - Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, interfaceC6348c);
                }
            } else {
                dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, interfaceC6348c);
            }
            Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i3 = dataMigrationInitializer$Companion$runMigrations$1.label;
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                ArrayList arrayList = new ArrayList();
                DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = arrayList;
                dataMigrationInitializer$Companion$runMigrations$1.label = 1;
                if (initializerApi.updateData(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) != enumC6363a) {
                    list2 = arrayList;
                }
                return enumC6363a;
            }
            if (i3 == 1) {
                list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                AbstractC0243G.m377o(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) dataMigrationInitializer$Companion$runMigrations$1.L$1;
                c6462u = (C6462u) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                try {
                    AbstractC0243G.m377o(obj);
                } catch (Throwable th2) {
                    Object obj2 = c6462u.f24636s;
                    if (obj2 == null) {
                        c6462u.f24636s = th2;
                    } else {
                        AbstractC6452k.m12178b(obj2);
                        AbstractC0878a.m1796b((Throwable) obj2, th2);
                    }
                }
            }
            while (it.hasNext()) {
                interfaceC6498l = (InterfaceC6498l) it.next();
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = c6462u;
                dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                if (interfaceC6498l.invoke(dataMigrationInitializer$Companion$runMigrations$1) == enumC6363a) {
                    return enumC6363a;
                }
            }
            th = (Throwable) c6462u.f24636s;
            if (th == null) {
                return C6289k.f24318a;
            }
            throw th;
            c6462u = new C6462u();
            it = list2.iterator();
            while (it.hasNext()) {
                interfaceC6498l = (InterfaceC6498l) it.next();
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = c6462u;
                dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                if (interfaceC6498l.invoke(dataMigrationInitializer$Companion$runMigrations$1) == enumC6363a) {
                    return enumC6363a;
                }
            }
            th = (Throwable) c6462u.f24636s;
            if (th == null) {
                return C6289k.f24318a;
            }
            throw th;
        }

        public final <T> InterfaceC6502p getInitializer(List<? extends DataMigration<T>> migrations) {
            AbstractC6452k.m12181e(migrations, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
        }

        private Companion() {
        }
    }
}
