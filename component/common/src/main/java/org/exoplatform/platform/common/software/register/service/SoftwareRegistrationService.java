package org.exoplatform.platform.common.software.register.service;

/**
 * Created by The eXo Platform SEA
 * Author : eXoPlatform
 * toannh@exoplatform.com
 * On 9/30/15
 * Software register to Tribe service
 */
public interface SoftwareRegistrationService {
  /**
   * Check has your software registered to Tribe
   * @return boolean value
   */
  public boolean isSoftwareRegistered();

  /**
   * Check is registered and create if not exist
   */
  public void checkSoftwareRegistration();
}
