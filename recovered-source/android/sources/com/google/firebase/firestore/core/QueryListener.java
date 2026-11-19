package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.ListenSource;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class QueryListener {
    private final EventListener<ViewSnapshot> listener;
    private final EventManager.ListenOptions options;
    private final QueryOrPipeline query;

    @Nullable
    private ViewSnapshot snapshot;
    private boolean raisedInitialEvent = false;
    private OnlineState onlineState = OnlineState.UNKNOWN;

    public QueryListener(QueryOrPipeline queryOrPipeline, EventManager.ListenOptions listenOptions, EventListener<ViewSnapshot> eventListener) {
        if (queryOrPipeline.isPipeline()) {
            this.query = new QueryOrPipeline.PipelineWrapper(queryOrPipeline.pipeline$com_google_firebase_firebase_firestore().withListenOptions$com_google_firebase_firebase_firestore(listenOptions));
        } else {
            this.query = queryOrPipeline;
        }
        this.listener = eventListener;
        this.options = listenOptions;
    }

    private void raiseInitialEvent(ViewSnapshot viewSnapshot) {
        Assert.hardAssert(!this.raisedInitialEvent, "Trying to raise initial event for second time", new Object[0]);
        ViewSnapshot viewSnapshotFromInitialDocuments = ViewSnapshot.fromInitialDocuments(viewSnapshot.getQuery(), viewSnapshot.getDocuments(), viewSnapshot.getMutatedKeys(), viewSnapshot.isFromCache(), viewSnapshot.excludesMetadataChanges(), viewSnapshot.hasCachedResults());
        this.raisedInitialEvent = true;
        this.listener.onEvent(viewSnapshotFromInitialDocuments, null);
    }

    private boolean shouldRaiseEvent(ViewSnapshot viewSnapshot) {
        if (!viewSnapshot.getChanges().isEmpty()) {
            return true;
        }
        ViewSnapshot viewSnapshot2 = this.snapshot;
        boolean z = (viewSnapshot2 == null || viewSnapshot2.hasPendingWrites() == viewSnapshot.hasPendingWrites()) ? false : true;
        if (viewSnapshot.didSyncStateChange() || z) {
            return this.options.includeQueryMetadataChanges;
        }
        return false;
    }

    private boolean shouldRaiseInitialEvent(ViewSnapshot viewSnapshot, OnlineState onlineState) {
        Assert.hardAssert(!this.raisedInitialEvent, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!viewSnapshot.isFromCache() || !listensToRemoteStore()) {
            return true;
        }
        OnlineState onlineState2 = OnlineState.OFFLINE;
        boolean zEquals = onlineState.equals(onlineState2);
        if (!this.options.waitForSyncWhenOnline || zEquals) {
            return !viewSnapshot.getDocuments().isEmpty() || viewSnapshot.hasCachedResults() || onlineState.equals(onlineState2);
        }
        Assert.hardAssert(viewSnapshot.isFromCache(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }

    public QueryOrPipeline getQuery() {
        return this.query;
    }

    public boolean listensToRemoteStore() {
        EventManager.ListenOptions listenOptions = this.options;
        if (listenOptions != null) {
            return !listenOptions.source.equals(ListenSource.CACHE);
        }
        return true;
    }

    public void onError(FirebaseFirestoreException firebaseFirestoreException) {
        this.listener.onEvent(null, firebaseFirestoreException);
    }

    public boolean onOnlineStateChanged(OnlineState onlineState) {
        this.onlineState = onlineState;
        ViewSnapshot viewSnapshot = this.snapshot;
        if (viewSnapshot == null || this.raisedInitialEvent || !shouldRaiseInitialEvent(viewSnapshot, onlineState)) {
            return false;
        }
        raiseInitialEvent(this.snapshot);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    public boolean onViewSnapshot(ViewSnapshot viewSnapshot) {
        boolean z = true;
        Assert.hardAssert(!viewSnapshot.getChanges().isEmpty() || viewSnapshot.didSyncStateChange(), "We got a new snapshot with no changes?", new Object[0]);
        if (!this.options.includeDocumentMetadataChanges) {
            ArrayList arrayList = new ArrayList();
            for (DocumentViewChange documentViewChange : viewSnapshot.getChanges()) {
                if (documentViewChange.getType() != DocumentViewChange.Type.METADATA) {
                    arrayList.add(documentViewChange);
                }
            }
            viewSnapshot = new ViewSnapshot(viewSnapshot.getQuery(), viewSnapshot.getDocuments(), viewSnapshot.getOldDocuments(), arrayList, viewSnapshot.isFromCache(), viewSnapshot.getMutatedKeys(), viewSnapshot.didSyncStateChange(), true, viewSnapshot.hasCachedResults());
        }
        if (this.raisedInitialEvent) {
            if (shouldRaiseEvent(viewSnapshot)) {
                this.listener.onEvent(viewSnapshot, null);
            } else {
                z = false;
            }
        } else if (shouldRaiseInitialEvent(viewSnapshot, this.onlineState)) {
            raiseInitialEvent(viewSnapshot);
        } else {
            z = false;
        }
        this.snapshot = viewSnapshot;
        return z;
    }
}
