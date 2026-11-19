package p069k;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.concurrent.Executors;
import p074m.InterfaceC6475b;
import p076n.C6477a;
import p076n.C6478b;
import p076n.C6480d;
import p076n.C6481e;
import p076n.C6482f;
import p076n.C6483g;

/* JADX INFO: renamed from: k.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6427h implements Configurator, InterfaceC6475b {

    /* JADX INFO: renamed from: s */
    public static final C6427h f24577s = new C6427h();

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(AbstractC6435p.class, C6424e.f24570a);
        encoderConfig.registerEncoder(C6477a.class, C6420a.f24557a);
        encoderConfig.registerEncoder(C6483g.class, C6426g.f24574a);
        encoderConfig.registerEncoder(C6481e.class, C6423d.f24567a);
        encoderConfig.registerEncoder(C6480d.class, C6422c.f24564a);
        encoderConfig.registerEncoder(C6478b.class, C6421b.f24562a);
        encoderConfig.registerEncoder(C6482f.class, C6425f.f24571a);
    }

    @Override // p050c0.InterfaceC1888a
    public Object get() {
        return new ExecutorC6436q(Executors.newSingleThreadExecutor());
    }
}
