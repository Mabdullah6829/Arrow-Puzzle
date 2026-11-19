package p067j;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

/* JADX INFO: renamed from: j.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6403l implements Configurator {

    /* JADX INFO: renamed from: s */
    public static final C6403l f24507s = new C6403l();

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        C6394c c6394c = C6394c.f24471a;
        encoderConfig.registerEncoder(AbstractC6416y.class, c6394c);
        encoderConfig.registerEncoder(C6405n.class, c6394c);
        C6401j c6401j = C6401j.f24496a;
        encoderConfig.registerEncoder(AbstractC6387H.class, c6401j);
        encoderConfig.registerEncoder(C6413v.class, c6401j);
        C6395d c6395d = C6395d.f24473a;
        encoderConfig.registerEncoder(AbstractC6380A.class, c6395d);
        encoderConfig.registerEncoder(C6406o.class, c6395d);
        C6393b c6393b = C6393b.f24458a;
        encoderConfig.registerEncoder(AbstractC6392a.class, c6393b);
        encoderConfig.registerEncoder(C6404m.class, c6393b);
        C6400i c6400i = C6400i.f24486a;
        encoderConfig.registerEncoder(AbstractC6386G.class, c6400i);
        encoderConfig.registerEncoder(C6412u.class, c6400i);
        C6396e c6396e = C6396e.f24476a;
        encoderConfig.registerEncoder(AbstractC6382C.class, c6396e);
        encoderConfig.registerEncoder(C6407p.class, c6396e);
        C6399h c6399h = C6399h.f24484a;
        encoderConfig.registerEncoder(AbstractC6385F.class, c6399h);
        encoderConfig.registerEncoder(C6410s.class, c6399h);
        C6398g c6398g = C6398g.f24482a;
        encoderConfig.registerEncoder(AbstractC6384E.class, c6398g);
        encoderConfig.registerEncoder(C6409r.class, c6398g);
        C6402k c6402k = C6402k.f24504a;
        encoderConfig.registerEncoder(AbstractC6390K.class, c6402k);
        encoderConfig.registerEncoder(C6415x.class, c6402k);
        C6397f c6397f = C6397f.f24479a;
        encoderConfig.registerEncoder(AbstractC6383D.class, c6397f);
        encoderConfig.registerEncoder(C6408q.class, c6397f);
    }
}
