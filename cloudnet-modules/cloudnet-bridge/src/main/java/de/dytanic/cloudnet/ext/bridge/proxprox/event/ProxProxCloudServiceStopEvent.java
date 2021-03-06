package de.dytanic.cloudnet.ext.bridge.proxprox.event;

import de.dytanic.cloudnet.driver.service.ServiceInfoSnapshot;

public final class ProxProxCloudServiceStopEvent extends ProxProxCloudNetEvent {

    private final ServiceInfoSnapshot serviceInfoSnapshot;

    public ProxProxCloudServiceStopEvent(ServiceInfoSnapshot serviceInfoSnapshot) {
        this.serviceInfoSnapshot = serviceInfoSnapshot;
    }

    public ServiceInfoSnapshot getServiceInfoSnapshot() {
        return this.serviceInfoSnapshot;
    }
}