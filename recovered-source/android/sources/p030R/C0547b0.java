package p030R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p036U.C0828i;

/* JADX INFO: renamed from: R.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0547b0 {

    /* JADX INFO: renamed from: c */
    public static final Logger f1156c = Logger.getLogger(C0547b0.class.getName());

    /* JADX INFO: renamed from: d */
    public static C0547b0 f1157d;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f1158a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public List f1159b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public static List m1282a() {
        Logger logger = f1156c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C0828i.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e3);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
