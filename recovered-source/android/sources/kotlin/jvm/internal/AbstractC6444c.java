package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p088w0.EnumC6557l;
import p088w0.InterfaceC6547b;
import p088w0.InterfaceC6549d;
import p088w0.InterfaceC6556k;

/* JADX INFO: renamed from: kotlin.jvm.internal.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6444c implements InterfaceC6547b, Serializable {
    public static final Object NO_RECEIVER = C6443b.f24627s;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC6547b reflected;
    private final String signature;

    public AbstractC6444c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // p088w0.InterfaceC6547b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p088w0.InterfaceC6547b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC6547b compute() {
        InterfaceC6547b interfaceC6547b = this.reflected;
        if (interfaceC6547b != null) {
            return interfaceC6547b;
        }
        InterfaceC6547b interfaceC6547bComputeReflected = computeReflected();
        this.reflected = interfaceC6547bComputeReflected;
        return interfaceC6547bComputeReflected;
    }

    public abstract InterfaceC6547b computeReflected();

    @Override // p088w0.InterfaceC6546a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC6549d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return AbstractC6463v.m12189a(cls);
        }
        AbstractC6463v.f24637a.getClass();
        return new C6454m(cls);
    }

    @Override // p088w0.InterfaceC6547b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC6547b getReflected();

    @Override // p088w0.InterfaceC6547b
    public InterfaceC6556k getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p088w0.InterfaceC6547b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p088w0.InterfaceC6547b
    public EnumC6557l getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p088w0.InterfaceC6547b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p088w0.InterfaceC6547b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p088w0.InterfaceC6547b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p088w0.InterfaceC6547b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
