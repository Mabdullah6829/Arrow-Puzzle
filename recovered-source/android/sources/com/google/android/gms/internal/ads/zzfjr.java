package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfjr implements OnAdMetadataChangedListener, zzden, zzddc, zzdcz, zzddp, zzdfq, zzfib, zzdlg {

    /* JADX INFO: renamed from: s */
    public final zzfmr f15809s;

    /* JADX INFO: renamed from: t */
    public final AtomicReference f15810t = new AtomicReference();

    /* JADX INFO: renamed from: u */
    public final AtomicReference f15811u = new AtomicReference();

    /* JADX INFO: renamed from: v */
    public final AtomicReference f15812v = new AtomicReference();

    /* JADX INFO: renamed from: w */
    public final AtomicReference f15813w = new AtomicReference();

    /* JADX INFO: renamed from: x */
    public final AtomicReference f15814x = new AtomicReference();

    /* JADX INFO: renamed from: y */
    public final AtomicReference f15815y = new AtomicReference();

    /* JADX INFO: renamed from: z */
    public final AtomicReference f15816z = new AtomicReference();

    /* JADX INFO: renamed from: A */
    public final AtomicReference f15807A = new AtomicReference();

    /* JADX INFO: renamed from: B */
    public zzfjr f15808B = null;

    public zzfjr(zzfmr zzfmrVar) {
        this.f15809s = zzfmrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: C */
    public final void mo5626C() {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5626C();
        } else {
            zzfht.m6452a(this.f15812v, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjg
                @Override // com.google.android.gms.internal.ads.zzfhs
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6337b(Object obj) {
                    ((zzccs) obj).zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: F0 */
    public final void mo5627F0() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: G */
    public final void mo5824G() {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5824G();
            return;
        }
        zzfjh zzfjhVar = new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjh
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccs) obj).mo5332a();
            }
        };
        AtomicReference atomicReference = this.f15812v;
        zzfht.m6452a(atomicReference, zzfjhVar);
        zzfht.m6452a(this.f15813w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjj
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccc) obj).mo5314b();
            }
        });
        zzfht.m6452a(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfje
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccs) obj).zzj();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: a */
    public final void mo5825a() {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5825a();
        } else {
            zzfht.m6452a(this.f15813w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjm
                @Override // com.google.android.gms.internal.ads.zzfhs
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6337b(Object obj) {
                    ((zzccc) obj).mo5315c();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: b */
    public final void mo5826b() {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5826b();
        } else {
            zzfht.m6452a(this.f15813w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjn
                @Override // com.google.android.gms.internal.ads.zzfhs
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6337b(Object obj) {
                    ((zzccc) obj).zzl();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5833c();
        } else {
            zzfht.m6452a(this.f15811u, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfji
                @Override // com.google.android.gms.internal.ads.zzfhs
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6337b(Object obj) {
                    ((zzccw) obj).mo5338a();
                }
            });
            zzfht.m6452a(this.f15813w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjo
                @Override // com.google.android.gms.internal.ads.zzfhs
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6337b(Object obj) {
                    ((zzccc) obj).mo5313a();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfib
    /* JADX INFO: renamed from: d */
    public final void mo6438d(zzfib zzfibVar) {
        this.f15808B = (zzfjr) zzfibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    /* JADX INFO: renamed from: e */
    public final void mo5912e(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5912e(zztVar);
        } else {
            zzfht.m6452a(this.f15816z, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjc
                @Override // com.google.android.gms.internal.ads.zzfhs
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6337b(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).mo2913g3(zztVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    /* JADX INFO: renamed from: g */
    public final void mo3359g() {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo3359g();
        } else {
            zzfht.m6452a(this.f15810t, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjq
                @Override // com.google.android.gms.internal.ads.zzfhs
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6337b(Object obj) {
                    ((OnAdMetadataChangedListener) obj).mo3359g();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    /* JADX INFO: renamed from: j */
    public final void mo5837j(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5837j(zzeVar);
            return;
        }
        zzfhs zzfhsVar = new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfja
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccs) obj).mo5336w3(zzeVar);
            }
        };
        AtomicReference atomicReference = this.f15812v;
        zzfht.m6452a(atomicReference, zzfhsVar);
        zzfht.m6452a(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjb
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccs) obj).mo5335l(zzeVar.f3106s);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: l */
    public final void mo5827l(final zzcbt zzcbtVar, final String str, final String str2) {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5827l(zzcbtVar, str, str2);
            return;
        }
        zzfht.m6452a(this.f15812v, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfiw
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final void mo6337b(Object obj) {
                zzcbt zzcbtVar2 = zzcbtVar;
                ((zzccs) obj).mo5334b3(new zzcdg(zzcbtVar2.f9736s, zzcbtVar2.f9737t));
            }
        });
        zzfht.m6452a(this.f15814x, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfix
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final void mo6337b(Object obj) {
                zzccx zzccxVar = (zzccx) obj;
                zzcbt zzcbtVar2 = zzcbtVar;
                zzcdg zzcdgVar = new zzcdg(zzcbtVar2.f9736s, zzcbtVar2.f9737t);
                Parcel parcelM4810u = zzccxVar.m4810u();
                zzben.m4817e(parcelM4810u, zzcdgVar);
                parcelM4810u.writeString(str);
                parcelM4810u.writeString(str2);
                zzccxVar.m4811u0(2, parcelM4810u);
            }
        });
        zzfht.m6452a(this.f15813w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfiy
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccc) obj).mo5316f1(zzcbtVar);
            }
        });
        zzfht.m6452a(this.f15815y, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfiz
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final void mo6337b(Object obj) {
                zzcbx zzcbxVar = (zzcbx) obj;
                Parcel parcelM4810u = zzcbxVar.m4810u();
                zzben.m4817e(parcelM4810u, zzcbtVar);
                parcelM4810u.writeString(str);
                parcelM4810u.writeString(str2);
                zzcbxVar.m4811u0(2, parcelM4810u);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: u */
    public final void mo5828u() {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5828u();
        } else {
            zzfht.m6452a(this.f15813w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjl
                @Override // com.google.android.gms.internal.ads.zzfhs
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6337b(Object obj) {
                    ((zzccc) obj).zzj();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    /* JADX INFO: renamed from: v */
    public final void mo5830v(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5830v(zzeVar);
            return;
        }
        final int i2 = zzeVar.f3106s;
        zzfhs zzfhsVar = new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjd
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccw) obj).mo5340q(zzeVar);
            }
        };
        AtomicReference atomicReference = this.f15811u;
        zzfht.m6452a(atomicReference, zzfhsVar);
        zzfht.m6452a(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfiu
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccw) obj).mo5339o(i2);
            }
        });
        zzfht.m6452a(this.f15813w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfiv
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccc) obj).mo5312E(i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: x */
    public final void mo5829x() {
        zzfjr zzfjrVar = this.f15808B;
        if (zzfjrVar != null) {
            zzfjrVar.mo5829x();
            return;
        }
        zzfmq zzfmqVar = this.f15809s.f16120a;
        if (zzfmqVar != null) {
            zzfnr zzfnrVar = ((zzfnq) zzfmqVar).f16169a;
            synchronized (zzfnrVar) {
                zzfnrVar.f16174e = 1;
                zzfnrVar.m6545a();
            }
        }
        zzfht.m6452a(this.f15812v, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjf
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccs) obj).mo5333b();
            }
        });
        zzfht.m6452a(this.f15813w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjk
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzccc) obj).zzh();
            }
        });
        zzfht.m6452a(this.f15807A, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjp
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzfti) obj).m6668a();
            }
        });
    }
}
