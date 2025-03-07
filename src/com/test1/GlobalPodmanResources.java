package com.test1;

public class GlobalPodmanResources {
	private long serviceId;
	private String serviceCode;
	private String broadNetworkAccess;
	private boolean onAnsibleMode;
	private boolean selfServiceMode;
	private String resourcePooling;
	private String contentDeliveryNetwork;
	private String physicalServerCount;
	private String virtualServerAccess;
	private String valueProposition;
	private String costReductionsPattern;

	public GlobalPodmanResources() {

	}

	public GlobalPodmanResources(long serviceId, String serviceCode, String broadNetworkAccess, boolean onAnsibleMode,
			boolean selfServiceMode, String resourcePooling, String contentDeliveryNetwork, String physicalServerCount,
			String virtualServerAccess, String valueProposition, String costReductionsPattern) {
		super();
		this.serviceId = serviceId;
		this.serviceCode = serviceCode;
		this.broadNetworkAccess = broadNetworkAccess;
		this.onAnsibleMode = onAnsibleMode;
		this.selfServiceMode = selfServiceMode;
		this.resourcePooling = resourcePooling;
		this.contentDeliveryNetwork = contentDeliveryNetwork;
		this.physicalServerCount = physicalServerCount;
		this.virtualServerAccess = virtualServerAccess;
		this.valueProposition = valueProposition;
		this.costReductionsPattern = costReductionsPattern;
	}

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getBroadNetworkAccess() {
		return broadNetworkAccess;
	}

	public void setBroadNetworkAccess(String broadNetworkAccess) {
		this.broadNetworkAccess = broadNetworkAccess;
	}

	public boolean isOnAnsibleMode() {
		return onAnsibleMode;
	}

	public void setOnAnsibleMode(boolean onAnsibleMode) {
		this.onAnsibleMode = onAnsibleMode;
	}

	public boolean isSelfServiceMode() {
		return selfServiceMode;
	}

	public void setSelfServiceMode(boolean selfServiceMode) {
		this.selfServiceMode = selfServiceMode;
	}

	public String getResourcePooling() {
		return resourcePooling;
	}

	public void setResourcePooling(String resourcePooling) {
		this.resourcePooling = resourcePooling;
	}

	public String getContentDeliveryNetwork() {
		return contentDeliveryNetwork;
	}

	public void setContentDeliveryNetwork(String contentDeliveryNetwork) {
		this.contentDeliveryNetwork = contentDeliveryNetwork;
	}

	public String getPhysicalServerCount() {
		return physicalServerCount;
	}

	public void setPhysicalServerCount(String physicalServerCount) {
		this.physicalServerCount = physicalServerCount;
	}

	public String getVirtualServerAccess() {
		return virtualServerAccess;
	}

	public void setVirtualServerAccess(String virtualServerAccess) {
		this.virtualServerAccess = virtualServerAccess;
	}

	public String getValueProposition() {
		return valueProposition;
	}

	public void setValueProposition(String valueProposition) {
		this.valueProposition = valueProposition;
	}

	public String getCostReductionsPattern() {
		return costReductionsPattern;
	}

	public void setCostReductionsPattern(String costReductionsPattern) {
		this.costReductionsPattern = costReductionsPattern;
	}

}
