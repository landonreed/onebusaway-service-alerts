package org.onebusaway.service_alerts.model.beans;

import org.onebusaway.service_alerts.model.AlertDescription;

public class UnresolvedAlertBean extends AbstractAlertBean {

  private AlertDescription fullDescription;

  public AlertDescription getFullDescription() {
    return fullDescription;
  }

  public void setFullDescription(AlertDescription fullDescription) {
    this.fullDescription = fullDescription;
  }
}
